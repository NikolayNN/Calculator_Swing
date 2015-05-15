package ru.testgui;

import com.jtattoo.plaf.JTattooUtilities;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

/**
 * Created by Nikolay on 15.04.2015.
 */
public class TestGUI {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new HiFiLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
       // JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("TestFrameFirst");
        frame.setIconImage(new ImageIcon("c:/2.png").getImage());
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
       panel.setBorder(BorderFactory.createEtchedBorder());

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        FlowLayout fl = new FlowLayout();
        frame.setLayout(fl);

        JButton button = new JButton("Test button");
        button.setSize(100,150);
        panel.add(button);
    }
}
