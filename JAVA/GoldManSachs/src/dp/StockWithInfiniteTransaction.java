package dp;

public class StockWithInfiniteTransaction {

	
	//Scanner scn=new Scanner(System.in);
	
    
	public static void main(String[] args)
	{
	int[] a= {100,180,260,310,40,535,695};
	
	int bd=0;
	int sd=0;
	
	int profit=0;
	
	
	for(int i=1;i<a.length;i++)
	{
		
		
	if(a[i]>=a[i-1])
	{
		sd++;
	}
	else
	{
		profit+=a[sd]-a[bd];
		bd=sd=i;
	}
	}
	
	profit+=a[sd]-a[bd];
	
	System.out.println(profit);
	
	}
}
