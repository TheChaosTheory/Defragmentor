import java.util.Scanner;

public class Runner
{


	public static void main(String[] args)
	{
		Scanner tokenizer = new Scanner(System.in);
		System.out.println("");
		int id    = -1;
		int offset  = 0;
		int length    = 0;
		boolean more = true;

		Defragment hd = new Defragment();

		if (tokenizer.hasNext())
		{
			id    = tokenizer.nextInt();
			offset  = tokenizer.nextInt();
			length    = tokenizer.nextInt();
		}

		
		
		do{
			
		
				System.out.println();
				hd.addFrag(id, offset, length, more);
				if (tokenizer.hasNext())
				{
					id    = tokenizer.nextInt();
					offset    = tokenizer.nextInt();
					length  = tokenizer.nextInt();
					int temp    = tokenizer.nextInt();
					if(temp == 1)more = true;
					else more = false;
				}
				
			
				System.out.println("Hello My Firends");
	
	}while(tokenizer.hasNext());
		System.out.println(hd);

		
	}
}
