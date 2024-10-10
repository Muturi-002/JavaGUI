package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Equation extends JFrame implements ActionListener{
    private JLabel lblEq,lblSign, lblEqual;
    private JTextField txtnum1,txtnum2, txtres;
    private JButton btnSum, btnProd, btnExit;
    int num1,num2, res;
    public Equation(){
        lblEq= new JLabel("Equation");
        lblEqual= new JLabel("=");
        lblSign= new JLabel("?");
        txtnum1= new JTextField(10);
        txtnum2= new JTextField(10);
        txtres= new JTextField(10);
        btnSum= new JButton("Sum");
        btnProd= new JButton("Product");
        btnExit= new JButton("Exit");
        setVisible(true);
        setSize(450,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(lblEq);
        add(txtnum1);
        add(lblSign);
        add(txtnum2);
        add(lblEqual);
        add(txtres);
        add(btnSum);
        add(btnProd);
        add(btnExit);
        txtres.setEditable(false);
        btnExit.addActionListener(this);
        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Integer.parseInt(txtnum1.getText());
                num2= Integer.parseInt(txtnum2.getText());
                //res= num1+num2;
                lblSign.setText("*");
                txtres.setText(String.valueOf(num1+num2));
                //txtres.getText(re);
            }
        });
        btnProd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Integer.parseInt(txtnum1.getText());
                num2= Integer.parseInt(txtnum2.getText());
                res= num1*num2;
                lblSign.setText("*");
                txtres.setText(String.valueOf(res));

            }
        });
    }
    public void actionPerformed(ActionEvent r){
        int option=JOptionPane.showConfirmDialog(this, "Exit Application?");
        if(option==0)
            System.exit(0);
    }
    public static void main(String [] e){
        new Equation();
    }
}
