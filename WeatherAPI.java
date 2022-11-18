
import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import org.json.simple;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WeatherAPI {
   public static final String API_KEY="bb768766fd5f6f62ba656d5a4bf09ffd";
	
   public static final String URL_PREFIX ="https://api.openweathermap.org/data/2.5/weather?q=";

   private JSONObject jsonObject;
   public WeatherAPI(String location){
      String urlString=URL_PREFIX+location+"&appid="+API_KEY+"&units=imperial";
      StringBuilder builder = new StringBuilder();
   	
   	   
      try {
         URL url;
         url = new URL(urlString);
         BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
         String str = "";
         while (null != (str = br.readLine())) {
            builder.append(str + "\n");
         }
         JSONParser jsonParser = new JSONParser(); 
         Object obj = jsonParser.parse(builder.toString());
         jsonObject = (JSONObject)obj;
      	  
                
             
      	  
      	  
      } catch (MalformedURLException e) {
      	// TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
      	// TODO Auto-generated catch block
         e.printStackTrace();
      } catch (ParseException e) {
      	// TODO Auto-generated catch block
         e.printStackTrace();
      }
   	   
   
   
   }
	
   public String getWeather() {
      HashMap<String, String> rates = (HashMap<String, String>)((JSONObject)((JSONArray)jsonObject.get("weather")).get(0));
      return rates.get("main");
   	  
   }

	
   public long getWeatherPressure() {
      HashMap<String, Long> rates = (HashMap<String, Long>) jsonObject.get("main");
      return rates.get("pressure");
   }
		  
   public double getOutsideTemperature() {
      HashMap<String, Double> rates = (HashMap<String, Double>) jsonObject.get("main");
      return rates.get("temp");
   }
	
   public long getWeatherHumidity() {
      HashMap<String, Long> rates = (HashMap<String, Long>) jsonObject.get("main");
      return rates.get("humidity");
   }
   public double getWindSpeed() {
      HashMap<String, Double> rates = (HashMap<String,Double>) jsonObject.get("wind");
      return rates.get("speed");
   }
	 
   public long getWindDegree() {
      HashMap<String, Long> rates = (HashMap<String, Long>) jsonObject.get("wind");
      return rates.get("deg");
   }
	
	
   public double getWindGust() {
      HashMap<String,Double> rates = (HashMap<String,Double>) jsonObject.get("wind");
      return rates.get("gust");
   }

}
