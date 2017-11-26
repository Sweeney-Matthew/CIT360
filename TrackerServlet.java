import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class TrackerServlet extends HttpServlet {
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
 
      // Set the response MIME type of the response message
      response.setContentType("text/html");
      // Allocate a output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();
	  
	  String radio = request.getParameter("genre");
	  int pages = request.getParameter("bookPages");
 
	if (radio.equals("fiction")) {
      // Write the response message, in an HTML page
      try {
         out.println("<html>");
         out.println("<head><title>Book</title></head>");
         out.println("<body>");
         out.println("<h1>Book</h1>"); 
		 
         // Output page number	 
		 out.println("<p>Page count is: " + pages + "</p>");
		 if (pages <= 150) 
		 {
			out.println("<p>Fiction choice is: Animal Farm");
			out.println("</body></html>");
		 }
		 else {
			out.println("<p>Fiction choice is: 1984");
			out.println("</body></html>");
		 }
      } catch (Exception e)
	  {
		  out.println("<html>");
          out.println("<head><title>Error</title></head>");
		  out.println("<body>");
          out.println("<h1>Something went wrong.</h1>");
		  out.println("<p><a href='http://localhost:9999/tracker'>Please start over.</a></p>");
	  }
	  finally {
         out.close();  // Always close the output writer
      }
   }
   else {
	   try {
         out.println("<html>");
         out.println("<head><title>Book</title></head>");
         out.println("<body>");
         out.println("<h1>Book</h1>"); 
		 
         // Output page number	 
		 out.println("<p>Page count is: " + pages + "</p>");
		 if (pages <= 150) 
		 {
			out.println("<p>Non-fiction choice is: Narrative of the Life of Frederick Douglass ");
			out.println("</body></html>");
		 }
		 else {
			out.println("<p>Non-fiction choice is: The Guns of August");
			out.println("</body></html>");
		 }
      } catch (Exception e)
	  {
		  out.println("<html>");
          out.println("<head><title>Error</title></head>");
		  out.println("<body>");
          out.println("<h1>Something went wrong.</h1>");
		  out.println("<p><a href='http://localhost:9999/tracker'>Please start over.</a></p>");
	  }
	  finally {
         out.close();  // Always close the output writer
      }
   }
}