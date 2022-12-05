package App;


import javax.swing.*;
import java.awt.*;

public class Lesson8 extends JFrame {
        public Lesson8() {
            setTitle("Test Window");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(300, 300, 400, 400);
            setLayout(new GridLayout(3, 3));
            for (int i = 1; i <= 9; i++) {
                JButton button = new JButton(String.valueOf(i));
                add(button);
            }


            setVisible(true);
        }


        public static void main(String[] args) {
            new Lesson8();
        }
    }


