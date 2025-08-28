package LambdaExpression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyWindow {
    public static void main(String[] args) {


        ///  window : ob JFrame

        JFrame frame = new JFrame("MyWindow");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());




        /// creaTE BUTTON AND JFRAm

//        JButton button = new JButton("Click me !!");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button click");
//                JOptionPane.showMessageDialog(null,"Hey,Button click");
//            }
//        });

        /// use lambda

        JButton button = new JButton("Click me !!");
        button.addActionListener(e->{
                    System.out.println("Button Click");
                    JOptionPane.showMessageDialog(null,"You click the Button!");
                });

        //anonymous methods
        button.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });


        frame.add(button);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
