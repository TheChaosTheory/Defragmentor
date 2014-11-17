
public class BinarySearchTree<T extends Comparable<T>> implements BSTinterface<T> {

	
	protected BSTNode root; // reference to the root of this BST
	
	private int recSize(BSTNode<T> root){
		if(root == null)
			return 0;
		return 1 + recSize(root.getLeft()) + recSize(root.getLeft());
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contain(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int reset(int orderType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T getNext(int orderType) {
		// TODO Auto-generated method stub
		return null;
	}

}
