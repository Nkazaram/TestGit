package lesson1;

public class FirsApp {

    public static void main (String[] args) {
//        int a = -2;
//        int b = 0;
 //       studyif();
 //       studySwitch();
    //    method1();
//        for (int i = 1; i <=10; i++) {
//            System.out.println(i);
//
//        }
//        for (int i = 1; i <=10; i++) {
//            for (int j = 1; j < 5; j++) {
//
//            }
 //       printTable(10,10);
//        for (int i = 0, k = 10; i < k; i++, k--) {
//            System.out.println(i);
//
//        }
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < 10; i++) {
//            if (i==2) {
//                continue;
//            }
//            if (i ==5) {
//                continue;
//            }
//            if (i ==7) {
//                break;
//            }
//            System.out.print(i + " ");
//
//        }
//        int a = 0;
//        while (a<10) {
//            a++;
//            System.out.println(a + " ");
//        }
//        while (true) {
//            System.out.println("TEXT");
//                        b++;
//            if (b == 10)
//                break;
//        }
//    do {
//        a++;
//        System.out.println(a);
//    } while (a < 10);
//       int base = 2;
//       int signature = 4;
//        System.out.println(myMath(base, signature));
//  }
//
//    private static int myMath(int base, int signature) {
//        int result = base;
//        for (int i = 1; i < signature; i++) {
//            result = result * base;
//        }
//        return result;


   }


    private static void printTable(int width, int height) {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
    }


}

    private static void method1() {
   //     int b = 3;
   //     int c = 10;
   //     if (true) {
   //         System.out.println(c);
   //     }
   //     System.out.println(b);
    }

    private static void studySwitch() {
        String nameLetter = "yaml";
        switch (nameLetter) {
            case "Alex" -> System.out.println("Send letter to Alex");
            case "Olga" -> System.out.println("Send letter to Olga");
            case "Boris" -> System.out.println("Send letter to Boris");
            case "Maria" -> System.out.println("Send letter to Maria");
            default -> System.out.println("Not found receiver");
        }
    }

    private static void studyif() {
        String nameLetter = "Nail";
        if(nameLetter == "Alex") {
            System.out.println("Send letter to Allex");
        } else if (nameLetter == "Olga") {
            System.out.println("Send letter to Olga");
        }else if(nameLetter == "Boris") {
            System.out.println("Send letter to Boris");
        } else if (nameLetter == "Maria") {
            System.out.println("Send letter to Maria");
        } else {
            System.out.println("Not found receiver");
        }
    }
}
