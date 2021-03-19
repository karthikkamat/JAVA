
class SumIsEight{
	public static void main(String args[]){
		for(int i=0;i<1000;i++){
			int num = i;
			int sum = 0;
			while(num>0){
				int digit = num%10;
				sum = sum + digit;
				num = num/10;
				//System.out.println("num:"+num);				
			}
	
			if( sum == 8){
				System.out.println("The sum of number/s "+i +" is 8 ");
			}
		}
	}
}