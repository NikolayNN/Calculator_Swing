package ru.testguihw;

/**
 * Created by Nikolay on 15.04.2015.
 */
public class TestMain {
    public static void main(String[] args) {


        MyButton button = new MyButton("button",50,50);
        MyJPanel panel = new MyJPanel("Panel", 300, 300, button);
        MyJFrame frame = new MyJFrame("frame", 400, 400, panel);
    }
    }
