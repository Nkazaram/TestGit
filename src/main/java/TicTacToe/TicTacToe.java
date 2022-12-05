package TicTacToe;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static int size;
    private static int winSize;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    public static final String HEADER_FIRST_SYMBOL = "☺";
    public static final String SPACE_MAP_SYMBOL = " ";

    private static char[][] MAP = new char[size][size];

    private static final Scanner in = new Scanner(System.in);
    public static final Random random = new Random();

    public static int turnsCount = 0;

    public static void main(String[] args) {
        start();
    }


    public static void start() {
        do {
            System.out.println("\n\nНачнем битву!!!");
            init();
            printMap();
            playGame();
        } while (isContinueGame());
    }

    private static void init() {
        turnsCount = 0;
        size = getSizeFromUser();
        winSize = getWinSize();
        initMap();

    }

    private static int getWinSize() {
        if (size >= 3 && size <=6) {
            return 3;
        } else if (size > 6 && size <= 10) {
            return 4;
        }

        return 5;
    }

    private static int getSizeFromUser() {
        System.out.println("Необходимо выбрать размер игрового поля: ");
        return getValidNumberFromUser(3, 99);
    }

    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить сражение? y\\n");
        return switch (in.next()) {
            case "y", "н", "у", "+", "да", "e" -> true;
            default -> false;
        };
    }

    private static void initMap() {

        MAP = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printBodyMap() {
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
            for (int j = 0; j < size; j++) {
                System.out.printf("%3s", (MAP[i][j]), (SPACE_MAP_SYMBOL));
            }
            System.out.println();
        }
    }

    private static void printHeaderMap() {
        System.out.printf("%3s", (HEADER_FIRST_SYMBOL), (SPACE_MAP_SYMBOL));
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.printf("%3s", (i + 1), (SPACE_MAP_SYMBOL));
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)){
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)){
                break;
            }
        }
    }

    private static void humanTurn() {
        System.out.println("\nХОД ЧЕЛОВЕКА!");

        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.print("Введите координату строки: ");
            rowNumber = getValidNumberMapLine();

            System.out.print("Введите координату столбца: ");
            columnNumber = getValidNumberMapLine();

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }

            System.out.printf("ОШИБКА! Ячейка с координатами %s:%s уже используется!%n", rowNumber + 1, columnNumber + 1);
        }

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static int getValidNumberMapLine() {
        return getValidNumberFromUser(1, size) - 1;
    }

    private static int getValidNumberFromUser(int min, int max) {
        while (true) {
            System.out.print("Введите число: ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n, min, max)) {
                    return n;
                }
                System.out.printf("ОШИБКА! Проверьте значение координаты. Должно быть от %s до %s. Введено: %s%n", min, max, n);
            } else {
                System.out.printf("ОШИБКА! Ввод допускает только целые числа. %s - не целое число!%n", in.next());
            }
        }
    }

    private static boolean isNumberValid(int n, int min, int max) {
        return n >= min && n <= max;
    }

    private static void aiTurn() {
        System.out.println("\nХОД КОМПЬЮТЕРА!");

        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(size);
            columnNumber = random.nextInt(size);
        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("УРА! ВЫ ПОБЕДИЛИ!!!");
            } else {
                System.out.println("УВЫ. ПОБЕДИЛ КОМПЬЮТЕР.");
            }
            return true;
        }

        if (checkDraw()) {
            System.out.println("НИЧЬЯ!");
            return true;
        }

        return false;

    }

    private static boolean checkDraw() {
/*        for (char[] chars : MAP) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;*/

        return turnsCount >= size * size;

    }

    private static boolean checkWin(char symbol) {
        int hor, ver;
        int diagMain, diagReverse;
        for (int i = 0; i < size; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < size; j++) {
                if (MAP[i][j] == DOT_HUMAN) {
                    hor++;
                } else if (MAP[i][j] != DOT_HUMAN && hor < winSize) {
                    hor = 0;
                }
                if (MAP[j][i] == DOT_HUMAN) {
                    ver++;
                }   else if (MAP[j][i] != DOT_HUMAN && ver < winSize) {
                    ver = 0;
                }
            }
            if (hor >= winSize || ver >= winSize) {
                System.out.printf("По горизонтали: " + hor + "%n" + "По вертикали: " + ver + "%n");
                return true;
            }
        }

        for (int j = 0; j < size; j++) {
            diagMain = 0;
            for (int i = 0; i < size; i++) {
                int k = j + i;
                if (k < size) {
                    if (MAP[i][k] == DOT_HUMAN) {
                        diagMain++;
                    } else if (MAP[i][k] != DOT_HUMAN && diagMain < winSize) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= winSize) {
                    System.out.println("По главной диагонали от центральной оси вправо: " + diagMain);
                    return true;
                }
            }
        }
        for (int j = 1; j < size; j++) {
            diagMain = 0;
            for (int i = 0; i < size; i++) {
                int k = j + i;
                if (k < size) {
                    if (MAP[k][i] == DOT_HUMAN) {
                        diagMain++;
                    } else if (MAP[k][i] != DOT_HUMAN && diagMain < winSize) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= winSize) {
                    System.out.println("По главной диагонали от центральной оси вниз: " + diagMain);
                    return true;
                }
            }
        }
        for (int j = 0; j < size; j++) {
            diagReverse = 0;
            for (int i = 0; i < size; i++) {
                int k = (size - 1) - i;
                int l = j + i;
                if (k >= 0 && l < size) {
                    if (MAP[l][k] == DOT_HUMAN) {
                        diagReverse++;
                    } else if (MAP[l][k] != DOT_HUMAN && diagReverse < winSize) {
                        diagReverse = 0;
                    }
                }
                if (diagReverse >= winSize) {
                    System.out.println("По побочной диагонали от центральной оси вниз: " + diagReverse);
                    return true;
                }
            }
        }
        for (int j = 1; j < size; j++) {
            diagReverse = 0;
            for (int i = 0; i < size; i++) {
                int k = (size - 1) - j - i;
                if (k >= 0) {
                    if (MAP[i][k] == DOT_HUMAN) {
                        diagReverse++;
                    } else if (MAP[i][k] != DOT_HUMAN && diagReverse < winSize) {
                        diagReverse = 0;
                    }
                }
                if (diagReverse >= winSize) {
                    System.out.println("По побочной диагонали от центральной оси влево: " + diagReverse);
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }
}