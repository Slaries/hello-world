

import lesson1.ArraysConvert;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int number = ArraysConvert.inputLines();
      String[] array = ArraysConvert.inputArray(number);
      ArraysConvert.convertArray(array);
      ArraysConvert.printArray(array);

    }
}

