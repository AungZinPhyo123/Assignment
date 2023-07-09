package Chapter_3;
import java.util.Random;
import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args) {





        while (true) {
            System.out.println("Enter a number: ");

            Scanner scanner= new Scanner(System.in);
            int userInput = scanner.nextInt();
            if (userInput == 88) {
                System.out.println(" Correct ");
                break;
            } else if (userInput >= 87) {
                System.out.println(" a little bit higher ");
            } else if (userInput >= 70) {
                System.out.println("Not Bad but guess again higher ");
            } else if (userInput >= 40) {
                System.out.println(" Guess again higher ");
            } else if (userInput >= 30) {
                System.out.println(" more higher ");
            } else {
                System.out.println("Try again ");
            }
             }
    }
    }


