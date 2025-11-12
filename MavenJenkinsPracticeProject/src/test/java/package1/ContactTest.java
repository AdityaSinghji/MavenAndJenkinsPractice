package package1;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups = "smokeTest")
	public void createcontactTest() {
		
		
		String URL = System.getProperty("url","https://flipkart.com");
		String BROWSER = System.getProperty("browser","Chrome");
		String USERNAME = System.getProperty("username","admin");
		String PASSWORD = System.getProperty("password","manager");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Executed createcontactTest");
	}
	
	@Test(groups = "regressionTest")
	public void modifycontactTest() {
		
		String URL = System.getProperty("url","https://flipkart.com");
		String BROWSER = System.getProperty("browser","Chrome");
		String USERNAME = System.getProperty("username","admin");
		String PASSWORD = System.getProperty("password","manager");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Executed modifycontactTest");
	}

}
