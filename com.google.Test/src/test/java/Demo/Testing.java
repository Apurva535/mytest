package Demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Testing {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       System.out.println("hello");
       String url = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
	
		int responseCode = con.getResponseCode();
		System.out.println("Response Code : " + responseCode);
		
		 BufferedReader in = new BufferedReader(
	             new InputStreamReader(con.getInputStream()));
System.out.println(in.readLine());
		 //	     String inputLine;
//	     StringBuffer response = new StringBuffer();
//	     while ((inputLine = in.readLine()) != null) {
//	     	response.append(inputLine);
//	     }
//	     in.close();
	     //print in String
//	     System.out.println(response.toString());
	}

}
