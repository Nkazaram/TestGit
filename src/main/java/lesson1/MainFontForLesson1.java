package lesson1;


public class MainFontForLesson1 {

    public static void main(String[] args)  {
       /* System.out.println("Hello,world"); //hgkhk commoit is done
        printHello();
        printHello();*/


        testVars();
        checkAppraisal();

    }



    static void printHello() {
        System.out.println("Привет");
        System.out.println("Привет, я учусь");
        System.out.println("☺");


    }
    private static void testVars() {

        int varA = 9;
        int varB = 5;
        System.out.println(varA / varB);
        double varDoubleA = 9.1;
        double varDoubleB = 5.0;
        System.out.println(varDoubleA / varDoubleB);

        String helloStr = "Hello";
        String worldStr = "world";
        System.out.println(helloStr + ',' + worldStr + '!');
    }


    private static void checkAppraisal() {
        int appraisal = 5;

        if (true) {

            System.out.println("Молодец, Так держать!");


        }
    }
}
