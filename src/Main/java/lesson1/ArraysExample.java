package lesson1;

public class ArraysExample {

    public static void printArray(String[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
    }
    public static String[] returnArray(String[] inputArray) {
        String[] outputArray = new String[inputArray.length];// new array
        for (int i = 0, a = inputArray.length - 1; i < inputArray.length; i++, a--) {
            outputArray[a] = inputArray[i]; // присвоение массива

        }
        return outputArray;
    }
}
/* body for Main
  String[] seasons = new String[] {"Winter", "Spring", "Summer", "Autumn"};
       String[] seasons2 = ArraysExample.returnArray(seasons);
        ArraysExample.printArray (seasons);
        ArraysExample.printArray (seasons2);
 */