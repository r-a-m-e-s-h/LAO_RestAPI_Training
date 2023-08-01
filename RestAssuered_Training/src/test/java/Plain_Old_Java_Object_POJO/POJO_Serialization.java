package Plain_Old_Java_Object_POJO;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class POJO_Serialization {
	
	
	public static void main(String[] args) throws JsonProcessingException
	{
		Employee employee1 = new  Employee();
		
		employee1.setFirst_name("Tom");
		
		employee1.setLast_name("Smasher");
		
		employee1.setSkills(Arrays.asList("java","selenium"));
		
		
		System.out.println(employee1.getFirst_name());
		System.out.println(employee1.getLast_name());
		System.out.println(employee1.getSkills()+"\n");
		
		System.out.println(" ************************************** ***************************** \n ");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String empjson  = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
		
		System.out.println(empjson);
		
		
		
	}

}
