package ru.testguihw;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Nikolay on 16.04.2015.
 */
public class Main2 {
    public static void main(String[] args) {
MyJFrame frame = new MyJFrame("sdf",400,400 );
        frame.setLayout(new BorderLayout(2,2));

        MyJPanel panel = new MyJPanel("asd",200,200);
MyJLabel label = new MyJLabel("123456789876543456");
        panel.add(label);

        frame.add(panel);

   }
}
