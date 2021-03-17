
import java.util.Scanner;
import static java.lang.Math.*; 
class Quad{
	public static void main(String args[]){
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter constant for x^2");
		double a = num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("Enter constant for x");
		double b = num2.nextInt();
		
		Scanner num3 = new Scanner(System.in);
		System.out.println("Enter constant for x^0");
		double c = num3.nextInt();
		
		double d = ((b*b) - (4*a*c));
		double e = ((-b)/(2*a));
		if(d>0){
			double r1 = (-b + Math.pow(d,0.5))/(2*a);;
			
			double r2 = (-b - Math.pow(d,0.5))/(2*a);;
			System.out.println(" Roots are real and distinct. Roots: " +r1 +r2);
			
		}else if( d == 0) {
			System.out.println(" Roots are real and Equal. Root: " +(-e));
			
		}else {
			//d = -d;
			double sqrtval = sqrt(abs(d));  
			System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval); 
		}
		
	}
}