
class LogicGates{
	int or_gates(int in1,int in2){
		
		int or_ans;
		or_ans = in1|in2;
		return or_ans;
	}
	
	
	int nor_gates(int in1,int in2){
		
		int nor_ans;
		if(in1 == 0 && in2 == 0){
			nor_ans = 1;
		}else{
			nor_ans = 0;
		}
		
		return nor_ans;
	}
	
	public static void main(String args[]){
		int inp1 = 0;
		int inp2 = 0;
		LogicGates lg = new LogicGates();
		int result_or = lg.or_gates(inp1,inp2);
		int result_nor = lg.nor_gates(inp1,inp2);
		System.out.println("Results of OR Gate :"+result_or);
		System.out.println("Results of NOR Gate :"+result_nor);
	}
}