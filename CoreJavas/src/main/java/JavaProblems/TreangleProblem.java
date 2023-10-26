package JavaProblems;

public class TreangleProblem {
	public static void main(String [] args) {
		
		for(int i=0;i<5;i++) {
			
			for(int k=5;k>i;k--) {
				System.out.print(" ");
			}			
			for(int j=0;j<i+1;j++) {
				
			System.out.print("*");
			}
			
			for(int l=0;l<i;l++) {
				System.out.print("*");
			}					
			
			System.out.println(" ");				
		}
		
for(int i=0;i<5;i++) {
			
			for(int k=0;k<=i+1;k++) {
				System.out.print(" ");
			}			
			for(int j=i;j<3;j++) {
				
			System.out.print("*");
			}
			
			for(int l=4;l>i;l--) {
				System.out.print("*");
			}					
			
			System.out.println(" ");				
		}
	}

}
