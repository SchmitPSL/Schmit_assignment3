import java.security.SecureRandom;
import java.util.Scanner;

/*
 * The program shall generate random numbers with a SecureRandom object
The program shall ask the student to solve a multiplication problem
A multiplication problem shall contain two numbers sampled from a uniform random distribution in the range of 0 to 9 (inclusive)
The program shall display the message "Very good!" if the student provides a correct response
The program shall display the message "No. Please try again." if the student provides an incorrect response
The program shall terminate when a correct response is provided by the student
The program shall continue to ask the student to solve the original multiplication problem until the student provides the correct answer
Create a method called "quiz" that contains the program logic
Create a method called "askQuestion" that prints the problem to the screen
Create a method called "readResponse" that reads the answer from the student
Create a method called "isAsnwerCorrect" that checks to see if the student's answer matches the correct answer to the problem
Create a method called "displayCorrectResponse" that prints out the response when a student enters a correct answer
Create a method called "displayInorrectResponse" that prints out the response when a student enters an incorrect answer
Create a main method that runs your program by calling the "quiz" method
 */


public class CAI1 {

	private static SecureRandom rand = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	//Generate the random numbers between 0 - 9
	static int rand_val1 = rand.nextInt(10); 
	static int rand_val2 = rand.nextInt(10);
	
	
	
	public static void main(String[] args) {
		quiz();
		

	}
	
	public static void quiz() {
        //Send the numbers to be used in the question
        askQuestion(rand_val1, rand_val2);
        readResponse();
        
        
	}
	

	
	public static void askQuestion(int val1, int val2) {
		System.out.println("What is " + val1 + " times " + val2);
		
	}
	
	public static void readResponse() {
		int answer = input.nextInt();
		
		isAnserCorrect(answer);
	}
	
	public static void isAnserCorrect(int val) {
		while(val != (rand_val1 * rand_val2)) {
			displayInorrectResponse();
			repeatQuestion();
		}
		displayCorrectResponse();
		System.exit(0);
		
		
	}
	
	private static void repeatQuestion() {
		System.out.println("What is " + rand_val1 + " times " + rand_val2);
		readResponse();
	}
	
	public static void displayCorrectResponse() {
		System.out.println("Very good!");
	}
	
	public static void displayInorrectResponse() {
		System.out.println("No. Please try again.");
	}
	
}



