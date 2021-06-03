package dp;

import java.util.Arrays;

public class TestSort {
	
	
	public static class Node implements Comparable<Node>
	{
		
		int start;
		int finish;
		
		Node(int start,int finish)
		{
			this.start=start;
			this.finish=finish;
		}
		
		public int compareTo(Node o)
		{
			return this.start-o.start;
		}
		
		
		public String toString()
		{
			return "Start:-> "+this.start+" Finish:-> "+this.finish;
		}
	}
	
	
	public static void main(String[] args)
	{
		
		int n=4;
		
		Node[] no=new Node[n];
		
		 no[0]=new Node(1,2);
		 
		 no[1]=new Node(3,4);
		 
		 no[3]=new Node(5,6);
		 
		 
		// System.out.println(no[0].start);
		 
		 
		 Arrays.sort(no);
		 //Arrays.sort(no);
         		 
		 
	}

}
