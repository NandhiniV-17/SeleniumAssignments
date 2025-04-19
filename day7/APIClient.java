package week4.day7;

public class APIClient {
	
	public void sendRequest(String endpoint)
	{
		System.out.println("Sending request to endpoint: " + endpoint);
	}
	public void sendRequest (String endpoint, String requestBody, boolean requestStatus) {
		 System.out.println("Sending request to endpoint: " + endpoint);
	        System.out.println("Request body: " + requestBody);
	        if (requestStatus) {
	            System.out.println("Request sent successfully!");
	        } else {
	            System.out.println("Request failed.");
	        }
	}

	public static void main(String[] args) {
		APIClient client = new APIClient();
		client.sendRequest("https://www.facebook.com/");
		client.sendRequest(
	            "https://www.facebook.com/",
	            "{ \"name\": \"Alice\"}",
	            true
	        );

	}

}
