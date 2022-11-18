import java.util.Scanner;

public class WeatherTest {
	public static void main(String[] args) {
		
		WeatherAPI currentAPI = new WeatherAPI("Bellevue");
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Weather211! ");
		
		System.out.println("Input a city name: ");

		String s=sc.nextLine();
		if (s.equals("Bellevue")) {

		System.out.println("Select one:\n 1.Weather \n 2.pressure\n 3.Temperature\n 4.Humidity\n 5.Wind Speed\n 6.Wind Degree\n 7. Wind Gust"); 
		}
		else
		{
			  System.out.println("Error");
		}
	
		
		
		 String input = sc.nextLine();
		 if (input.equals("1")) {
			 System.out.println(currentAPI.getWeather());
		 }
		 else if (input.equals("2")) {
			System.out.print("City:Bellevue\nCurrent Weather Pressure: ");
            System.out.println(currentAPI.getWeatherPressure());
        }
		
		else if (input.equals("3")) {
			System.out.print("City:Bellevue\nCurrent Temperature: ");
            System.out.print(currentAPI.getOutsideTemperature());
            System.out.println(" \u00B0"+"F");
        }
		
		else if (input.equals("4")) {
			System.out.print("City:Bellevue\nCurrent Humidity: ");
			System.out.println(currentAPI.getWeatherHumidity());
        }
		
		else if (input.equals("5")) {
			System.out.print("City:Bellevue\nCurrent Wind Speed: ");
			System.out.println(currentAPI.getWindSpeed());
        }
		else if (input.equals("6")) {
			System.out.print("City:Bellevue\nCurrent Wind Degree: ");
            System.out.println(currentAPI.getWindDegree());
        }
		
		else if (input.equals("7")) {
			System.out.print("City:Bellevue\nCurrent Wind Gust: ");
			System.out.println(currentAPI.getWindGust());
        }
		else {
			
			  System.out.println("Error");
		}
		
		
		
		
		
		
	
	
	}

}
