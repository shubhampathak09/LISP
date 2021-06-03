package dp;

public class InorderTraversal {

public static class node
{
	
	int data;
	node left;
	node right;
	
	node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;		
	}
	
}

public static class BinaryTree
{
	
	node root;
	BinaryTree(){
		root=null;
	}
	
}

public static void inorder(node root)
{
	if(root==null)
		return;
	
	inorder(root.left);
	System.out.println(root.data);
	inorder(root.right);
	
	
}


public static void main(String[] args)
{
	
	BinaryTree tree=new BinaryTree();
	
	tree.root=new node(1);
	
	tree.root.left=new node(2);
	
	tree.root.right=new node(3);
	
	
	inorder(tree.root);
	
	//cool
	
}

}
