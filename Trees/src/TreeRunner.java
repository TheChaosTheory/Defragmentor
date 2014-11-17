import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TreeRunner {
	
	public static void main(String [] args) throws FileNotFoundException{
	
	
		Scanner s = new Scanner(System.in);
		String file = s.nextLine();
		FileReader fif = new FileReader(file);
		Scanner tokenizer  =  new Scanner(fif);
	
		int[] alphabet = new int[26];
		
		for(int i=97;i<97+26;i++){
			alphabet[i-97]= i;
		}
		
		int[] count = new int[26];
		
		for(int i = 0;
				i <26;i++){
			count[i]= 0;
		}
		
		String input;
		
		do{
			input = tokenizer.next();
			for(int i = 0; i < input.length();i++){
				if((input.charAt(i)>96)&&(input.charAt(i)<123))
				count[input.charAt(i)-97] ++;
			
			}
		}while(tokenizer.hasNext());
		for(int i = 0; i<26;i++)System.out.println((char) alphabet[i]+" : "+count[i]);
	}
}	
