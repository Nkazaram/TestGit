public class JavaAPI {
    public static void main(String[] args) {
//      int a = 123;
//      a = --a - --a;
//        System.out.println();
//int [] [] arr = new int [3] [5];
//for (int [] line : arr) {
//    for (int item : line)
//    {
//        System.out.printf("%d", item);
//    }
//    System.out.println();
//}
        int [] [] arr = new int [3][5];
        for (int i =0; i <arr.length; i++) {
         for (int j =0; j< arr[i].length; j++) {
             System.out.printf("%d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
