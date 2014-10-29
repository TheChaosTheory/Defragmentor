//Chris Mueller, Brian Zhu, Tommy Lazar

public class Sentence implements Comparable<Sentence>{
	
	private boolean[] bits;
	private int ID;
	
	public Sentence(int newID){
		ID = newID;
		bits = new boolean[65536];
		for(int i = 0; i<bits.length; i++){
			bits[i] = false;
		}
	}
	
	public Sentence(int newID, int newSize){
		ID = newID;
		bits = new boolean[newSize];
		for(int i = 0; i<bits.length; i++){
			bits[i] = false;
		}
	}
	
	public int returnID(){
		return ID;
	}
	
	public int getLength(){
		return bits.length;
	}
	
	public void resize(int newSize){
		boolean[] temp = new boolean[newSize];
		for(int i = 0; i<newSize; i++){
			temp[i] = bits[i];
		}
		bits = temp;
	}
	
	public void writeFrag(Fragment newFrag){
		if (!newFrag.getMoreFrag()){
			resize(newFrag.getOffset()+newFrag.getFragmentLength());
		}
		for(int i = newFrag.getOffset(); i<(newFrag.getFragmentLength()+newFrag.getOffset());i++){
			bits[i] = true;
		}
	}
	
	public boolean isFinished(){
		for(int i = 0; i<bits.length; i++){
			if (bits[i] == false){
				
				return false;
			}
		}
		return true;
	}
	
	public int compareTo(Sentence other){
		Sentence temp = (Sentence)other;
		if(ID == temp.returnID()){
			return 0;
		}else if(ID > temp.returnID()){
			return -1;
		}
		else if (ID < temp.returnID()){
			return 1;
		}
		else return 0;
	}
	
	public String toString(){
		return (""+ID);
	}
	
	public boolean equals(Object y){
		Sentence temp = (Sentence)y;
		if(toString().equals(temp.toString())){
			return true;
		}
		else
			return false;
	}


}
