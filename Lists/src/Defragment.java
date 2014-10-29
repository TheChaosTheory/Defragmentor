//Chris Mueller, Brian Zhu, Tommy Lazar

public class Defragment implements DefragmenterInterface {

	private final int MAXDAT = 65536;
	private ArraySortedList IDList;
	private ArraySortedList CompletedList;
	private int[] CompletedIDs;
	private String jon = "I am a Test";
	public Defragment(){
		IDList = new ArraySortedList();
		CompletedList = new ArraySortedList();
		CompletedIDs = new int[100];
		
	}

	public void addFrag(int id, int offset, int length, boolean more) {
		Fragment tempFrag = new Fragment(id, offset, length, more);
		if (IDList.contains(tempFrag.getid())){
			Sentence tempSentence = (Sentence)IDList.get(tempFrag.getid());
			tempSentence.writeFrag(tempFrag);
			testFinished(tempSentence);
		}
		else if(tempFrag.getMoreFrag()){
			IDList.add(new Sentence(tempFrag.getid(), (tempFrag.getOffset()+tempFrag.getFragmentLength())));
			Sentence tempSentence = (Sentence)IDList.get(tempFrag.getid());
			tempSentence.writeFrag(tempFrag);
			testFinished(tempSentence);
		}
		else{
			IDList.add(new Sentence(tempFrag.getid()));
			Sentence tempSentence = (Sentence)IDList.get(tempFrag.getid());
			tempSentence.writeFrag(tempFrag);
			testFinished(tempSentence);
		}
	}

	public boolean testFinished(Sentence testSentence){
		if(testSentence.isFinished()){
			CompletedList.add(IDList.get(testSentence));
			CompletedIDs[CompletedIDs.length+1] = testSentence.returnID();
			IDList.remove(testSentence);
			return true;
		}
		else return false;
	}

	

	
	public void sortCompletedIDs(){
		boolean finished = false;
		int counter;
		while(!finished){
			counter = 0;
			for(int i = 0; i<CompletedIDs.length-1; i++){
				int temp1 = CompletedIDs[i];
				int temp2 = CompletedIDs[i+1];
				if(temp1>temp2){
					CompletedIDs[i] = temp2;
					
				}
			}
		}
	}
}