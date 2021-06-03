package dp;

public class Employee {

	
	static class person
	{
		
		int wt;
		int height;
		int age;
		
		person(int wt,int height,int age)
		{
			this.wt=wt;
			this.height=height;
			this.age=age;
		}
		
		 public String toString(){//overriding the toString() method  
			  return this.age+" "+this.height+" "+this.wt;  
		 
		
	}}
	
	public static void main(String[] args)
	{
		
		person[] persons=new person[4];
		
		persons[0]=new person(75,180,20);
		persons[1]=new person(80,165,32);
		persons[2]=new person(73,167,25);
		
		
		System.out.println(persons);
	}
}
	
