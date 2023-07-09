package Chapter_3;

import java.util.Scanner;

public class MindGame {
    public static void main(String[] args) {
        int count = 0;
        int num = 97;
        while (true || false) {
            System.out.println("Enter A Number = ");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            System.out.println(userInput);

            if (userInput == 97) {
                System.out.println("Correct");
                break;
            } else if (userInput > 70 && userInput < 97 ) {
                System.out.println("Good but try again a little bit higher");
            } else if (userInput > 50 && userInput < 69) {
                System.out.println("Not bad but try again a little bit higher");
            } else if (userInput > 30 && userInput < 49) {
                System.out.println("Try more higher");
            } else if (userInput > 20 && userInput<29) {
                System.out.println("Bad try more higher");
            } else if (userInput > 10 && userInput <19) {
                System.out.println("Try more");
            } else if (userInput < 10) {
                System.out.println("Try again");
            }
            while (count <= 8){

                count++;
                if (count>=1 && count<=4){
                    if (userInput<num) {
                        System.out.println("A little bit higher");
                        break;
                    }
                    else if (userInput==num) {
                        System.out.println("You are Genius");
                        System.out.println();
                        System.out.println(userInput);
                        break;
                    }
                    else {
                        System.out.println("A little bit lower");
                    }
                    break;

                    }
                else if (count>=5 && count<=8) {
                    if (userInput < num) {
                        System.out.println("A little bit higher");
                        break;
                    } else if (userInput == num) {
                        System.out.println("Good");
                        System.out.println();
                        System.out.println(userInput);
                        break;
                    } else {
                        System.out.println("A little bit lower");
                        break;
                    }

                } else {
                    System.out.println("You are so stupid");
                    System.out.println();
                    System.out.println("Random number is " + userInput);
                    break;
                }

                }
            }

        }
    }



