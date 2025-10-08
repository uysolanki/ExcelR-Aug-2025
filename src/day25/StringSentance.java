package day25;

public class StringSentance {

	public static void main(String[] args) {
		String sentance="my name is Alice I stay in Pune I am doing BCA";
		//option 1
		int counter=0;
		for(int i=0;i<sentance.length();i++)
		{
			if(sentance.charAt(i)==' ')
			{
				counter++;
			}
		}
		
		System.out.println("Number of words " + (++counter));

		
		//option 2
		String words[]=sentance.split(" ");
		int NumberOfWords=words.length;
		System.out.println("Number of words are " +NumberOfWords);
		
		
		//option 3
		System.out.println("Number of words are : " +sentance.split(" ").length);
	}

}
