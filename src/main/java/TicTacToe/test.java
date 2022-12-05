package TicTacToe;

import java.io.File;

public class test {

    public static void main (String[] args)
    {
        System.out.println(getFileSize(new File("D:/Sitdikov_Nail_53517957")));
    }
    public static long getFileSize  (File file)
    {
        if (!file.exists()) {
            return -1;
        }
        return file.length();
    }
}
