//Implement calculator using command line arguments ; +,-*,/

class Calci{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		String operator = args[1];
		int b = Integer.parseInt(args[2]);
		int c;
		
		if(operator.equals("+")){
			c =a+b;
			System.out.println(c);
		}else if(operator.equals("-")){
			c = a-b;
			System.out.println(c);
		}else if(operator.equals("'*'")){
			c = a*b;
			System.out.println(c);
		}else if(operator.equals("/")){
			c =a/b;
			System.out.println(c);
		}else{
			System.out.println("No Operator");
		}
		//System.out.println(c);
	
	}
}