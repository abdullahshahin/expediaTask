// import application internal classes
import classes.*;
// import web server packages
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
// import hashmap
import java.util.HashMap;
import java.util.Map;
// import templating engine
import static spark.Spark.*;
// import Gson for json object parser
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
// main method
public class Main {
    // class constructor
  public static void main(String[] args) {
    // include port and tempate folder
    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");
    /* all search results go from post to / location
    * it takes main three parameters
    * 1) destinationCity
    * 2) minTripStartDate
    * 3) maxTripStartDate
    *
    * then it will build the url to get required data, and make the http request to fetch the data
    * then we will parse the json object to java object
    * after that, we will render the required page
    * */
    post("/", (request, response) -> {

        try
        {
            // make a variable for all required data to make the filtering
            Map<String, String> body = new HashMap<>();
            // filter spaces in city name
            String city = request.queryParams("destinationCity");
            city = city.replaceAll(" ","%20");
            body.put("destinationCity",city);
            body.put("minTripStartDate",request.queryParams("minTripStartDate"));
            body.put("maxTripStartDate",request.queryParams("maxTripStartDate"));
            // pass the body to urlbuilder to create required url to hit
            URLbuilder builder = new URLbuilder(body);
            //System.err.println(">>>>>>>>>>>>>>"+builder.getURL());
            // fetch the data
            requester req = new requester(builder.getURL());
            req.execute();
            // prepare map for rendering
            Map<String, Object> attributes = new HashMap<>();
            // make sure no error occured
            if(req.hasError()) {
                attributes.put("message","An error has occured, Sorry For that :(");
                return new ModelAndView(attributes, "error.ftl");
            }
            else {
                // parse the object
                Gson gson = new GsonBuilder().create();
                Mapper mapper = gson.fromJson(req.getResponse(), Mapper.class);
                // check if empty response
                if(mapper.offers.Hotel != null){
                    attributes.put("city",request.queryParams("destinationCity"));
                    attributes.put("from",request.queryParams("minTripStartDate"));
                    attributes.put("to",request.queryParams("maxTripStartDate"));
                    attributes.put("hotels",mapper.offers.Hotel);
                    return new ModelAndView(attributes, "tour.ftl");
                }
                else {
                    attributes.put("message","Selected Date and city have no entries in our database.");
                    return new ModelAndView(attributes, "error.ftl");
                }

            }
        }
        catch (Exception ex)
        {
            Map<String, Object> attributes = new HashMap<>();
            System.err.println(ex.getMessage());
            attributes.put("message","internal server error");
            return new ModelAndView(attributes, "error.ftl");
        }

    }, new FreeMarkerEngine());

    // Index page
    get("/", (request, response) -> {
        Map<String, Object> attributes = new HashMap<>();
        return new ModelAndView(attributes, "index.ftl");
    }, new FreeMarkerEngine());

  }
}
