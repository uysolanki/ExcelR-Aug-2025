package day12;

public class BinarySearch {
public static void main(String[] args) {
	
	//          first				mid					    last
	//			0		1			2			3			4
	int arr[]= {10,		20,			30,			40,			50};
	int search=21;
	int first=0;
	int last=arr.length-1;
	while(first<=last)
	{
		int mid=(first+last)/2;
		
		if(arr[mid]==search)		//30==40  false
		{
			System.out.println("FOUND");
			break;
		}
		else if(search>arr[mid])   //20>30 false
		{
			first=mid+1;
		}
		else
		{
			last=mid-1;
		}
		
	}	
	if(first>last)
		System.out.println("NOT FOUND");
}
}
