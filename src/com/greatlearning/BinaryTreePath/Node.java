package com.greatlearning.BinaryTreePath;

import java.util.ArrayList;

public class Node 
{
    Node left;
    Node right;
    int data;
	static Node newNode(int data)
	{
	    Node temp = new Node();
	 
	    temp.data = data;
	    temp.left = null;
	    temp.right = null;
	 
	    return temp;
	}
	 
	public static ArrayList<Integer> longestPath(Node root)
	{
	     

	    if(root == null)
	    {
	        ArrayList<Integer> output = new ArrayList<>();
	        return output;
	    }
	    ArrayList<Integer> right = longestPath(root.right);
	    ArrayList<Integer> left = longestPath(root.left);

	    if(right.size() < left.size())
	    {
	        left.add(root.data);
	    }
	    else
	    {
	        right.add(root.data);
	    }
	     
	    return (left.size() >
	            right.size() ? left :right);
	}


}
