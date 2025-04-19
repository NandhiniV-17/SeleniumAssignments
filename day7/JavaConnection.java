package week4.day7;

public class JavaConnection implements DatabseConnection{

	public void connect() {
		System.out.println("Connect");
		
	}

	public void disconnect() {
		System.out.println("Diconnect");
		
	}

	public void executeUpdate() {
		System.out.println("executeUpdate");
		
	}
	public static void main(String[] args) {
		JavaConnection javaOptions = new JavaConnection();
		javaOptions.connect();
		javaOptions.disconnect();
		javaOptions.executeUpdate();

	}

}
