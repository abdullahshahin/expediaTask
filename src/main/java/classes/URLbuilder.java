package classes;
import java.util.Map;
/**
 * This class will parse data on inilization
 * it contains one method, getURL which will get back built URL from Mapped data passed to constructor
 */
public class URLbuilder {
    private String url="https://offersvc.expedia.com/offers/v2/getOffers?";
    private String scenario = "";
    private String page = "";
    private String uid = "";
    private String productType = "";
    private String destinationCity = "";
    private String lengthOfStay = "";
    private String minTripStartDate = "";
    private String maxTripStartDate = "";
    private String minStarRating = "";
    private String maxStarRating = "";
    private String minTotalRate = "";
    private String maxTotalRate = "";
    private String minGuestRating = "";
    private String maxGuestRating = "";

    public URLbuilder(Map<String,String> parameters){
        scenario = "deal-finder";
        page = "foo";
        uid = "foo";
        productType = "Hotel";
        destinationCity = parameters.get("destinationCity");
        lengthOfStay = parameters.get("lengthOfStay");
        minTripStartDate = parameters.get("minTripStartDate");
        maxTripStartDate = parameters.get("maxTripStartDate");
        minStarRating = parameters.get("minStarRating");
        maxStarRating = parameters.get("maxStarRating");
        minTotalRate = parameters.get("minTotalRate");
        maxTotalRate = parameters.get("maxTotalRate");
        minGuestRating = parameters.get("minGuestRating");
        maxGuestRating = parameters.get("maxGuestRating");

        if(scenario != null) {
            url = url + "scenario=" + scenario + "&";
        }
        if(page != null) {
            url = url + "page=" + page + "&";
        }
        if(uid != null) {
            url = url + "uid=" + uid + "&";
        }
        if(productType != null) {
            url = url + "productType=" + productType + "&";
        }
        if(destinationCity != null) {
            url = url + "destinationCity=" + destinationCity + "&";
        }
        if(minTripStartDate != null) {
            url = url + "minTripStartDate=" + minTripStartDate + "&";
        }
        if(maxTripStartDate != null) {
            url = url + "maxTripStartDate=" + maxTripStartDate + "&";
        }
        if(minStarRating != null) {
            url = url + "minStarRating=" + minStarRating + "&";
        }
        if(maxStarRating != null) {
            url = url + "maxStarRating=" + maxStarRating + "&";
        }
        if(minTotalRate != null) {
            url = url + "minTotalRate=" + minTotalRate + "&";
        }
        if(maxTotalRate != null) {
            url = url + "maxTotalRate=" + maxTotalRate + "&";
        }
        if(minGuestRating != null) {
            url = url + "minGuestRating=" + minGuestRating + "&";
        }
        if(maxGuestRating != null) {
            url = url + "maxGuestRating=" + maxGuestRating + "&";
        }
    }

    public String getURL(){
        return url;
    }

}
