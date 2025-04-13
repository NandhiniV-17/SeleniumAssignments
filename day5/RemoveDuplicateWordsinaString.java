package week3.day5;


public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		System.out.println("The input text is: " + text);
		int count=0;
		String[] words = text.split(" ");
		System.out.println("The Splited text is { " + String.join(", ", words) + " }");
		for (int i= 0 ; i < words.length ; i ++)
			
		{
			for (int j=i+1; j< words.length ; j++)
			{
				if (words[i].equalsIgnoreCase(words[j]))
				{
					words[j] = "";
					count = count+1;
					
				}
			}
		}
		if (count>0)
			System.out.print("The output text is: " );
			for (int k=0; k< words.length ; k++)
			{
				System.out.print(words[k] + " ");
			}

	}

}
