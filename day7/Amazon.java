package week4.day7;

public class Amazon extends CanaraBank {

	public void cashOnDelivery() {
		System.out.println("cashOnDelivery");
		
	}

	
	public void upiPayments() {
		System.out.println("upiPayments");
		
	}

	
	public void cardPayments() {
		System.out.println("cardPayments");
		
	}

	
	public void internetBanking() {
		System.out.println("internetBanking");
		
	}

	
	public void recordPaymentDetails() {
		System.out.println("recordPaymentDetails");
		
	}
	public static void main(String[] args) {
		Amazon amazonOptions = new Amazon();
		amazonOptions.cashOnDelivery();
		amazonOptions.upiPayments();
		amazonOptions.cardPayments();
		amazonOptions.internetBanking();
		amazonOptions.recordPaymentDetails();
		

	}

}
