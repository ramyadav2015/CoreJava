package Exception.BankingException;

import java.util.Scanner;

import Exception.InvalidTransactionException;

class Transection extends Exception {
	
	 static double balance;
	 
	public Transection(double balance) {
		this.balance=balance;
	}
	
	static void withdraw(double amount) throws InsufficientFundException,InvalidTransactionException {
		
		if(amount<0) {
			
			throw new InvalidTransactionException();
		}
		
		if(balance<amount) {
			
			throw new InsufficientFundException();
		}
		
		balance -= amount;
	}
		
		public double getBalance() {
			return balance;
		}
		public double addBalance(double amount) {
			balance +=amount;
			return balance;
		}
	
}
public class BankingClass{
	public static void main(String [] args) {
		
		Transection transection = new Transection(2000);
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Press 1 Add Amount And Press 2 Withdraw Amount");
			int number = sc.nextInt();
			
			if(number==2) {
				System.out.println("Enter rupees = ");
				int rupees=sc.nextInt();
				try {
					transection.withdraw(rupees);
				} 
				catch (InvalidTransactionException e) {
					System.err.println(e.getMessage());
				} 
				catch (InsufficientFundException e) {
					System.err.println(e.getMessage());
				}
				System.out.println("Kartik's remaining balance: " + transection.getBalance());
			}
			else if(number==1) {
				System.out.println("Enter rupees = ");
				int rupees=sc.nextInt();
				
				transection.addBalance(rupees);
				
				System.out.println("Are you Withdraw Amount YES or NO ");
				String permision = sc.next();
				
				if(permision.equals("YES")){
					
					System.out.println("Enter rupees = ");
					int rerupees=sc.nextInt();
					try {
						transection.withdraw(rerupees);
					} 
					catch (InvalidTransactionException e) {
						System.err.println(e.getMessage());
					} 
					catch (InsufficientFundException e) {
						System.err.println(e.getMessage());
					}
				}
				else {
					System.out.println("Kartik's remaining balance: " + transection.getBalance());
				}
			}
			
			
	}
}
