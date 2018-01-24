//Samantha Stinson
//2018
//recreating a bank account

//Importing
import java.util.Scanner;

//create a class
public class BankAccount {

//main statement
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
//create an object
//set the original balance of the account to be $1000
    BankAccount myaccount = new BankAccount(1000);
    //use the deposit 
    myaccount.deposit(50);
    //use the withdraw 
    myaccount.withdraw(25);
    
    //output the following statements
    System.out.println("BankAccount Number: " + myaccount.getNumber());
    System.out.println("Balance: $" + myaccount.getBalance());
  }

  // Since they are different for each account, use the term private
  private double balance;
  private int accountNumber;

  // Since they can be used by all accounts, so it's static, as well, they do NOT change
  private static int lastAccountNumber = 50;
  private static double intrestAmount=0.15;

  // This is a constructor: no return type and has the same name as the class.
  public BankAccount(double intialBalance)
  {
	 //sets the balance
    balance = intialBalance;
    //creates the account number
    accountNumber = lastAccountNumber + 1;
    lastAccountNumber = accountNumber;
  }

  //this is the withdraw, uses boolean
  public boolean withdraw(double withdrawAmount)
  {
    if (withdrawAmount >= balance){    
      System.out.println("Invalid. There is not enough money in the account.");
      return false;
    } else {
      balance -= withdrawAmount;
      //applies the intrest amount for the bank
      balance -= (withdrawAmount)*intrestAmount;
      return true;
    }
  }
  
  //this is the deposit, returns nothing
  public void deposit(double depositAmount)
  {
    balance += depositAmount;
  }

  //this gets the account number and returns it
  public int getNumber()
  {
    return accountNumber;
  }


//this gets the new balance and returns it
  public double getBalance()
  {
    return balance;
  }

}
