package Exception;

class MulException{
	
	void sum(String st,int num) {
		int convernum=0;
		
		try {
			convernum=Integer.parseInt(st);
			
			System.out.println(convernum+num);
		}catch(NumberFormatException numformatexp) {
			System.out.println(numformatexp);
		}
		
		try {
			System.out.println(convernum/num);		
		}
		catch(ArithmeticException arthmeticexp) {
			System.out.println(arthmeticexp);
		}
	}
	
	void callErray(int [] numArray) {
		
		try {
			for(int i=0;i<5;i++) {
				System.out.println(numArray[i]);
			}
		}
			
		catch(ArrayIndexOutOfBoundsException indexBound) {
			System.out.println(indexBound);
		}
		
	}
}

public class MultipleTryCatch {
	public static void main(String [] args) {
		
		MulException multiExcep = new MulException();
		
		multiExcep.sum("r",0);
		int argArray [] = {10,12,15,14};
		multiExcep.callErray(argArray);
		
		
	}

}
