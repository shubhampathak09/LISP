package dp;

public class StringClas {

	
	
	public static void main(String[] args)
	{
		
//		
	//	String s="fitgirlrepackmusic";
		
		
		
		
		int[] a= {5,6,1,2,3,4};
		
		
		int n=a.length;
		
		
		int low=0;
		
		int high=n-1;
		
		
		int ans=-1;
		
		while(low<=high)
		{
			
			int mid=(low+high)/2;
			
			int next=(mid+1)%n;
			int prev=(mid-1+n)%n;
			
			
			if(a[mid]<=next&&a[mid]<=prev)
			{
				ans=mid;
				System.out.println(ans);
				//return;
			}
			
			
			if(a[mid]>a[low])
			{
				low=mid+1;
			}
			
			if(a[mid]<a[high])
			{
				high=mid-1;
			}
			
		}
		System.out.println("The number of times array rotated:-"+ans);
	//	System.out.println(s.substring(0,7));
		
		System.out.println("The Min is.."+a[ans]);
		
	}
}
