//Chris Mueller, Brian Zhu, Tommy Lazar

public class Sentence {
	
	private boolean[] bits;
	int ID;
	
	public Sentence(int newID){
		ID = newID;
		bits = new boolean[65536];
	}
	
	public Sentence(int newID, int newSize){
		ID = newID;
		bits = new boolean[newSize];
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
		if (newFrag.getMoreFrag()){
			resize(newFrag.getOffset()+newFrag.getFragmentLength());
		}
		for(int i = newFrag.getOffset(); i<newFrag.getFragmentLength();i++){
			bits[i] = true;
		}
	}
	
	public boolean isFinished(){
		for(int i = 0; i<bits.length; i++){
			if (bits[1] == false){
				return false;
			}
		}
		return true;
	}
	
	public String toString(){
		return ""+ID;
	}

}
