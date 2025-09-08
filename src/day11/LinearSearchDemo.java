package day11;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int arr[]= {10,50,20,40,30}; //this data will work for Linear Search bcoz Linear search sorting ins not compulsory

		int search=41;
		int i;
		int flag=0;		//assume not found
		for(i=0;i<arr.length;i++ )				//i				arr[i]       search		flag
		{										//0             10           40			0
			if(search==arr[i])					//1				50						0			
			{									//2				20						0
				flag=1;	//found					//3				40                      1
				break;
			}
		}
		
		if(flag==1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}

}
