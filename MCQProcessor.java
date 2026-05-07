import java.util.Scanner;

public class MCQProcessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display the question and options
        System.out.println("Classwork 4th May: MCQs processing");
        System.out.println("-----------------------------------");
        System.out.println("Question: Which symbol is used to declare an array in Java?");
        System.out.println("a. ()");
        System.out.println("b. {}");
        System.out.println("c. []");
        System.out.println("d. <>");
        
        // Prompt user for input
        System.out.print("\nYour answer (a, b, c, or d): ");
        char answer = input.next().toLowerCase().charAt(0);

        // Logic to check the answer
        if (answer == 'c') {
            System.out.println("Correct! Square brackets [] are used for array declaration.");
        } else {
            System.out.println("Incorrect. The correct answer is c. []");
        }

        input.close();
    }
}