package classes;

import java.util.List;
/**
 *
 * this class will parse response data behind the main API call
 * as a result, we will be able to render data as needed in views
 */
public class Mapper {
    // offers object to parse
    public offerInfo offerInfo = null;
    public userInfo userInfo = null;
    public offers offers = null;

    public class offerInfo {
        private String siteID = "";
        private String language = "";
        private String currency = "";

        // getters

        public String getSiteID() {
            return siteID;
        }

        public String getLanguage() {
            return language;
        }

        public String getCurrency() {
            return currency;
        }

    };
    // users object to parse
    public class userInfo {
        public String userId="";
        public persona persona = null;

        // getter
        public String getUserId() {
            return userId;
        }
        public class persona{
            public String personaType = "";
            public String getPersonaType(){
                return personaType;
            }
        }
    };
    // offers object to parse
    public class offers {
        public List<Hotel> Hotel = null;

        public class Hotel {
            // definition
            public offerDateRange offerDateRange=null;
            public destination destination = null;
            public hotelInfo hotelInfo = null;
            public hotelUrgencyInfo hotelUrgencyInfo = null;
            public hotelPricingInfo hotelPricingInfo = null;
            public hotelUrls hotelUrls = null;
            public hotelScores hotelScores = null;
            // getters
            public offerDateRange getOfferDateRange() {
                return offerDateRange;
            }

            public destination getDestination() {
                return destination;
            }

            public hotelInfo getHotelInfo() {
                return hotelInfo;
            }

            public hotelUrgencyInfo getHotelUrgencyInfo() {
                return hotelUrgencyInfo;
            }

            public hotelPricingInfo getHotelPricingInfo() {
                return hotelPricingInfo;
            }

            public hotelUrls getHotelUrls() {
                return hotelUrls;
            }

            public hotelScores getHotelScores() {
                return hotelScores;
            }

            public class offerDateRange {

                public List<Integer> travelStartDate = null;
                public List<Integer> travelEndDate = null;
                public Integer lengthOfStay = 0;

                public List<Integer> getTravelStartDate() {
                    return travelStartDate;
                }

                public List<Integer> getTravelEndDate() {
                    return travelEndDate;
                }

                public Integer getLengthOfStay() {
                    return lengthOfStay;
                }
            }

            public class destination {
                // definition
                public String regionID = "";
                public String longName = "";
                public String country = "";
                public String province = "";
                public String city = "";

                // getters
                public String getRegionID() {
                    return regionID;
                }

                public String getLongName() {
                    return longName;
                }

                public String getCountry() {
                    return country;
                }

                public String getProvince() {
                    return province;
                }

                public String getCity() {
                    return city;
                }
            }

            public class hotelInfo {
                // definition
                public String hotelId = "";
                public String hotelName = "";
                public String hotelDestination = "";
                public String hotelDestinationRegionID = "";
                public String hotelLongDestination = "";
                public String hotelStreetAddress = "";
                public String hotelCity = "";
                public String hotelProvince = "";
                public String hotelCountryCode = "";
                public String hotelLocation = "";
                public double hotelLatitude = 0.0;
                public double hotelLongitude = 0.0;
                public String hotelStarRating = "";
                public double hotelGuestReviewRating = 0.0;
                public String travelStartDate = "";
                public String travelEndDate = "";
                public String hotelImageUrl = "";
                public double carPackageScore = 0.0;
                public String description = "";
                public double distanceFromUser = 0.0;
                public String language = "";
                public double movingAverageScore = 0.0;
                public double promotionAmount = 0;
                public String promotionDescription = "";
                public String promotionTag = "";
                public double rawAppealScore = 0.0;
                public Integer relevanceScore = 0;
                public String statusCode = "";
                public String statusDescription = "";
                public boolean carPackage = false;
                public boolean allInclusive = false;

                // getters

                public String getHotelId() {
                    return hotelId;
                }

                public String getHotelName() {
                    return hotelName;
                }

                public String getHotelDestination() {
                    return hotelDestination;
                }

                public String getHotelDestinationRegionID() {
                    return hotelDestinationRegionID;
                }

                public String getHotelLongDestination() {
                    return hotelLongDestination;
                }

                public String getHotelStreetAddress() {
                    return hotelStreetAddress;
                }

                public String getHotelCity() {
                    return hotelCity;
                }

                public String getHotelProvince() {
                    return hotelProvince;
                }

                public String getHotelCountryCode() {
                    return hotelCountryCode;
                }

                public String getHotelLocation() {
                    return hotelLocation;
                }

                public double getHotelLatitude() {
                    return hotelLatitude;
                }

                public double getHotelLongitude() {
                    return hotelLongitude;
                }

                public String getHotelStarRating() {
                    return hotelStarRating;
                }

                public double getHotelGuestReviewRating() {
                    return hotelGuestReviewRating;
                }

                public String getTravelStartDate() {
                    return travelStartDate;
                }

                public String getTravelEndDate() {
                    return travelEndDate;
                }

                public String getHotelImageUrl() {
                    return hotelImageUrl;
                }

                public double getCarPackageScore() {
                    return carPackageScore;
                }

                public String getDescription() {
                    return description;
                }

                public double getDistanceFromUser() {
                    return distanceFromUser;
                }

                public String getLanguage() {
                    return language;
                }

                public double getMovingAverageScore() {
                    return movingAverageScore;
                }

                public double getPromotionAmount() {
                    return promotionAmount;
                }

                public String getPromotionDescription() {
                    return promotionDescription;
                }

                public String getPromotionTag() {
                    return promotionTag;
                }

                public double getRawAppealScore() {
                    return rawAppealScore;
                }

                public Integer getRelevanceScore() {
                    return relevanceScore;
                }

                public String getStatusCode() {
                    return statusCode;
                }

                public String getStatusDescription() {
                    return statusDescription;
                }

                public boolean isCarPackage() {
                    return carPackage;
                }

                public boolean isAllInclusive() {
                    return allInclusive;
                }

            }
            public class hotelUrgencyInfo{
                // definitions
                public Integer airAttachRemainingTime = 0;
                public Integer numberOfPeopleViewing = 0;
                public Integer numberOfPeopleBooked = 0;
                public Integer numberOfRoomsLeft = 0;
                public long lastBookedTime = 0;
                public String almostSoldStatus = "";
                public String link = "";
                public List<String> almostSoldOutRoomTypeInfoCollection = null;
                public boolean airAttachEnabled = false;
                //getters
                public Integer getAirAttachRemainingTime() {
                    return airAttachRemainingTime;
                }

                public Integer getNumberOfPeopleViewing() {
                    return numberOfPeopleViewing;
                }

                public Integer getNumberOfPeopleBooked() {
                    return numberOfPeopleBooked;
                }

                public Integer getNumberOfRoomsLeft() {
                    return numberOfRoomsLeft;
                }

                public long getLastBookedTime() {
                    return lastBookedTime;
                }

                public String getAlmostSoldStatus() {
                    return almostSoldStatus;
                }

                public String getLink() {
                    return link;
                }

                public List<String> getAlmostSoldOutRoomTypeInfoCollection() {
                    return almostSoldOutRoomTypeInfoCollection;
                }

                public boolean isAirAttachEnabled() {
                    return airAttachEnabled;
                }
            }

            public class hotelPricingInfo{

                public double averagePriceValue = 0.0;
                public double totalPriceValue = 0.0;
                public String originalPricePerNight = "";
                public double hotelTotalBaseRate = 0.0;
                public double hotelTotalTaxesAndFees = 0.0;
                public String currency = "";
                public double hotelTotalMandatoryTaxesAndFees = 0.0;
                public double percentSavings = 0;
                public boolean drr = false;
                // getters
                public double getAveragePriceValue() {
                    return averagePriceValue;
                }

                public double getTotalPriceValue() {
                    return totalPriceValue;
                }

                public String getOriginalPricePerNight() {
                    return originalPricePerNight;
                }

                public double getHotelTotalBaseRate() {
                    return hotelTotalBaseRate;
                }

                public double getHotelTotalTaxesAndFees() {
                    return hotelTotalTaxesAndFees;
                }

                public String getCurrency() {
                    return currency;
                }

                public double getHotelTotalMandatoryTaxesAndFees() {
                    return hotelTotalMandatoryTaxesAndFees;
                }

                public double getPercentSavings() {
                    return percentSavings;
                }

                public boolean isDrr() {
                    return drr;
                }

            }

            public class hotelUrls{
                // definition
                public String hotelInfositeUrl = "";
                public String hotelSearchResultUrl = "";
                // getters
                public String getHotelInfositeUrl() {
                    return hotelInfositeUrl;
                }

                public String getHotelSearchResultUrl() {
                    return hotelSearchResultUrl;
                }
            }

            public class hotelScores{

                public double rawAppealScore = 0.0;
                public double movingAverageScore = 0.0;

                public double getRawAppealScore() {
                    return rawAppealScore;
                }

                public double getMovingAverageScore() {
                    return movingAverageScore;
                }
            }
        }
    };
}
