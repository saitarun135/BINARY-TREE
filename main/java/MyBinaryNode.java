
public class MyBinaryNode<T extends Comparable> {
	T key;
	MyBinaryNode<T> left;
	MyBinaryNode<T> right;
	
	public MyBinaryNode(T key) {
		this.key=key;
		this.left=null;
		this.right=null;
		}
	
}
