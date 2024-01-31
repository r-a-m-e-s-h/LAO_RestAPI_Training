package Plain_Old_Java_Object_POJO;


import java.util.Arrays;

import org.testng.annotations.Test;


public class Employee1 {
	
	@Test
	public static void main(String[] args)
	{
		Employee employee1 = new  Employee();
		
		employee1.setFirst_name("Tom");
		
		employee1.setLast_name("Smasher");
		
		employee1.setSkills(Arrays.asList("java","selenium"));
		
		
		System.out.println(employee1.getFirst_name());
		System.out.println(employee1.getLast_name());
		System.out.println(employee1.getSkills());
		
		
	}

}
