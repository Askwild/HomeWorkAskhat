public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(within10and20(5, 6));
        isPositiveOrNegative(5);
        System.out.println(isNegative(-1));
        printWordNTimes("Askhat", 5);
        //System.out.println(newYear(0, 1));
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /*2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число " + x + " положительное");

        } else {
            System.out.println("Число " + x + " отрицательное");
        }

    }

    //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное,
    // и вернуть false если положительное.
    public static boolean isNegative(int x1) {
        if (x1 <= 0) {
            return true;
        } else {
            return false;
        }

    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {

            System.out.println(word);

        }
    }

    //5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
  /*  public static void newYear(int a)  {
        if (!(a  == 0) || ((a == 0) && !(a == 100)))
            System.out.println(a + " г. не високосный");
        else System.out.println(a + " г. високосный");
    }*/


}



