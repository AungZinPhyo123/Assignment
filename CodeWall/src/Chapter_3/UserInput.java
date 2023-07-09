package Chapter_3;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String name = "Aung Zin Phyo";
        int age = 18;
        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int userinput = scanner.nextInt();
        System.out.println(userinput + 10);
    }
}
