import java.util.Scanner;

public class BSTNode<T extends Comparable<T>> {
	//used to hold references to BST node for the linked implementation
	
	
	protected T info; //the info in a BST Node
	protected BSTNode left; //A link to the left child node
	protected BSTNode right; //A link to the right child node
	
	
	//Initializes the node with passed data and sets both children to null
	public BSTNode(T info){
		this.info = info;
		left = null;
		right = null;
	}
	//Sets the info of this node
	public void setInfo(T info)
	{
		this.info = info;
	}
	
	//return info of this node
	public T getInfo(){
		return this.info;
	}
	
	//Sets left link of this node
	public void setLeft(BSTNode link){
		left = link;
	}
	
	//set right link of this node
	public void setRight(BSTNode link){
		right = link;
	}
	
	//returns left link of this node
	public BSTNode getLeft(){
		return left;
	}
	
	//returns right link of this node
	public BSTNode getRight(){
		return right;
	}
	

}
