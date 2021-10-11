package com.greatlearning.BinaryTreePath;
import java.util.ArrayList;
import com.greatlearning.BinaryTreePath.Node;

public class LongestPathBTree 
{
	 
	public static void main(String[] args)
	{
	    Node root = Node.newNode(100);
	    root.left = Node.newNode(200);
	    root.right = Node.newNode(300);
	    root.left.left = Node.newNode(400);
	    root.left.right = Node.newNode(500);
	    root.left.right.right = Node.newNode(600);
	     
	    ArrayList<Integer> output = Node.longestPath(root);
	    int n = output.size();
	     
	   System.out.print("Longest path "+output.get(n - 1));
	    for(int i = n - 2; i >= 0; i--)
	    {
	        System.out.print(" -> " + output.get(i));
	    }
	}

}
