package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BITGui extends JFrame{
    JLabel lblUserName, lblPass, lblConfPass;
    JTextField txtUserName,txtPass, txtConfPass;
    JRadioButton rbtnNew, rbtnExist;
    JButton btnwUser, btnExit;
    public BITGui(){
        lblUserName= new JLabel("User Name");
        lblPass= new JLabel("Password");
        lblConfPass= new JLabel("Confirm Password");
        txtUserName= new JTextField();
        txtPass= new JTextField();
        txtConfPass= new JTextField();
        rbtnNew= new JRadioButton("New User");
        rbtnExist= new JRadioButton("Existing User");
        ButtonGroup group1= new ButtonGroup();
        group1.add(rbtnNew);
        group1.add(rbtnExist);
        btnwUser= new JButton("Which User");
        btnExit= new JButton("Exit");
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(5,2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("SignUp/Login");
        JMenuBar bar= new JMenuBar();
        setJMenuBar(bar);
        JMenu mnuFile, mnuEdit, mnuOpen;
        mnuFile= new JMenu("File");
        mnuEdit= new JMenu("Edit");
        mnuOpen= new JMenu("Open");
        bar.add(mnuFile);
        bar.add(mnuOpen);
        bar.add(mnuEdit);
        add(lblUserName);
        add(txtUserName);
        add(rbtnNew);
        add(rbtnExist);
        add(lblPass);
        add(txtPass);
        add(lblConfPass);
        add(txtConfPass);
        add(btnwUser);
        add(btnExit);
        txtPass.setEditable(false);
        txtConfPass.setEditable(false);
        //btnExit.addActionListener((ActionListener) this);
        rbtnNew.addActionListener(new Handler());
        rbtnExist.addActionListener(new Handler());
        btnwUser.addActionListener(new Handler());
        JMenuItem mnuSave, mnuClose;
        mnuSave= new JMenuItem("Save");
        mnuClose= new JMenuItem("Exit");
        JMenuItem mnuNew= new JMenuItem("New");
        mnuFile.add(mnuSave);
        mnuFile.add(mnuNew);
        mnuFile.add(mnuClose);
        mnuClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=JOptionPane.showConfirmDialog(null, "Are You Sure You Want to Exit?");
                if(x==0)
                    System.exit(0);
            }
        });
    }
    private class Handler implements ActionListener{
        public void actionPerformed(ActionEvent c) {
            if(c.getSource()==rbtnNew){
                txtPass.setEditable(true);
                txtConfPass.setEditable(true);
                btnwUser.setText("Sign Up");
            }
            if(c.getSource()==rbtnExist){
                txtPass.setEditable(true);
                btnwUser.setText("Login");
            }
            if(c.getActionCommand().equalsIgnoreCase("which User")){
                JOptionPane.showMessageDialog(null,"Select type of user!!");
            }
            if(c.getActionCommand().equals("Sign Up")){
                String pass= txtPass.getText();
                String cPass= txtConfPass.getText();
                if(pass.equals(cPass)){
                    JOptionPane.showMessageDialog(null,"Successful Sign Up!");
                }else{
                    JOptionPane.showMessageDialog(null, "Password not matching. Try Again.");
                }
            }
            if(c.getActionCommand().equals("Login")){
                String name= txtUserName.getText();
                String pass=txtPass.getText();
                if(name.equalsIgnoreCase("Student")){
                    if(pass.equals("BIT 2.2")){
                        JOptionPane.showMessageDialog(null,"Successful Login!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Wrong Password. Try again");
                    }
                }
            }
        }
    }
    /*public void actionPerformed(ActionEvent c){
        int option= JOptionPane.showConfirmDialog(this,"Exit??");
        if(option==1){
            System.exit(0);
        }
    }*/
    public static void main(String [] b){
        new BITGui();
    }
}
