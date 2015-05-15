package ru.testguihw.listeners;

import ru.testguihw.MyButton;
import ru.testguihw.MyJTextField;
import ru.testguihw.calculateoperations.MathOperations;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nikolay on 17.04.2015.
 */
public class ButtonListener implements ActionListener {
   private MyJTextField fieldNum1;
   private MyJTextField fieldNum2;
   private MyJTextField fieldRes;
   public String operation;


    private JPanel panel;

    public ButtonListener(MyJTextField fieldNum1, MyJTextField fieldNum2, MyJTextField fieldRes, JPanel panel) {
        this.fieldNum1 = fieldNum1;
        this.fieldNum2 = fieldNum2;
        this.fieldRes = fieldRes;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyButton button;
        if (e.getSource() instanceof MyButton) {
             button = (MyButton) e.getSource();}
            else return;


        if((fieldNum1.getText().equals(""))||(fieldNum2.getText().equals(""))) {JOptionPane.showMessageDialog(panel, "Где числа?!"); return;}

        if(button.getText().equalsIgnoreCase("сброс")){
            fieldNum1.setText("");
            fieldNum2.setText("");
        }

        if(!MathOperations.isDigit(fieldNum1.getText()) || !MathOperations.isDigit(fieldNum2.getText())){JOptionPane.showMessageDialog(panel, "не буквы, а числа!"); return;}
        final float num1 =Float.parseFloat( fieldNum1.getText());
        final float num2 =Float.parseFloat(fieldNum2.getText());

        if (button.getText().equalsIgnoreCase("сложение")){
            fieldRes.setText(String.valueOf(MathOperations.add(num1,num2)));
        }

        if (button.getText().equalsIgnoreCase("вычитание")){
            fieldRes.setText(String.valueOf(MathOperations.difference(num1,num2)));
        }

        if (button.getText().equalsIgnoreCase("умножение")){
            fieldRes.setText(String.valueOf(MathOperations.multiplication(num1,num2)));
        }

        if (button.getText().equalsIgnoreCase("деление")){
            fieldRes.setText(String.valueOf(MathOperations.divide(num1,num2)));
        }





    }





}
