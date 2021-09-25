package question2;

class Transaction
{
   public static double deposit(Account account , double amount)
   {
	   //Must add amount to account object balance and return updated balance.
	   account.setBalance(account.getBalance()+amount);
	   return account.getBalance();
   }
   public   static double withdraw(Account account ,  double amount) throws InsufficientBalanceException
  {
     //if account object balance – amount is less than 5000 then Exception should be thrown.
	   double balance = account.getBalance();
	   
	   try {
		   if (account.validateBalance(balance-amount)) 
			   account.setBalance (balance-amount);
		   else
			   throw new InsufficientBalanceException (balance-amount+" is not sufficient as min Deposit");
	   }catch(Exception e) {System.out.println(e.getMessage());}   
	   
	   return account.getBalance();
  }
}

