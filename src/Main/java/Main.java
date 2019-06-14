import lesson1.ArraysConvert;
import lesson1.ArraysExample;
import lesson1.HelloWorld;
public class Main {
    public static void main(String[] args) {
        int numb = ArraysConvert.inputLines();
        String[] array = ArraysConvert.inputArray(numb);
        ArraysConvert.convertArray(array);
        ArraysConvert.printArray(array);
    }
}

/*
будем считывать сканнером.
в сканнер подаются:
сначала число N,
потом строки, количеством N.
нужно считать строки в массив.
каждую чётную строку - заменить на двойки по количеству символов в строке
каждую нечётную - на единицы
то есть
вход:
3
аба
сттт
каддд

выход:
222
1111
22222
 */
