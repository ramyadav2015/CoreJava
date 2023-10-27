package Exception.BankingException;

public class InvalidTransactionException extends Exception {
	
	public InvalidTransactionException() {
		
		super("Invalid Transaction Please Enter Correct Amount");
	}

}
