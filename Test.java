import java.io.*;
import java.util.Date;
import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
public class Test {
	public static void main (String[] args) { 
		try {
			MongoClient mongo = new MongoClient( "localhost", 12345);
			DB db = mongo.getDB( "tem"); // mongo > db
			DBCollection table = db.getCollection( "user"); // db > table
			BasicDBObject query = new BasicDBObject() // query
			.append( "name", "marat");	// search for key=value
			DBCursor cursor = table.find( query);
			if ( cursor.hasNext()) System.out.println( cursor.next().toString()); // only first result
		} 
		catch ( MongoException e) { System.out.println( "{ \"error\": \"bad code\"}"); }
		catch ( UnknownHostException e) { System.out.println( "{ \"error\": \"bad code\"}"); }
	}
		
}