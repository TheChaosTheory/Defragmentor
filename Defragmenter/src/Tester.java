import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Tester
{
	//TestMain Of Gods Right Hand
	//If This Works I am a god
	//Ouch

	public static void main(String[] args) throws FileNotFoundException
	{
		FileReader file = new FileReader("/Users/Daniel/git/Defragmentor/Defragmenter/Input.txt");
		@SuppressWarnings("resource")
		Scanner tokenizer = new Scanner(file);
		int id    = -1;
		int offset  = 0;
		int length    = 0;
		boolean more = true;

		Defragment hd = new Defragment();

		/*if (tokenizer.hasNext())
		{
			id    = tokenizer.nextInt();
			offset  = tokenizer.nextInt();
			length    = tokenizer.nextInt();
			moreInt = tokenizer.nextInt();
			if(moreInt == )
		}*/



		do{
			id    = tokenizer.nextInt();
			offset    = tokenizer.nextInt();
			length  = tokenizer.nextInt();
			int temp    = tokenizer.nextInt();
			if(temp == 1)more = true;
			else more = false;

			hd.addFrag(id, offset, length, more);

		}while(tokenizer.hasNext());
		//THIS MIGHT WORK
		
		System.out.println(hd);


	}
}

