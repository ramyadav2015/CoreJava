package Integer;

public class SumOfIntFloatDouble {
	public static void main(String agrs []) {

	Object num[] = new Object[9];
	
	int inti=0; float flo=0; double doub=0;
	
	num[0]=50;		num[1]=50.50f;		num[2]=11.1111d;
	num[3]=50;		num[4]=25.25f;		num[5]=22.2222d;		
	num[6]=100;		num[7]=25.25f;		num[8]=11.1111d;  
	
		
	
	
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
	}
	
	for(int i=0;i<num.length;i++) {
		
		if(num[i] instanceof Integer) {
			int valint = ((Integer) num[i]).intValue();
			inti+=valint;
		}
		else if(num[i] instanceof Float )  {
			
			float valflo = (float)  ((Float) num[i]).floatValue();
			flo+=valflo;
		}
		else if(num[i] instanceof Double) {
			
			Double valdou = ((Double) num[i]).doubleValue();
			doub+=valdou;
			
		}
		
	}
	
	
	System.out.println("Sum of int value "+inti);
	System.out.println("Sum of float value "+flo);
	System.out.println("Sum of double value "+doub);
	
}
	}
