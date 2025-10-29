//2 pointer
package day29;

public class WaterHeight {

	public static void main(String[] args) {
		int heights[]= {1,8,6,2,5,4,8,3,6};
		
		int max=maxWater(heights);
		
		System.out.println(max);

	}

	private static int maxWater(int[] heights) {
		int left=0;
		int right= heights.length-1;
		int maxArea=0;	//8
		
		while(left<=right)
		{
			int height=Math.min(heights[left], heights[right]);
			int width=right-left;
			int area= height*width; //8
			
			maxArea = Math.max(maxArea, area);
			
			if(heights[left]<heights[right])
				left++;
			else
				right--;
			
		}
		
		return maxArea;
	
	}

}
