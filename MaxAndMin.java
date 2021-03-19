

import java.util.Scanner;
class MaxAndMin{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter 'a'");
		int a = num.nextInt();
		System.out.println("Enter 'b'");
		int b = num.nextInt();
		
		if(a>b){
			System.out.println(" a is maximum");	
		}else{
			System.out.println(" b is maximum");
		}
		
		if(a<b){
			System.out.println(" a is minimum");	
		}else{
			System.out.println(" b is manimum");
		}
	}
}