package ru.testguihw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nikolay on 15.04.2015.
 */
public class MyButton extends JButton {

    MyButton(String title){
        super(title);
    }

    MyButton(String title, int width, int height){
        this(title);
        super.setSize(width,height);
    }
}
