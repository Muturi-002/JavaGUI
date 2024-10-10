package org.example;
import javax.swing.*;
public class MyFrame2 extends JFrame{
    public MyFrame2(){
        setVisible(true);
        setSize(500,400);
        setTitle("Another Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(this,"My Test");
        //'this' puts dialog box at the center of the frame
    }
    public static void main(String [] q){
        new MyFrame2();
    }
}
