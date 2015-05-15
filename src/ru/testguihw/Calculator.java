package ru.testguihw;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import ru.testguihw.listeners.ButtonListener;
import ru.testguihw.listeners.TextFieldListener;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Logger;

/**
 * Created by Nikolay on 16.04.2015.
 */
public class Calculator {

        private MyJFrame frame;

        private MyJPanel panel1;
        private MyJPanel panel2;
        private MyJPanel panel3;
        private MyJPanel panelMsg;

        private MyJLabel labelNum1;
        private MyJLabel labelMum2;
        private MyJLabel labelRes;

        private MyJTextField textFieldNum1;
        private MyJTextField textFieldNum2;
        private MyJTextField textFieldRes;

        private MyButton button1;
        private MyButton button2;
        private MyButton button3;
        private MyButton button4;
        private MyButton buttonReset;

        private  void createLabels (){
            labelNum1 = new MyJLabel("Число 1");
            labelMum2 = new MyJLabel("Число 2");
            labelRes = new MyJLabel("Результат");
        }

        private void createButtons(){
            buttonReset = new MyButton("Сброс");
            button1 = new MyButton("Сложение");
            button2 = new MyButton("Вычитание");
            button3 = new MyButton("Умножение");
            button4 = new MyButton("Деление");
        }

        private void createTextField(){
           textFieldNum1 = new MyJTextField(10);
           textFieldNum2 = new MyJTextField(10);
           textFieldRes = new MyJTextField(10);
           textFieldRes.setEditable(false);
        }

        private void createPanels(){
            panel1 = new MyJPanel("first",200,50);

            panel2 = new MyJPanel("second",200,50);

            panel3 = new MyJPanel("third",200,50);

            panelMsg = new MyJPanel("msg",200,50);

            panel1.add(labelNum1);
            panel1.add(textFieldNum1);
            panel1.add(labelMum2);
            panel1.add(textFieldNum2);

            panel2.add(buttonReset);
            panel2.add(button1);
            panel2.add(button2);
            panel2.add(button3);
            panel2.add(button4);

            panel3.add(labelRes);
            panel3.add(textFieldRes);
        }

        private void createFrame(){
            frame = new MyJFrame("Калькулятор",450,150);
            frame.setLayout(new BorderLayout(2,2));
            frame.add(panel1,BorderLayout.NORTH);
            frame.add(panel2, BorderLayout.CENTER);
            frame.add(panel3, BorderLayout.SOUTH);
            frame.setVisible(true);

        }
    private void addButtonListener (){
        button1.addActionListener(new ButtonListener(textFieldNum1,textFieldNum2,textFieldRes,panelMsg));
        button2.addActionListener(new ButtonListener(textFieldNum1,textFieldNum2,textFieldRes,panelMsg));
        button3.addActionListener(new ButtonListener(textFieldNum1,textFieldNum2,textFieldRes,panelMsg));
        button4.addActionListener(new ButtonListener(textFieldNum1,textFieldNum2,textFieldRes,panelMsg));
        buttonReset.addActionListener(new ButtonListener(textFieldNum1,textFieldNum2,textFieldRes,panelMsg));

    }


    private void addTextFieldListener(){
        textFieldNum1.addFocusListener(new TextFieldListener(textFieldNum1));
        textFieldNum2.addFocusListener(new TextFieldListener(textFieldNum2));


    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new HiFiLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);

            Calculator calculator = new Calculator();
        calculator.createButtons();
        calculator.createLabels();
        calculator.createTextField();
        calculator.createPanels();
        calculator.createFrame();
        calculator.addButtonListener();
        calculator.addTextFieldListener();
        }









}
