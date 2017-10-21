package pkg360.practice;

// Necessary imports
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Practice{

	public static void main(String[] args) throws IOException {

		getURL("https://www.netspend.com/hello"); // call with bad url
                getURL("https://www.lds.org"); // call with good url
		System.out.println("Done."); // tell me when I'm done
	}

	private static void getURL(String address) throws IOException {
                
                // Make new URL object with passed parameter
		URL url = new URL(address);
                
                //This casts the URL connection as an Http connection
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
                
                // This sets the method of connection to GET
		con.setRequestMethod("GET");
                
                // Gets the response code and displays it. This isn't necessary, but is helpful to know what has happened
		int responseCode = con.getResponseCode();
		System.out.println("Response Code: " + responseCode);
                
                // If page isn't found, let me know
                if (responseCode == con.HTTP_NOT_FOUND)
                {
                    System.out.println("Page not found. Sorry.");
                }
                // If the response is rejected, let me know
                else if (responseCode == con.HTTP_FORBIDDEN || responseCode == con.HTTP_UNAUTHORIZED)
                {
                    System.out.println("You don't have permission for that.");
                }
                // If code is OK then proceed with HTML for page
                else if (responseCode == con.HTTP_OK)
                {
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
		}
		
                in.close();

		System.out.println(response.toString());
                }
                // If any other code, just say you don't know what to do
                else
                {
                    System.out.println("We got some other response. Not sure what to do.");
                }
	}
}