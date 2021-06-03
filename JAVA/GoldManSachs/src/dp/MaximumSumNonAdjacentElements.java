package dp;

public class MaximumSumNonAdjacentElements {

	
	public static void main(String[] args)
	{
		
		
		int[] arr= {5,5,10,100,10,5};
		int n=arr.length;
		
		int inc=arr[0];
		int exc=0;
		
		for(int i=1;i<n;i++)
		{
			
			
		int newinc=exc+arr[i];
		int	newexc=Math.max(exc, inc);
			
		inc=newinc;
		exc=newexc;
		}
		
		System.out.println(Math.max(inc, exc));
	}
	
}
