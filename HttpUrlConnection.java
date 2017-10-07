package pkg360.practice;

// Necessary imports
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlConnection{

	public static void main(String[] args) throws IOException {

		getURL();
		System.out.println("SUCCESS!");
	}

	private static void getURL() throws IOException {
                
        // Make new URL object
		URL url = new URL("https://www.lds.org");
                
        //This casts the URL connection as an Http connection
		HttpURLConnection c = (HttpURLConnection) url.openConnection();
                
        // This sets the method of connection to GET
		c.setRequestMethod("GET");
                
        // Gets the response code and displays it. This isn't necessary, but is helpful to know what has happened
		int responseCode = c.getResponseCode();
		System.out.println("Response Code: " + responseCode);
                
        // The rest of this is code to print the result of the GET. It will display the HTML of the URL
		BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
		}
		
                in.close();

		System.out.println(response.toString());
	}
}