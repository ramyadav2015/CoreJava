package JavaProblems;

public class StringDemo {
	public static void main(String [] args) {
		
		//Swping value
		
		int a=10;
		int b=5;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+"  "+b);
		
System.out.println("**************************************************");
		
		//Reverse String		
		String st="raar";
		
		char cha[]= st.toCharArray();
		
		for(int i=cha.length-1;i>=0;i--) {
			System.out.print(cha[i]);
		}
		
		String str = String. valueOf(cha);
		
		
		
System.out.println("*************************************************");
		
	//palamdrom number

			if(st.equals(str)) {
			System.out.println("String is palumdrom");
		}
		else {
			System.out.println("String is not palumdrom");
		}
			
		
	}

}
