import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Реализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум.
    // Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
    public static int getArrayLength(int[] array, int min) {
        if (array.length < min) return -1;
        return array.length;
    }

//    Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//    Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//            1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//            2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//            3. если вместо массива пришел null, метод вернет -3

    public static int getElemIndexInArray(int[] array, int elem, int min) {
        if (array == null) {
            System.out.println("Массив не должен быть null!");
            return -3;
        }
        if (array.length < min) {
            throw new IllegalArgumentException("Длина массива не должна быть меньше минимума");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) return i;
        }
        return -2;
    }

//    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//    Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
//    метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
//    и в каждой ячейке может лежать только значение 0 или 1. Если нарушается одно из условий,
//    метод должен бросить RuntimeException с сообщением об ошибке.

    public static int sumOfArrayElemrnts(int[][] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                throw new RuntimeException("Массив должен быть квадратным!");
            }
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    throw new RuntimeException("Массив должен содержать только 0 и 1!");
                }
                sum += array[i][j];
                System.out.println(sum);
            }
        }

        return sum;
    }

//    Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//    Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
//    1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//    2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

    public static void checkArray(Integer[] arr) {

        ArrayList<Integer> errors = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                errors.add(i);
            }
        }
        if (!errors.isEmpty()) {
            System.out.println("Массив содержит null в ячейках " + errors);
        } else {
            System.out.println("Массив не содержит null в ячейках.");
        }
    }

    public static void main(String[] args) {
        //System.out.println(getArrayLength(new int[]{1, 2, 9, 8, 78, 15, 35}, 1));
        //System.out.println(getElemIndexInArray(new int[]{1, 2, 9, 8, 78, 15, 35}, 79, 20));
        int[][] arr = new int[][] {
                {0, 1, 1},
                {0, 3, 0},
                {1, 1, 1},
        };
        //System.out.println(sumOfArrayElemrnts(arr));
        checkArray(new Integer[] {12,45,78,null,98,56,null,32,45});
    }

}
