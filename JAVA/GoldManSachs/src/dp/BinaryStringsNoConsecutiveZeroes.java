package dp;

public class BinaryStringsNoConsecutiveZeroes {
	
	
	public static void main(String[] args)
	{
	
		
		int count1=1;
		int count0=1;
		
		int n=2;
		
		
		for(int i=1;i<n;i++)
		{
			
			int newcount1=count1+count0;
			int newcount0=count1;
			
			count1=newcount1;
			count0=newcount0;
		}
		
		 System.out.println(count1+count0);
		
	}

}
