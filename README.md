##Description
A task assign by Expedia team, this task is about to consume an API that includes filters for Hotel reservations and releated data through requesting different parameters in the API queryString and displaying them on web page, however, this task is required to be done on Java EE, and upload the application on Heroku for review and use.

##Application URI
https://aqueous-coast-36817.herokuapp.com/

##Application Description
The structre of the application is exteremly simple, we are using spark for web server and for templating the views, and we're using apache.http as http client and Gson for parsing JSON objects to java object, below is main workflow

  
  | Main Class  |-----> | URL Builder |------>| Requester |----->|  Object Parsing |----->|  Render View |
  
###Main Classes

We have 3 main classes that are inmported under classes namespace, below are description of these classes

####Mapper
this is representing the main application data model, it includes main data class and sub-classes and getter methods, once the data is fetched from the server, we parse them on this object and use data fetched to render them on the view as required.

####requester
this class is responsible to fetch the data from the API server, however, it includes only 3 data attributes
 * url => required url to hit
 * res => response from target server
 * error => error text if any
 
 and has four methods, and they are:
 
 * getResponse => it get back the response as String to the caller
 * getError => will get back the error as String to the caller
 * hasError => will tell the caller in True/False if error has happened, true meanse error happened
 * execute => will make the http request
 
 ####URLbuilder
 this class is used to build a proper url with required data as queryString to fitch all data required by main class, it contains one method, getURL which will get back built URL from Mapped data passed to constructor

##Views
We have 3 view, index, tour for displaying the results and error, however, we can query only city, from and to as dates to fitch the results, we are using custom autocomplete to get the city names and datepicker to fitch the dates as required.
##Routes
we only have 2 main routes, main index route "/" which whose http method is GET, and index route "/" whose http method post with below data required:
* destinationCity => city name
* minTripStartDate => from date as yy-mm-dd
* maxTripStartDate => to date as yy-mm-dd

###notes
I handeled this out of using any web platform and on this simplicity as this is my first use of java ever and I wanted to get it done on 72 hours limit.
