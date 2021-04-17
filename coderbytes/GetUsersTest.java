package coderbytes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class GetUsersTest {
	
	public static List<String> getUserNames(int threshold) {
		StringBuilder result = new StringBuilder();
	     URL url = new URL("https://jsonmock.hackerrank.com/api/article_users?page=<pageNumber>");
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      try (BufferedReader reader = new BufferedReader(
	                  new InputStreamReader(conn.getInputStream()))) {
	          for (String line; (line = reader.readLine()) != null; ) {
	              result.append(line);
	          }
	      }
				
		String jsonString = result.toString(); //assign your JSON String here
		JSONObject obj = new JSONObject(jsonString);
		int total = obj.getJSONObject().getInteger("total");
		List<String> resultArray = new ArrayList<String>();
		JSONArray arr = obj.getJSONArray("data"); // notice that `"posts": [...]`
		for (int i = 0; i < arr.length(); i++) {
		    String name = arr.getJSONObject(i).getString("username");
		    int count = arr.getJSONObject(i).getInteger("submission_count");
		    if (count > threshold) {
		    	resultArray.add(name);
		    }
		}		
				
		return resultArray;
		
	}

}
