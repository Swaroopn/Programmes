package interview;

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

public class MirrorBT
{
	Node root;

	public void inOrder()
	{
		inOrder( root );
	}

	public void inOrder( Node node )
	{
		if ( node == null )
			return;

		inOrder( node.left );
		System.out.print( node.data + " " );
		inOrder( node.right );
	}

	public void mirror()
	{
		root = mirror( root );
	}

	public Node mirror( Node node )
	{
		if ( node == null )
			return node;

		Node left = mirror( node.left );
		Node right = mirror( node.right );

		node.left = right;
		node.right = left;

		return node;
	}

	public static void main( String[] args )
	{
		MirrorBT tree = new MirrorBT();
		tree.root = new Node( 1 );
		tree.root.left = new Node( 2 );
		tree.root.right = new Node( 3 );
		tree.root.left.left = new Node( 4 );
		tree.root.left.right = new Node( 5 );

		tree.inOrder();
		tree.mirror();
		System.out.println(  );
		tree.inOrder();
	}

}
