package songs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class mainClass {

		public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
//
//			File jsonFile = new File("inputfile.json");
//		
//			SongsNS Songs = null; 
//
//		    ObjectMapper mapper = new ObjectMapper(); 
//		    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//
//		    Songs = mapper.readValue(jsonFile, SongsNS.class);
//		    System.out.println(Songs.getName());

			ObjectMapper mapper = new ObjectMapper();

	        Collection<SongsNS> songs = null;
	        try {
	        	
	            songs = mapper.readValue(new File("intputfile.json"), mapper.getTypeFactory().constructCollectionType(List.class, SongsNS.class));
	        } catch (IOException e) {
	            System.out.println("Cannot load data");
	            //e.printStackTrace();
	            return;
	        }
	        //Collections.sort(songs);
	        for (SongsNS song : songs) {
	            System.out.println(song);
	        }

//			JSONObject obj;
//			try {
//				obj = new JSONObject("{interests : [{interestKey:Dogs}, {interestKey:Cats}]}");
//				List<String> list = new ArrayList<String>(); 
//				JSONArray array = obj.getJSONArray("Song"); 
//
//				for(int i = 0 ; i < array.length() ; i++){ 
//					list.add(array.getJSONObject(i).getString("interestKey")); 
//					System.out.println(list.get(i));
//				} 
//			} catch (JSONException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
		  
			
	}

}
