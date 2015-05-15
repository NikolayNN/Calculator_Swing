package ru.testguihw.listeners;

import ru.testguihw.MyJTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Nikolay on 17.04.2015.
 */
public class TextFieldListener implements FocusListener {
MyJTextField textField;
final static String RESET_MSG = "Сюда число-на..." ;
    public TextFieldListener(MyJTextField textField) {
        this.textField = textField;

    }

    @Override
    public void focusGained(FocusEvent e) {
if (textField.getText().equals(RESET_MSG)){
    textField.setText("");
    textField.setForeground(Color.WHITE);
}
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(textField.getText().equals("")){
            textField.setText(RESET_MSG);
            textField.setForeground(Color.GREEN);
        }
    }
}
