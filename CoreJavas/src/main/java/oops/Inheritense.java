package oops;

import java.util.Scanner;

interface Shap{
	public static float par_unit_cost=5f;
	public static float pai = 3.14f;
	
	public float getAria();
	public void getTotalCost();
}

abstract class AbstractShap implements Shap{
	AbstractShap(){
		
	}
	public void getTotalCost() {
		System.out.println(par_unit_cost*getAria());
	}
	
}

class Circle extends AbstractShap{
	int redius;
	Circle(int r){
		
		redius=r;
	}
	
	public float getAria() {
		return pai*redius*redius;
	}
	
}
class Squre extends AbstractShap{
	int arm;
	Squre(int a){
		
		arm=a;
	}
	public float getAria() {
		return arm*arm;
	}
	}

public class Inheritense {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int redius= sc.nextInt();
		int arm = sc.nextInt();
		
		Circle cricle = new Circle(redius);
		Squre squre = new Squre(arm);
		
		
		cricle.getTotalCost();
		squre.getTotalCost();
	}

}
