package lesson1;

import java.util.Scanner;

public class ArraysConvert {
    public static int inputLines() {
        System.out.println("Enter write numbers of lines");
        Scanner inputScanner = new Scanner(System.in);
        int fromScanner = inputScanner.nextInt();
        return fromScanner;
    }
    public static String[] inputArray(int lenght) {
        String[] array = new String[lenght];// new array
        for (int i = 0; i < array.length; i++) {
            // fill arrays
            System.out.println("Enter write in arrays world");
            Scanner inputScanner = new Scanner(System.in);
            array[i] = inputScanner.nextLine();
        }
        return array;
    }
    public static String[] convertArray(String[] arrays) {
        for (int a = 0; a < arrays.length; a++) { // перебор всех строк
            int x = arrays[a].length();
    if ((a % 2) == 0) { //проверка строки на четность
        arrays[a] = ""; // если четное присваиваем значение 2
                for (int b = 0; b < x; b++){ //повторяем присвоение пока счетчик меньше длины строки
        arrays[a] = arrays[a] + "2";
                }
            }
    else {
                arrays[a] = ""; //если нечет, то присваиваем 1
                for (int c = 0; c < x; c++){
                    arrays[a] = arrays[a] + "1";
            }
        }
        }
        return arrays;
    }
    public static void printArray(String[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println(" ");
    }
}
