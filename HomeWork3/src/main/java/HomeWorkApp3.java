public class HomeWorkApp3 {

    public static void main(String[] args) {
        integerArray();
        emptyIntegerArr();
        multipliedArray();
        dimensionalIntegerArray();
        for (int i = 0; i < retLenArr(4, 456).length; i++) {
            System.out.println(retLenArr(4, 456)[i]);
        }
    }

//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
// [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void integerArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] - 1) * -1;
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void emptyIntegerArr() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;

            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;


    public static void multipliedArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(" " + arr[i]);
        }
    }

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
// (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void dimensionalIntegerArray() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++ ) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i) {
                    arr[i][j] = 1;
                }
                if (j == arr.length - 1 - i) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }


//5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
// массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] retLenArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
