package lesson1;

import org.w3c.dom.ls.LSOutput;

public class HomeWorkApp_2 {
 public static void main(String[] args) {
     //System.out.println (Near10and20(5,12));
//PosNeg(0);

     PosNeg2(-22);

    }

    static boolean Near10and20(int x1, int x2) {
     int sum = x1 + x2;
        if (sum >= 10 && sum <=20) return true;
        else return false;
    }

    static void PosNeg(int x) {
     if (x >= 0) System.out.println("Число " + x + " положительное");
     else System.out.println("Число " + " " + x +" " + " отрицательное");

    }
    static boolean PosNeg2 (int a) {
        if (a < 0) System.out.println("true");
        else {
            System.out.println("false");
        }
        return false;
    }
}

