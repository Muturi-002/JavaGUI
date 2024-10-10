package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Voter extends JFrame implements ActionListener{
    private JLabel lblUser,lblYoB;
    private JButton btnVote, btnExit;
    private JTextField txtUser, txtYoB;
    public Voter(){
        lblUser= new JLabel("User Name");
        lblYoB= new JLabel("Year of Birth");
        btnVote= new JButton("Vote");
        btnExit= new JButton("Exit");
        txtUser= new JTextField(20);
        txtYoB= new JTextField(20);
        setVisible(true);
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //btnVote.setBounds(50,5,100,70);
        setLayout(new FlowLayout());
        //setBounds();
        //setLayout(new GridLayout(3,2));
        add(lblUser);
        add(txtUser);
        add(lblYoB);
        add(txtYoB);
        add(btnVote);
        add(btnExit);
        btnExit.addActionListener(this);//'this' refers to the parent class generating the frame
        btnVote.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name= txtUser.getText();
                int yob= Integer.parseInt(txtYoB.getText());
                JOptionPane.showMessageDialog(null,"Name: "+name+"; Age: "+(2024-yob));
                if(2024-yob>=18)
                    JOptionPane.showMessageDialog(null,name+" ,You can vote!");
                else
                    JOptionPane.showMessageDialog(null,"Sorry "+name+", you can't vote");
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        int option=JOptionPane.showConfirmDialog(this, "Exit?");
        if(option==0)
            System.exit(0);
    }
    public static void main(String [] v){
        new Voter();
    }
}
