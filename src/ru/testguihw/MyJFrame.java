package ru.testguihw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nikolay on 15.04.2015.
 */
public class MyJFrame extends JFrame {

    MyJFrame(String title, int weight, int height){
        super(title);
        super.setSize(weight,height);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());

        super.setMinimumSize(new Dimension(450,150));
        super.setResizable(false);
    }

    MyJFrame(String title, int weight, int height, Component component){
        this(title, weight, height);
        super.getContentPane().add(component);
    }


}
