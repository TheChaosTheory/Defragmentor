
public interface IndexListInterface<T> extends ListInterface<T>{
    
	void add(int index, T element); // adds new Element at certain Index
	T set(int index, T element); // removes and returns old object and set index
	int indexOf(T element); // return index of passed object
	T remove(int index); // remove object at certain index
	 
	
}
