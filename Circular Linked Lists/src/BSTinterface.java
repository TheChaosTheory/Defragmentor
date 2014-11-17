
public interface BSTinterface<T extends Comparable<T>> {
	//used to specify transversal order
	static final int INORDER = 1;
	static final int PREORDER = 2;
	static final int POSTORDER = 3;
	
	boolean isEmpty();
	//Return true if this BST is empty; other, returns false
	
	int size();
	//Return the number of elements on this BST
	
	boolean contain (T element);
	//Returns true if this BST contains an element e such that
	//e.compareTo(element) == 9; otherwise returns false
	
	boolean remove (T element);
	//Removes an element e from this BST such that e.compareTo(element)==0
	//and return true if no such element exists, returns false
	
	T get(T element);
	//returns an element e from this BST such that e.compareTo(element)==0;
	//if no such elements exists returns null
	
	void add(T element);
	//adds element to this BST. the tree remains its BST property
	
	int reset(int orderType);
	//Initializes current position for an iteration through this BST
	//in orderType order. Return current number of nodes in this BST
	
	T getNext(int orderType);
	//Pre-Conditions: The BST is not empty
	//                 The Bst has been reset for orderType
	//                The BST has not been modifies since the most recent reset
	//                The end of orderType iteration has not been reached
	//
	//Returns the element at the current position on this BST for orderType
	//and advances the value of the current position based on the orderType.
}
