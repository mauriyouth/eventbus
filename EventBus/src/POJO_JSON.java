
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.MappingJsonFactory;
import org.codehaus.jackson.map.ObjectMapper;
public class POJO_JSON {
	
	StringWriter sw = new StringWriter();
	StringReader sr ;
	ObjectMapper mapper = new ObjectMapper();
	MappingJsonFactory jsonFactory = new MappingJsonFactory();
	JsonGenerator jsonGenerator; 
	
	public POJO_JSON(){
		try {
			JsonGenerator jsonGenerator = jsonFactory.createJsonGenerator(sw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public Object toObject(String json ){
		try {
			JsonParser jp = new JsonFactory().createJsonParser(json);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 ObjectMapper mapper = new ObjectMapper();
		return mapper;
		}
	
	public String toJSON(Object obj){
		 	try {
				mapper.writeValue(jsonGenerator, obj);
				
				sw.close();
				
				return sw.toString();
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
	   
	}
}
