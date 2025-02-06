package Tasks2;

import java.util.Scanner;

public class Account {
	double balance = 10000;
	double deposit, withdraw;
	
	public Account() {
	System.out.println("Default Constructor");
	}
	
	
	public Account(double deposit, double withdraw) {
		this.deposit = deposit;
		this.withdraw = withdraw;	
	}

	void getDeposit(){
		balance +=deposit;
		System.out.println("The amount to be deposited is: " +deposit);
		System.out.println("Your total Balance is " +balance);
		
	}
	
	void getWithdraw() {
		balance -=withdraw;
		System.out.println("The amount to be withdraw is: " +withdraw);
		System.out.println("Your total Balance is " +balance);
	}
	
	void getBalance() {
		System.out.println("The Balance amout is: " +balance);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account obj=new Account();
		Account obj1=new Account(5000,2000);
		
		System.out.println("Select number from the following:");
		System.out.println("1. Deposit Money 2. Withdraw Money 3. Check Balance");
		
		int option = sc.nextInt();
		
		if(option==1) {
			obj1.getDeposit();
		} else if(option==2) {
		obj1.getWithdraw();
		} else if(option==3) {
		obj1.getBalance();
		}
	}
}
