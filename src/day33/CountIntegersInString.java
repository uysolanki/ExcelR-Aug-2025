package day33;

public class CountIntegersInString {

	public static void main(String[] args) {
		String input= "my name is Alice I am 9 years old I have 2 brothers and 1 sister";
		
		String words[]=input.split(" ");
		int counter=0;
		for(String word:words)
		{
//			System.out.println(word);
			
			try
			{
			int n=Integer.parseInt(word);
			counter++;
			}
			catch(NumberFormatException e1)
			{
				
			}
		}
		
		System.out.println("Total Integers are "+counter);

	}

}
