import java.util.Scanner;
import java.lang.Math;
class SquareRoot{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = obj.nextInt();
		System.out.println("The square of a number is "+(Math.pow(num,0.5)));
	}
}