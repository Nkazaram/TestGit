package lesson1;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class HomeWork_3 {
    public static void main(String[] args) {
        Massiv();
        Massiv2();
        Massiv3();
        Massiv4();

    }

    public static void Massiv() {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxMass = mass.length;
        for (int i = 0; i < maxMass; i++) {
            System.out.print(i + "-" + mass[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < maxMass; i++)
            if (mass[i] == 1) {
                mass[i] = 0;
            } else mass[i] = 1;
        for (int i = 0; i < maxMass; i++) {
            System.out.print(i + "-" + mass[i] + " ");
        }
        System.out.print("\n");
    }

    public static void Massiv2() {
        int[] array = new int[8];
        int j = 1;
        int maxMass = array.length;
        for (int i = 0; i < maxMass; i++) {
            System.out.print(i + "-" + array[i] + "-");
        }
        System.out.println(" ");
        for (int i = 0; i < maxMass; i++, j = j + 3) {
            array[i] = j;
        }
        for (int i = 0; i < maxMass; i++) {
            System.out.print(i + "-" + array[i] + " ");
        }
        System.out.print("\n");
    }


    public static void Massiv3() {
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxMas = mas.length;
        for (int i = 0; i < maxMas; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for (int i = 0; i < maxMas; i++) {
            //System.out.print(i + "-");
            System.out.print(mas[i] + "-" );
        }
        System.out.print("\n");
    }


    //        int[][] array = new int[5][5];
//        for (int i = 0; i < array.length; i++) {
//            array[i][i] = 1;
//                    }
    public static void Massiv4() {
        int counter = 1;
        int[][] table = new int[3][3];
        for(
                int i = 0;
                i<3;i++)

        {
            for (int j = 0; j < 3; j++) {
                table[i][j] = counter;

                System.out.print( table[i][j] + "-");
                counter++;
            }
            System.out.println();
        }
    }



}



