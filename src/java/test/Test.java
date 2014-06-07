package test;
import java.io.*;
import java.net.UnknownHostException;
import java.util.Date;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import javax.servlet.http.*;
import javax.servlet.*;
public class Test extends HttpServlet {
	public void doPost( HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException { 
		try { 
			PrintWriter out = res.getWriter(); // HTML output
			MongoClient mongo = new MongoClient("localhost", 12345);
			DB db = mongo.getDB( "tem"); // mongo > db
			DBCollection table = db.getCollection( "user"); // db > table
			BasicDBObject query = new BasicDBObject() // query
			.append( "name", "marat");	// search for key=value
			DBCursor cursor = table.find( query);
			if ( cursor.hasNext()) out.println( cursor.next()); // only first result
		} 
		catch ( MongoException e) { res.getWriter().println( "{ \"error\": \"bad code\"}"); }
		catch ( UnknownHostException e) { System.out.println( "{ \"error\": \"bad code\"}");}
	}
	
}