package package2;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test(groups = "smokeTest")
	public void createOrgTest() {
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Executed createOrgTest");
	}
	
	@Test(groups = "regressionTest")
	public void modifyOrgTest() {
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Executed modifyOrgTest");
	}

}
