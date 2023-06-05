/* Задание №2
 * Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 * public static int sum2d(String[][] arr)
 * { int sum = 0;
 * for (int i = 0; i < arr.length; i++)
 * { for (int j = 0; j < 5; j++) { int val = Integer.parseInt(arr[i][j]); sum += val;
 * }
 * } return sum; }
 */

 
/**
 * Возможные типы исключений:
  * 1. ClassCastException (ошибочное преобразование типов):
 * int val = Integer.parseInt(arr[i][j]);
 * 2. IndexOutOfBoundsException (выход за пределы массива):
 * for (int j = 0; j < 5; j++)
 * 3. NullPointerException (когда массив равен null):
 * если arr = null
 * 4. Переполнение значения int :
 * sum += val;
 */