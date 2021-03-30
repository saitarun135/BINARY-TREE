
public class MyBinaryTree<T extends Comparable> {
	private MyBinaryNode<T> root;
	
	public void add(T key) {
		this.root=this.addRecursively(root, key);
	}
	
	private MyBinaryNode<T> addRecursively(MyBinaryNode<T> current,T key) {
		if(current==null) return new MyBinaryNode<>(key);
		
		int compareResult=key.compareTo(current.key);
		
		if(compareResult==0) return current;
		
		if(compareResult < 0) {
			current.left=(MyBinaryNode<T>) addRecursively((MyBinaryNode<T>) current.left,key);
					}
		else 
		{
			current.right=(MyBinaryNode<T>) addRecursively((MyBinaryNode<T>) current.right,key);
			
		}
		return current;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}
	
	private int getSizeRecursive(MyBinaryNode<T> current) {
	
		return current== null ? 0:1 +this.getSizeRecursive((MyBinaryNode<T>) current.left)
									+this.getSizeRecursive((MyBinaryNode<T>) current.right);					
	}
	public boolean search(T key) {
        return this.searchRecursively(root, key);
    }

    private boolean searchRecursively(MyBinaryNode<T> current, T key) {
        if (current == null) return false;
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return true;
        if (compareResult < 0) {
            return searchRecursively(current.left, key);
        } else {
            return searchRecursively(current.right, key);
        }
    }
}