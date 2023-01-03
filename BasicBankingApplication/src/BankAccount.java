import java.util.Scanner;

public class BankAccount {

	int balance, previousTransaction;
	String customerName, customerId;
	
	BankAccount(String cname, String cid){
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount) {
		if (amount > 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount > 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		}
		else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		}
		else {
			System.out.println("No transaction occured");
		}
	}
	
	void showMenu() {
		char option = '\0';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is " + customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("---------------------------------------------");
			System.out.println("Enter an option");
			System.out.println("---------------------------------------------");
			option = scan.next().charAt(0);
			System.out.println("\n");
			
			switch(option){
			
			case 'A', 'a':
				System.out.println("---------------------------------------------");
				System.out.println("Balance = " + balance);
				System.out.println("---------------------------------------------");
				System.out.println("\n");
				break;
			
			case 'B', 'b':
				System.out.println("---------------------------------------------");
				System.out.println("Please enter an amount to deposit: ");
				System.out.println("---------------------------------------------");
				int depositAmount = scan.nextInt();
				deposit(depositAmount);
				System.out.println("\n");
				break;
				
			case 'C', 'c':
				System.out.println("---------------------------------------------");
				System.out.println("Please nter an amount to withdraw: ");
				System.out.println("---------------------------------------------");
				int withdrawAmount = scan.nextInt();
				withdraw(withdrawAmount);
				System.out.println("\n");
				break;
				
			case 'D', 'd':
				System.out.println("---------------------------------------------");
			getPreviousTransaction();
				System.out.println("---------------------------------------------");			
				System.out.println("\n");
				break;
				
			case 'E', 'e':
				System.out.println("*************************************************");
				break;
				
				default: 
					System.out.println("Invalid option! Please enter again");
					break;
				
			}
			
		}
		while( option != 'E');
			
		System.out.println("Thank you for using our services, have a great day!");
		
		}
		
		
		
		
	}


