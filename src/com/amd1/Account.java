package com.amd1;

//Creating multiple objects by one type only
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods

class AccountClass {
	int acc_no;
	String name;
	float amount;
	

	// Method to initialize object
	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}

	// deposit method
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited");
	}

	// withdraw method
	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + " withdrawn");
		}
	}

	// method to check the balance of the account
	void checkBalance() {
		System.out.println("Balance is: " + amount);
	}

	// method to display the values of an object
	void display() {
		System.out.println(acc_no + " " + name + " " + amount);
	}
}

public class Account {
	// Creating a test class to deposit and withdraw amount
	public static void main(String[] args) {
		AccountClass a1 = new AccountClass();
		a1.insert(832345, "Muhammed", 3000);
		a1.display();
		a1.checkBalance();
		a1.deposit(40000);
		a1.checkBalance();
		a1.withdraw(15000);
		a1.checkBalance();
	}
}
