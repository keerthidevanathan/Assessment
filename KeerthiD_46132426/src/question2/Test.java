package question2;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(4128, "Keerthi",LocalDate.of(2018,5,10), 10000);
		System.out.println("The current balance is "+Transaction.withdraw(account, 4000));
		System.out.println("The current balance is "+Transaction.deposit(account, 4000));
		System.out.println("The current balance is "+Transaction.withdraw(account, 7000));
		
		
	}

}
