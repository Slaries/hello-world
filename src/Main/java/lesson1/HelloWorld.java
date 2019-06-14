package lesson1;

import java.util.Scanner;

public class HelloWorld {
    public static void intupLines(int counter) {
        for(int i = 0; i < counter; i++) {
            System.out.println("Enter please any key");
            Scanner inputScanner = new Scanner(System.in);
            String fromScanner = inputScanner.nextLine();
            System.out.println("Вы ввели символ " + fromScanner);
        }

    }
}