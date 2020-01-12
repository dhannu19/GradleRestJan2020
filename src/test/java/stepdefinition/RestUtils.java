package stepdefinition;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String getFirstName(){
		
	 String generateString = RandomStringUtils.randomAlphabetic(5);
			 return ("John"+generateString);
		
	}
	
	public static String LastName(){
		
		 String generateString = RandomStringUtils.randomAlphabetic(5);
				 return ("Peter"+generateString);
			
		}
		
	
	public static String UserName(){
		
		 String generateString = RandomStringUtils.randomAlphabetic(5);
				 return ("John P"+generateString);
			
		}
		
	
	public static String Password(){
		
		 String generateString = RandomStringUtils.randomAlphabetic(5);
				 return ("Password"+generateString);
			
		}
		
	
	public static String Email(){
		
		 String generateString = RandomStringUtils.randomAlphabetic(5);
				 return ("John"+generateString);
			
		}
		
	
	
	
	
	

}
