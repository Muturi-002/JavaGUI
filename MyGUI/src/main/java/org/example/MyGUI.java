package org.example;
import javax.swing.JOptionPane;
import java.awt.*;

public class MyGUI {
    public static void main(String [] b){
        String name,stringval;
        int val1,val2,result;
        name= JOptionPane.showInputDialog(null,"Enter your name: ","UserName", JOptionPane.ERROR_MESSAGE);
        //name= JOptionPane.showInputDialog(null,"Enter your name: ");
        name= JOptionPane.showInputDialog(null,"Enter your name: ","UserName", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,name+", Welcome");
        /*
        * null refers to position of dialog box on screen (center)*/
        stringval=JOptionPane.showInputDialog("Enter a number: ");
        val1=Integer.parseInt(stringval);
        val2=Integer.parseInt(JOptionPane.showInputDialog("Enter the second numebr: "));
        result=val1+val2;
        JOptionPane.showMessageDialog(null,"Sum: "+result);
        //JOptionPane.showMessageDialog(null,stringval);
        int option=JOptionPane.showConfirmDialog(null,"Do you wish to terminate the program?");
        if(option==0){
            System.exit(0);
        }
        else
        {
            //new MyGUI();
            main(b);
        }
    }
}
