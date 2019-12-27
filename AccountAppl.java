package testjava;

public class AccountAppl {

	public static void main(String[] args) {
	 Account account =  new Account(123,"harshu",1459000);
	 Account account1 = new Account();
	 account1.setAccountNumber(123);
	 account1.setCustomerName("harsh");
	 account1.setBalance(1560000);
	 System.out.println(account1.getAccountNumber());
	 System.out.println(account1.getCustomerName());
	 System.out.println(account1.getBalance());
	 System.out.println(account.getAccountNumber());
	 System.out.println(account.getCustomerName());
	 System.out.println(account.getBalance());
	}

}
