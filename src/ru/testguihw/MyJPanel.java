package ru.testguihw;



import javax.swing.*;
import java.awt.*;

/**
 * Created by Nikolay on 15.04.2015.
 */
public class MyJPanel extends JPanel {

    MyJPanel (String name, int width, int height){
        super.setName(name);
        super.setSize(width,height);
       // super.setBorder(BorderFactory.createEtchedBorder());
        super.setLayout(new FlowLayout());

    }
MyJPanel (String name, int width, int height, Component component){
    this(name, width, height);
    super.add(component);
}

    MyJPanel (String name, int width, int height, LayoutManager layout){
        this(name, width, height);
        super.setLayout(layout);
    }

    MyJPanel (String name, int width, int height,Component component, LayoutManager layout){
        this(name, width, height);
        super.setLayout(layout);
        super.add(component);
    }


}
