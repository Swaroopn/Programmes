package com.interview.datastructures;

import java.util.Stack;

public class TreeTraversal
{
	Node root;

	public TreeTraversal()
	{
		this.root = null;
	}

	public void preOrder( Node node )
	{
		if ( node == null )
			return;
		System.out.print( node.item + " " );
		preOrder( node.left );
		preOrder( node.right );

	}

	public void inOrder( Node node )
	{
		if ( node == null )
			return;
		inOrder( node.left );
		System.out.print( node.item + " " );
		inOrder( node.right );
	}

	public static class Node
	{
		int item;
		Node left, right;

		public Node( int item )
		{
			this.item = item;
			this.left = this.right = null;
		}
	}

	public void iterativeInOrder()
	{
		if ( this.root == null )
			return;

		Stack<Node> stack = new Stack<Node>();
		Node node = this.root;
		traverseLeft( node, stack );

		while ( stack.size() > 0 )
		{
			node = stack.pop();
			System.out.print( node.item + " " );
			if ( node.right != null )
			{
				node = node.right;
				traverseLeft( node, stack );
			}
		}
	}

	private void traverseLeft( Node node, Stack<Node> stack )
	{
		while ( node != null )
		{
			stack.push( node );
			node = node.left;
		}
	}

	public int sizeOfTree( Node node )
	{
		if ( node == null )
			return 0;
		else
			return sizeOfTree( node.left ) + 1 + sizeOfTree( node.right );
	}

	public boolean isIdentical( Node a, Node b )
	{
		if ( a == null && b == null )
			return true;

		if ( a != null && b != null )
			return ( ( a.item == b.item ) && isIdentical( a.left, b.left ) && isIdentical( a.right, b.right ) );
		return false;
	}

	public int findDepth( Node root )
	{
		if ( root == null )
			return 0;

		int left = findDepth( root.left );
		int right = findDepth( root.right );

		if ( left > right )
			return left + 1;
		else
			return right + 1;

	}

	public int leafNodes( Node root )
	{
		if ( root == null )
			return 0;
		if ( root.left == null && root.right == null )
			return 1;
		else
			return leafNodes( root.left ) + leafNodes( root.right );
	}

	public static void main( String[] args )
	{
		TreeTraversal bt = new TreeTraversal();
		bt.root = new Node( 10 );
		bt.root.left = new Node( 5 );
		bt.root.right = new Node( 20 );
		bt.root.left.left = new Node( 2 );
		bt.root.left.right = new Node( 7 );

		bt.preOrder( bt.root );
		System.out.println();
		bt.inOrder( bt.root );
		System.out.println();
		bt.iterativeInOrder();
		System.out.println();
		System.out.println( bt.sizeOfTree( bt.root ) );

		TreeTraversal bt2 = new TreeTraversal();
		bt2.root = new Node( 10 );
		bt2.root.left = new Node( 5 );
		bt2.root.right = new Node( 20 );
		bt2.root.left.left = new Node( 2 );
		bt2.root.left.right = new Node( 7 );

		System.out.println( new TreeTraversal().isIdentical( bt.root, bt2.root ) );
		System.out.println( bt.findDepth( bt.root ) );
		System.out.println( bt.leafNodes( bt.root ) );
	}

}
