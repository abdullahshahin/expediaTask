package classes;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


/**
 * request handeler to make http request to outside world
 * includes 3 attributes
 * 1) url => required url to hit
 * 2) res => response from target server
 * 3) error => error text if any
 *
 * includes 4 methods
 * 1) getResponse => it get back the response as String to the caller
 * 2) getError => will get back the error as String to the caller
 * 3) hasError => will tell the caller in True/False if error has happened, true meanse error happened
 * 4) execute => will make the http request
 */
public class requester {
    // url to be used
    private static String url;
    private static String res = null;
    private static String error = null;
    // constructor
    public requester (String httpURL){
        url = httpURL;
    }
    // response method to get back the response as text
    public String getResponse() {
        return res;
    }
    // getter of error
    public String getError(){
        return error;
    }
    // check error method
    public boolean hasError(){
        if(error == null)
            return false;
        else
            return true;
    }

    public static void execute() {

            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(url);
        try {
            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            // Read the contents of an entity and return it as a String.
            String content = EntityUtils.toString(entity);
            res = content;
        } catch (IOException e) {
            error = e.getMessage();
        }
    }
}
