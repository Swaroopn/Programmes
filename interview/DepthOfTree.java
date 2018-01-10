package com.subex.rocps.web.app;

class Node
{
	int data;
	Node left, right;

	public Node( int data )
	{
		this.data = data;
		this.left = this.right = null;
	}
}

public class DepthOfTree
{
	Node root;

	public int findMinDepth()
	{
		return findMinDepth( root );
	}

	public int findMinDepth( Node node )
	{
		if ( node == null )
			return 0;

		if ( node.left == null && node.right == null )
			return 1;

		if ( node.left == null )
			return findMinDepth( node.right ) + 1;

		if ( node.right == null )
			return findMinDepth( node.left ) + 1;

		return Math.min( findMinDepth( node.left ), findMinDepth( node.right ) ) + 1;
	}

	public int findHeight()
	{
		return findHeight( root );
	}

	public int findHeight( Node root )
	{
		if ( root == null )
			return 0;
		return 1 + Math.max( findHeight( root.left ), findHeight( root.right ) );
	}

	public static void main( String[] args )
	{
		DepthOfTree tree = new DepthOfTree();
		tree.root = new Node( 1 );
		tree.root.left = new Node( 2 );
		tree.root.right = new Node( 3 );
		tree.root.left.left = new Node( 4 );
		tree.root.left.right = new Node( 5 );
		tree.root.left.right.right = new Node( 6 );

		System.out.println( tree.findMinDepth() );
		System.out.println( tree.findHeight() );
	}
}
