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
 
      // Write the response message, in an HTML page
      try {
         out.println("<html>");
         out.println("<head><title>Book</title></head>");
         out.println("<body>");
         out.println("<h1>Book</h1>"); 
		 
         // Output page number	 
		 out.println("<p>Page number is: " + request.getParameter("bookPages") + "</p>");
         out.println("</body></html>");
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