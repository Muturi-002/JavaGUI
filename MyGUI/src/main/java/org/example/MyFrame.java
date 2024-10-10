package org.example;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class MyFrame {
    public MyFrame(){
        JFrame frame= new JFrame("My window");
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(frame,"This teset");
    }
    public static void main(String [] l){
        new MyFrame();
    }
}
