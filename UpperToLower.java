//Alter a lowercase to uppercase or viceversa using bitwise operator

import java.util.Scanner;
class UpperToLower{
	public static void main(String args[]){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a word");
		
		String word = myObj.nextLine();
		System.out.println("Word is: " +word);
		
		String z = "";
		char c;
		int n;
		for(int i=0; i<=word.length()-1;i++){
			c = word.charAt(i);
			if(c>=97 && c<=122)
			{
				n = c-32;
				c = (char) n;
			}
			z = z+c;
		}
		System.out.println("\nUpper Case: " + z);
	}
}