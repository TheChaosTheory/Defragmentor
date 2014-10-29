//Chris Mueller, Brian Zhu, Tommy Lazar

public class Defragment{

	private ArraySortedList<Sentence> IDList;
	private ArraySortedList<Sentence> CompletedList;
	private int[] CompletedIDs;
	private int index = 0;

	public Defragment(){
		IDList = new ArraySortedList<Sentence>();
		CompletedList = new ArraySortedList<Sentence>();
		CompletedIDs = new int[100];
	}

	public void addFrag(int id, int offset, int length, boolean more) {
		Fragment tempFrag = new Fragment(id, offset, length, more);
		Sentence x = new Sentence(tempFrag.getid());
		if (IDList.contains(x)){
			Sentence tempSentence = (Sentence)IDList.get(x);
			tempSentence.writeFrag(tempFrag);
			testFinished(tempSentence);
		}
		else if(!tempFrag.getMoreFrag()){
			Sentence tempSentence = new Sentence(tempFrag.getid(), tempFrag.getOffset()+tempFrag.getFragmentLength());
			IDList.add(tempSentence);
			tempSentence.writeFrag(tempFrag);
			testFinished(tempSentence);
		}
		else{
			Sentence tempSentence = new Sentence(tempFrag.getid());
			IDList.add(tempSentence);
			tempSentence.writeFrag(tempFrag);
			testFinished(tempSentence);
		}
	}

	public boolean testFinished(Sentence testSentence){
		if(testSentence.isFinished()){
			CompletedList.add(testSentence);
			CompletedIDs[index] = testSentence.returnID();
			index++;
			IDList.remove(testSentence);
			return true;
		}
		else{
			return false;
		}
	}

	public void sortCompletedIDs(){
		boolean finished = false;
		int counter;
		while(!finished){
			counter = 0;
			for(int i = 0; i<CompletedIDs.length-1; i++){
				int temp1 = CompletedIDs[i];
				int temp2 = CompletedIDs[i+1];
				if(temp1<temp2){
					CompletedIDs[i] = temp2;
					CompletedIDs[i+1] = temp1;
					counter++;
				}
			}
			if(counter==0){
				finished = true;
			}
		}
	}

	public String toString(){
		String output = "";
		sortCompletedIDs();
		for(int i = 0; i<CompletedList.size(); i++){
			if(!(CompletedIDs[i]==0)){
				String tempString = "Packet ";
				Sentence tempSentence = new Sentence(CompletedIDs[i]);
				tempSentence = CompletedList.get(tempSentence);
				tempString += (tempSentence.returnID() + ", ");
				tempString += (tempSentence.getLength() + " bytes\n");
				output = (tempString + output);
			}

		}
		return output;
	}

}
