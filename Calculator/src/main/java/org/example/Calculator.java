package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JPanel panelDisplay, panelEnter;
    private JButton num9,num8,num7,num6,num5,num4,num3,num2,num1,num0,plus,minus,clear,mul,div,equals,period;
    private JTextField display;
    private double fnumber,lnumber;

    public Calculator(){
        panelDisplay= new JPanel();
        panelEnter= new JPanel();
        display= new JTextField(20);
        num0= new JButton("0");
        num1=new JButton("1");
        num2=new JButton("2");
        num3=new JButton("3");
        num4=new JButton("4");
        num5=new JButton("5");
        num6=new JButton("6");
        num7=new JButton("7");
        num8=new JButton("8");
        num9=new JButton("9");
        plus= new JButton("+");
        minus= new JButton("-");
        equals= new JButton("=");
        period= new JButton(".");
        mul=new JButton("*");
        div=new JButton("/");
        clear= new JButton("C");
        setVisible(true);
        setSize(200,300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        display.setBackground(Color.lightGray);
        display.setSize(200,100);
        add(panelDisplay, BorderLayout.SOUTH);
        add(panelEnter, BorderLayout.CENTER);
        panelDisplay.add(display);
        panelEnter.add(plus);
        panelEnter.add(minus);
        panelEnter.add(mul);
        panelEnter.add(div);
        panelEnter.add(num9);
        panelEnter.add(num8);
        panelEnter.add(num7);
        panelEnter.add(clear);
        panelEnter.add(num6);
        panelEnter.add(num5);
        panelEnter.add(num4);
        panelEnter.add(period);
        panelEnter.add(num3);
        panelEnter.add(num2);
        panelEnter.add(num1);
        panelEnter.add(num0);

    }
    public static void main(String [] c){
        new Calculator();
    }
    private class Entry implements ActionListener {

    }
}

