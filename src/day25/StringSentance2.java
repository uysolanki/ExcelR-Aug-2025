package day25;

public class StringSentance2 {

	public static void main(String[] args) {
		String sentance="my name is Alice I stay in Pune I am doing BCA";
		
		String words[]=sentance.split(" ");
		StringBuffer revWord;
		for(String word:words)
		{
			revWord=new StringBuffer(word).reverse();
			System.out.print(revWord + " ");
		}
		
	}

}

/*
my 2
name 4
is 2
Alice 5
*/