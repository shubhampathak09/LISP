//package dp;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class EmployessUnderManager {
//	
//	private static void findcount(HashMap<String,String>map)
//	{
//		String ceo="";
//		HashMap<String,HashSet<String>>tree=new HashMap<>();
//		
//		for(String emp:map.keySet())
//		{
//		String man=map.get(emp);
//		
//		if(man.equals(emp))
//		{
//			ceo=man;
//		}else
//		{
//			
//		}
//		}
//	}
//	
//	public static void main(String[] args)
//	{
//		
//		Scanner sc=new Scanner(System.in);
//		
//		int n=sc.nextInt();
//		
//		HashMap<String,String>hm=new HashMap<>();
//		
//		for(int i=0;i<n;i++)
//		{
//			
//			hm.put(sc.next(),sc.next());
//		}
//		
//		
//		//findcount(map);
//	}
//
//}
