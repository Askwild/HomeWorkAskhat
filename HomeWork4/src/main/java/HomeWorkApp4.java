import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    private static char[][] map;
    private static char X_DOT = 'x';
    private static char O_DOT = '0';
    private static char EMPTY_DOT = '•';
    private static Random rnd = new Random();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn(  );
            printMap();
            if (checkWin(X_DOT)) {
                System.out.println("YOU WIN");
            }
            if (isMapFull()) {
                break;
            }
            CompTurn();
            printMap();
            if (checkWin(O_DOT)) {
                System.out.println("YOU LOSE");
            }
            if (isMapFull()) {
                break;
            }
        }
        System.out.println("Game over");
    }

    // --Проверка победы:
    public static boolean checkWin(char dot) {
        int X;
        int y;
        // --Проверка строк на выигрыш
        for (X = 0; X < 2; X++) {
            for (y = 0; y < 2; y++) {
                if (map[y][0 + X] == dot && map[y][1 + X] == dot) {
                    return true;
                }
            }
        }
        // --Проверка стобцов на выигрыш
        for (X = 0; X < 2; X++) {
            for (y = 0; y < 2; y++) {
                if (map[0 + X][y] == dot && map[1 + X][y] == dot) {
                    return true;
                }
            }
        }
        // Проверка диагоналей (первые и вторые)
        for (X = 0; X < 2; X++) {
            for (y = 0; y < 2; y++) {
                if (map[0 + X][0 + y] == dot && map[1 + X][1 + y] == dot) {
                    return true;
                }

                if (map[1 - X][0 + y] == dot && map[0 - X][1 + y] == dot) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void CompTurn() {
        int x, y;
        do {
            x = rnd.nextInt(3);
            y = rnd.nextInt(3);
        } while (!isCellValid(x, y));
        map[y][x] = O_DOT;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        if (map[y][x] == EMPTY_DOT) {
            return true;
        }
        return false;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате \"x пробел y\"");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = X_DOT;

    }

    public static void initMap() {
        map = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printMap() {
        System.out.println();
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}