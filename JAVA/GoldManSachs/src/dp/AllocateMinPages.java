package dp;

public class AllocateMinPages {

	
	
	public static boolean isvalid(int[] a,int n,int mx,int k)
	{
		
		int count=1;
		
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			
			sum=sum+a[i];
			if(sum>mx)
			{
				count=count+1;
				sum=a[i];
			}
			if(count>k)
				return false;
		}
		return true;
	 
	}
	
	public static void main(String[] args)
	{
		
		
		int[] a= {12,34,67,90};
		
		int n=a.length;
		
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		
		int st=1;
		int end=sum;
		
		int result=-1;
		
		int k=2;
		
		while(st<=end)
		{
			
			int mid=(st+end)/2;
			
			
			if(isvalid(a,n,mid,k)==true)
			{
				result=mid;
				
				end=mid-1;
			}
			else
			{
				st=mid+1;
			}
		}
		
		System.out.println(result);
	}
	

	
}
