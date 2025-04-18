package week3.day6;

public class ExecutionClass extends Button{

	public static void main(String[] args) {
		// Base WebElement
        WebElement element = new WebElement();
        element.click();
        element.setText("Hello");

        System.out.println("--------------------------");

        // Button 
        Button button = new Button();
        button.click();        button.submit();
        System.out.println("--------------------------");

        // TextField
        TextField textField = new TextField();
        textField.setText("User input");
        textField.getText();
        System.out.println("--------------------------");

        // CheckBoxButton
        CheckBoxButton checkBox = new CheckBoxButton();
        checkBox.click(); 
        checkBox.submit(); 
        checkBox.clickCheckButton(); 

        System.out.println("--------------------------");

        // RadioButton 
        RadioButton radioButton = new RadioButton();
        radioButton.click(); 
        radioButton.submit(); 
        radioButton.SelectRadioButton(); 

	}

}
