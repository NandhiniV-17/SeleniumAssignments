package week3.day6;

class Main {

	public static void main(String[] args) {
		// Object of superclass
        TestData testData = new TestData();
        testData.enterCredentials();
        testData.navigateToHomePage();

        System.out.println("--------------------");

        // Object of subclass
        LoginTestData loginTestData = new LoginTestData();
        loginTestData.enterCredentials();     // Inherited from TestData
        loginTestData.navigateToHomePage();   // Inherited from TestData
        loginTestData.enterUsername();        // Defined in LoginTestData
        loginTestData.enterPassword();        // Defined in LoginTestData
	}

}
