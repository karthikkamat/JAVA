//Converting decimal to binary number

import java.util.Scanner;
class DecToBinary{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int number = num.nextInt();
		int binary[] = new int[40];
		int i=0;
		while(number>0){
			binary[i++]=(number%2);
			number = number/2;
		}
		for(int j= i-1;i>=0;i--){
			System.out.print(binary[i]);
		}
		
		
		
	}
}