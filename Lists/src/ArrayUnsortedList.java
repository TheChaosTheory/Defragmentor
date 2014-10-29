
public class ArrayUnsortedList<T> implements ListInterface<T> {

	protected final int DEFAULTCAP = 100;
	protected int origcap;
	protected int numElements = 0;
	protected T[] list;
	protected int location = 0;
	protected boolean found;
	protected int currentPos;
	
	@SuppressWarnings("unchecked")
	public ArrayUnsortedList(){
		list = ((T[])new Object[DEFAULTCAP]);
		origcap = DEFAULTCAP;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayUnsortedList(int i){
		origcap = i;
		list = ((T[])new Object[i]);
	}
	
	public int size() {
		
		return origcap - numElements;
	}
	protected void enlarge(){
		@SuppressWarnings("unchecked")
		T[] larger =  ((T[])new Object[numElements+1]);
		for(int i = 0; i>size();i++){
			larger[i] = list[i];
		}
		list = larger;
	}

	public void add(T element) {
		if(size() >= list.length){
			enlarge();
		}
		list[size()] = element;
		numElements ++;
		
	}

	public boolean remove(T element) {
		find(element);
		if(found){
			list[location] = list[numElements -1];
			list[numElements -1 ]= null;
			numElements=-1;
		}
		return found;
	}

	public boolean contains(T element) {
		find(element);
		return found;
		
	}
	
	protected void find(T target){
		location = 0;
		found = false;
		while(location < numElements){
			if(list[location].equals(target)){
				found = true;
				return;
			}
			else
				location ++;
		}
		found = false;
	}

	public T get(T element) {
		find(element);
		if(found){
			return list[location];
		}
		else return null;
	}

	public void reset() {
		currentPos = 0;		
	}

	public T getNext() {
		T bob = list[currentPos];
		if(currentPos == numElements-1){
			reset();
		}
		else currentPos ++;
		return bob;
		
	}

}
