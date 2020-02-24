
public class SavingsAccountTest {

	public static void main(String[] args) {
		// Instantiates two SavingsAccount objects and sets to respective value
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);

		// sets the interest rate to 4%
		SavingsAccount.modifyInterestRate(0.04);

		// Prints out the total at 4% interest for 1-12 months
		System.out.println("4% interest\tSaver1\t Saver2");
		for (int i = 0; i < 12; i++) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();

			System.out.printf("Month %d: \t%.2f\t %.2f\n", (i + 1), saver1.getSavingsAccount(),
					saver2.getSavingsAccount());

		}

		// Sets the interest rate to 5%
		SavingsAccount.modifyInterestRate(0.05);

		// Prints out the total at 5% interest for 1-12 months
		System.out.println("\n5% interest\tSaver1\t Saver2");

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.printf("Month 13: \t%.2f\t %.2f\n", saver1.getSavingsAccount(), saver2.getSavingsAccount());
	}

}
