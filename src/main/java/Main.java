

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter please number of lines");
        Scanner inputScanner = new Scanner(System.in);
        int fromScanner = inputScanner.nextInt();
        String[] inputArray = new String[fromScanner];
        for (int i = 0; i < fromScanner + 1; i++){
            System.out.println("Enter please any text");
           inputArray[i] = inputScanner.nextLine();


        }

    }
}

/*
1. Считываем коливество строк
2. объявляем массив длинной n строк
3. циклом аписываем массив
4 цикл проверка чет нечет


 */
