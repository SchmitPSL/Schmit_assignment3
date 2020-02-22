import java.security.SecureRandom;
import java.util.Scanner;

/*
 * The program shall generate random numbers with a SecureRandom object
The program shall ask the student to enter a difficulty level of 1, 2, 3, or 4
A difficulty level of 1 shall limit random numbers to the range of 0-9, inclusive
A difficulty level of 2 shall limit random numbers to the range of 0-99, inclusive
A difficulty level of 3 shall limit random numbers to the range of 0-999, inclusive
A difficulty level of 4 shall limit random numbers to the range of 0-9999, inclusive
The program shall ask the student to enter a problem type of 1, 2, 3, 4, or 5 with an appropriate human-readable label
The program shall ask the student to solve 10 different problems, as determined by the problem type
A problem type of 1 shall limit the program to generating only addition problems
A problem type of 2 shall limit the program to generating only multiplication problems
A problem type of 3 shall limit the program to generating only subtraction problems
A problem type of 4 shall limit the program to generating only division problems
A problem type of 5 shall result questions that are a randomly mixture of addition, multiplication, subtraction, and division problems
Problems shall contain two numbers sampled from a uniform random distribution with bounds determined by the problem difficulty
The program shall display a random positive message if the student provides a correct response
The program shall display a random negative message if the student provides an incorrect response
The program shall display the student's score after the student has attempted to solve 10 problems
The student's score shall be the percentage of problems correctly solved
The program shall display the message "Please ask your teacher for extra help." if the student's score is less than 75%
The program shall display the message "Congratulations, you are ready to go to the next level!" if the student's score is greater than or equal to 75%
The program shall ask the student if they want to solve a new problem set after the score message has been displayed
The program shall restart when the student agrees to solve a new problem set
The program shall terminate when the student declines to solve another problem set
Create a method called "quiz" that contains the program logic
Create a method called "readDifficulty" that reads the difficulty level from the student
Create a method called "readProblemType" that reads the difficulty level from the student
Create a method called "generateQuestionArgument" that uses the difficulty level to generate a random number
Create a method called "askQuestion" that prints the problem to the screen
Create a method called "readResponse" that reads the answer from the student
Create a method called "isAsnwerCorrect" that checks to see if the student's answer matches the correct answer to the problem
Create a method called "displayCorrectResponse" that prints out the response when a student enters a correct answer
Create a method called "displayInorrectResponse" that prints out the response when a student enters an incorrect answer
Create a method called "displayCompletionMessage" that prints out the studen't score and appropriate score response
Create a main method that runs your program by calling the "quiz" method
 */
public class CAI5 {
	private static SecureRandom rand = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	private static int rand_val1;
	private static int rand_val2;
	private static int correct;
	private static int incorrect;
	private static int difficulty;
	private static int problem;
	private static int randval;

	public static void main(String[] args) {
		quiz();

	}

	private static void setCorrectIncorrect() {
		correct = 0;
		incorrect = 0;
	}

	private static int getgenRandomNum1() {
		return rand_val1;
	}

	private static int getgenRandomNum2() {
		return rand_val2;
	}

	public static void quiz() {
		setCorrectIncorrect();
		System.out.println("Choose a difficulty for multiplication:\n" + "1. Numbers between 0 - 9\n"
				+ "2. Numbers between 0 - 99\n" + "3. Numbers between 0 - 999\n" + "4. Numbers between 0 - 9999");
		readDifficulty();
		
		System.out.println("Choose a what kind of problems:\n" + "1. Addition\n" + "2. Multiplication\n"
				+ "3. Subtraction\n" + "4. Division\n" + "5. Mix of all 4");
		readProblemType();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Question " + i);
			generateQuestionArgument();
			askQuestion();
		}
		displayCompletionMessage();
	}

	private static void readDifficulty() {
		difficulty = input.nextInt();
	}

	private static void readProblemType() {
		problem = input.nextInt();
	}

	private static void generateQuestionArgument() {
		switch (difficulty) {
		case 1:
			rand_val1 = rand.nextInt(10);
			rand_val2 = rand.nextInt(10);
			if ((problem == 4 || randval == 4) && rand_val2 == 0) {
				generateQuestionArgument();
			}
			break;
		case 2:
			rand_val1 = rand.nextInt(100);
			rand_val2 = rand.nextInt(100);
			if ((problem == 4 || randval == 4) && rand_val2 == 0) {
				generateQuestionArgument();
			}
			break;
		case 3:
			rand_val1 = rand.nextInt(1000);
			rand_val2 = rand.nextInt(1000);
			if ((problem == 4 || randval == 4) && rand_val2 == 0) {
				generateQuestionArgument();
			}
			break;
		case 4:
			rand_val1 = rand.nextInt(10000);
			rand_val2 = rand.nextInt(10000);
			if ((problem == 4 || randval == 4) && rand_val2 == 0) {
				generateQuestionArgument();
			}
			break;

		}
	}

	public static void askQuestion() {
		switch (problem) {
		case 1:
			System.out.println("What is " + getgenRandomNum1() + " plus " + getgenRandomNum2());
			break;
		case 2:
			System.out.println("What is " + getgenRandomNum1() + " times " + getgenRandomNum2());
			break;
		case 3:
			System.out.println("What is " + getgenRandomNum1() + " subtract " + getgenRandomNum2());
			break;
		case 4:
			System.out.println(
					"What is " + getgenRandomNum1() + " divide " + getgenRandomNum2() + " (round to whole number)");
			break;
		case 5:
			randval = rand.nextInt(4) + 1;
			switch (randval) {
			case 1:
				System.out.println("What is " + getgenRandomNum1() + " plus " + getgenRandomNum2());
				break;
			case 2:
				System.out.println("What is " + getgenRandomNum1() + " times " + getgenRandomNum2());
				break;
			case 3:
				System.out.println("What is " + getgenRandomNum1() + " subtract " + getgenRandomNum2());
				break;
			case 4:
				System.out.println("What is " + getgenRandomNum1() + " divide " + getgenRandomNum2() + " (round to whole number)");
				break;
			}

		}
		readResponse();
	}

	public static void readResponse() {
		int answer = input.nextInt();
		isAnserCorrect(answer);

	}

	public static void isAnserCorrect(int val) {
		switch (problem) {
		case 1:
			if (val == (getgenRandomNum1() + getgenRandomNum2())) {
				displayCorrectResponse();
				correct++;
			}
			if (val != (getgenRandomNum1() + getgenRandomNum2())) {
				displayInorrectResponse();
				incorrect++;
			}
			break;
		case 2:
			if (val == (getgenRandomNum1() * getgenRandomNum2())) {
				displayCorrectResponse();
				correct++;
			}
			if (val != (getgenRandomNum1() * getgenRandomNum2())) {
				displayInorrectResponse();
				incorrect++;
			}
			break;
		case 3:
			if (val == (getgenRandomNum1() - getgenRandomNum2())) {
				displayCorrectResponse();
				correct++;
			}
			if (val != (getgenRandomNum1() - getgenRandomNum2())) {
				displayInorrectResponse();
				incorrect++;
			}
			break;
		case 4:
			if (val == (getgenRandomNum1() / getgenRandomNum2())) {
				displayCorrectResponse();
				correct++;
			}
			if (val != (getgenRandomNum1() / getgenRandomNum2())) {
				displayInorrectResponse();
				incorrect++;
			}
			break;
		case 5:
			if (randval == 1) {
				if (val == (getgenRandomNum1() + getgenRandomNum2())) {
					displayCorrectResponse();
					correct++;
				}
				if (val != (getgenRandomNum1() + getgenRandomNum2())) {
					displayInorrectResponse();
					incorrect++;
				}
				break;
			} 
			else if (randval == 2) {
				if (val == (getgenRandomNum1() * getgenRandomNum2())) {
					displayCorrectResponse();
					correct++;
				}
				if (val != (getgenRandomNum1() * getgenRandomNum2())) {
					displayInorrectResponse();
					incorrect++;
				}
				break;
			} 
			else if (randval == 3) {
				if (val == (getgenRandomNum1() - getgenRandomNum2())) {
					displayCorrectResponse();
					correct++;
				}
				if (val != (getgenRandomNum1() - getgenRandomNum2())) {
					displayInorrectResponse();
					incorrect++;
				}
				break;
			} 
			else if (randval == 4) {
				if (val == (getgenRandomNum1() / getgenRandomNum2())) {
					displayCorrectResponse();
					correct++;
				}
				if (val != (getgenRandomNum1() / getgenRandomNum2())) {
					displayInorrectResponse();
					incorrect++;
				}
				break;
			}
		}
		return;
	}

	public static void displayCorrectResponse() {
		int rand_resp = rand.nextInt(4) + 1;
		switch (rand_resp) {
		case 1:
			System.out.println("Very good!");
			break;
		case 2:
			System.out.println("Excellent!");
			break;
		case 3:
			System.out.println("Nice work!");
			break;
		case 4:
			System.out.println("Keep up the good work");
			break;
		}
	}

	public static void displayInorrectResponse() {
		int rand_resp = rand.nextInt(4) + 1;
		switch (rand_resp) {
		case 1:
			System.out.println("No. Please try again.");
			break;
		case 2:
			System.out.println("Wrong. Try once more.");
			break;
		case 3:
			System.out.println("Don’t give up!");
			break;
		case 4:
			System.out.println("No. Keep trying.");
			break;
		}
	}

	public static void displayCompletionMessage() {
		double score = (double) correct / 10 * 100;
		System.out.println("You got " + correct + " right and " + incorrect + " wrong.");
		System.out.printf("Your score is %.0f%%\n", score);
		if (score >= 75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		} else if (score < 75) {
			System.out.println("Please ask your teacher for extra help.");
		}
		displayContiueMessage();
	}

	public static void displayContiueMessage() {
		System.out.println("Would you like to solve a new problem set?\n" + "1 for yes\n" + "2 for no");
		int decision = input.nextInt();
		switch (decision) {
		case 1:
			quiz();
		case 2:
			System.exit(0);

		}
	}
}