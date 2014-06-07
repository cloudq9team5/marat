package test;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class Test extends HttpServlet {
	public void doPost( HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.println( "{ \"name\": \"marat\", \"age\": 37}");
		out.close();
	}
	
}