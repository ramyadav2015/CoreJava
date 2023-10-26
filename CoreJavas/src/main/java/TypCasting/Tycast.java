package TypCasting;

class A{
	int x;
	
	A(int i){
		x=i;
	}
	
	void showx() {
		System.out.println(x);
	}
}

class B extends A{
	int y;
	
	B(int i,int j){
		super(i);
		y=j;
	}
	
	void showy() {
		System.out.println(y);
		System.out.println(x);
	}
	
}
public class Tycast {
		public static void main(String args[]) {
			A b1 = new A(10);
			b1.showx();
			
			B b2 = new B(50,20);
			b2.showy();
			b2.showx();
			
			A b3 = new B(5,7);
			b3.showx();
			//b3.showy() //not run this is upcasting
			
			//B b4 = new A(2); Cannot cast Parrent Calss
			
			B b4 = (B) b3; 
			b4.showx();
			b4.showy();  //same to case b2
			
			B b5 = b4;
			b5.showx();
			b5.showy();
			
			int a=10;
			System.out.println(++a*10);
			
		}
}
