/*
Create class SavingsAccount. 
Use a static variable annualInterestRate to store the annual interest rate for all account holders. 
Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit. 
Provide method calculateMonthlyInterest to calculate the monthly interest
	by multiplying the savingsBalance by annualInterestRate divided by 12—this interest should be added to savingsBalance. 
Provide a static method modifyInterestRate that sets the annualInterestRate to a new value.
*/

public class SavingsAccount {
	
	public static double annualInterestRate;
	private double savingsBalance; // NEED TO BE INSTANCE VARIABLE

	public SavingsAccount(double balance) {
		this.savingsBalance = balance;
	}
	
	public double getSavingsAccount() {
		return this.savingsBalance;
	}
	
	public static void modifyInterestRate(double newInterest) {
		annualInterestRate = newInterest;
	}
	
	public void calculateMonthlyInterest() {
		double interest =(annualInterestRate * this.savingsBalance) / 12;
		this.savingsBalance += interest;

	}


}
