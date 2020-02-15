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

}
