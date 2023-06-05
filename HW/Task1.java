/* Задание №1
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


// Метод 1 - Деление на ноль    
        double div = DivNum(6,0);    
        System.out.println(div);  
    
    

 // Метод 2 - Вывод элемента массива по индексу      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер элемента массива");
        int num = scanner.nextInt();
        String[] stringArray = new String[] { "1", "2", "3", "4", "5" };
        try {
            getElement(stringArray, num);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1.getMessage());
        }

        System.out.println();
   
 // Метод 3 - Создание массива случайных чисел

        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        try {
            int[] randomArray = createRandomArray(size);
        } catch (NegativeArraySizeException e3) {
            System.out.println(e3.getMessage());
        }
    }

static double DivNum(int a, int b) {
        double res=0; 
    
        try {
            res = a/b; 
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    
        return res;
    }
    public static <String> void getElement(String[] array, int num) {
        if (num > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");

        } else
            System.out.println(array[num]);

    }

   
    public static int[] createRandomArray(int size) {
        Random random = new Random();
        if (size < 0) {
            throw new NegativeArraySizeException("Размер массива не может быть меньше нуля");
        }
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = random.nextInt(100);
        }
        return newArray;
    }

}
