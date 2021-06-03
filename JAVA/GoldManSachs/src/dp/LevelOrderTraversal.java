package dp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {
	
	
	public static class Node
	{
		
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	public static class Tree
	{
		Node root;
		
	   Tree(int data)
	   {
		   root=new Node(data);
	   }
		
	}
	
	public static void inorder(Node node)
	{
		
		if(node==null)
			return;
		
		inorder(node.left);
		System.out.println(node.data);
	    inorder(node.right);
	}
	
	public static void main(String[] args)
	{
		
		
		 
		
		Tree tree=new Tree(1);
		
		tree.root.left=new Node(3);
		
		tree.root.left=new Node(4);
		
		inorder(tree.root);
		
		Queue<Integer>qu=new LinkedList<>();		
		
		//qu.size()
		//qu.isEmpty()
		
		Stack<Integer>st=new Stack<Integer>();
		st.add(1);
		//ArrayList<ArrayList<Integer>>ar=new ArrayList<ArrayList<Integer>>();
	}
    
	
}
