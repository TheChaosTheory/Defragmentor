import java.util.Random;


public class TestSort {

	
	public static void main(String[] args) {
		Random generator = new Random();
		int [] CompletedIDs = new int[100];
		for(int i = 0; i<100; i++){
			CompletedIDs[i] = generator.nextInt(101);
		}
		
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
		
		for(int i = 0; i<100; i++){
			System.out.println(CompletedIDs[i]);
		}

	}
	

}
