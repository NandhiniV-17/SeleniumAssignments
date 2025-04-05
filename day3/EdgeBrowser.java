package week2.day3;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser browser = new Browser();
		String launchedBrowser= browser.launchBrowser("Edge");
		browser.loadUrl();
		System.out.println("Launched Browser: " + launchedBrowser);

	}

}
