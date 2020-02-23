/*
 */
public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(0.04);
		
		System.out.println("\t\tSaver1\tSaver2");
		for(int i = 0; i < 12; i ++) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			
			System.out.println("Month " + (i + 1) + ": " + String.format("\t%.2f", saver1.getSavingsAccount()) + " " + String.format("%.2f", saver2.getSavingsAccount()));
		}
		SavingsAccount.modifyInterestRate(0.05);
		System.out.println("\t\tSaver1\tSaver2");
		for(int i = 0; i < 12; i ++) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			
			System.out.println("Month " + (i + 1) + ": " + String.format("\t%.2f", saver1.getSavingsAccount()) + " " + String.format("%.2f", saver2.getSavingsAccount()));
		}
		
	}
}
