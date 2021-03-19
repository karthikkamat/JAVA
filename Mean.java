
import java.util.Arrays; 
  
public class Mean { 
    public static void main(String[] args) 
    { 
  
        // Get the Array 
        int intArr[] = { 10, 20, 15, 22, 35 };
		float sum = 0;
		float mean;
		for(int i=0;i<intArr.length;i++){
			sum = sum+intArr[i];	
		}
		mean = sum/intArr.length;
		System.out.println(" Mean is:"+mean);
	}	
}  