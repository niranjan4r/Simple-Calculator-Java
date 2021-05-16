package calculatorproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niran
 */
public class Main implements ActionListener{
    JFrame jf;
    JLabel displayLabel;
    JButton B0, B1, B2, B3, B4, B5, B6, B7, B8, B9;
    JButton Bdiv, Bmult, Bdot, Bequal, Bsub, Badd, Bper;
    JButton BbrackOpen, BbrackClose, Bclear;
    int operator;
    double ans;
    
    Main() {
        jf = new JFrame();
        jf.setSize(600, 640);
        jf.setLocation(400, 100);
        jf.getContentPane().setBackground(Color.decode("#FFFFFF"));
        jf.setLayout(null);
        jf.setVisible(true);  
        
        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 530, 40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setFont(displayLabel.getFont().deriveFont(32f));
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        displayLabel.setOpaque(true);
        jf.add(displayLabel);
        
        // Row 0
        BbrackOpen = new JButton("(");
        BbrackOpen.setFont(new Font("Arial", Font.PLAIN, 32));
        BbrackOpen.addActionListener(this);
        BbrackOpen.setBounds(30, 130, 80, 80);
        jf.add(BbrackOpen);
        
        BbrackClose = new JButton(")");
        BbrackClose.setFont(new Font("Arial", Font.PLAIN, 32));
        BbrackClose.addActionListener(this);
        BbrackClose.setBounds(120, 130, 80, 80);
        jf.add(BbrackClose);
        
        Bper = new JButton("%");
        Bper.setFont(new Font("Arial", Font.PLAIN, 32));
        Bper.addActionListener(this);
        Bper.setBounds(210, 130, 80, 80);
        jf.add(Bper);
        
        Bclear = new JButton("AC");
        Bclear.setFont(new Font("Arial", Font.PLAIN, 32));
        Bclear.addActionListener(this);
        Bclear.setBounds(300, 130, 80, 80);
        jf.add(Bclear);
        
        // Row 1
        B7 = new JButton("7");
        B7.setFont(new Font("Arial", Font.PLAIN, 32));
        // B7.setBackground(Color.decode("#EEEEEE"));
        // B7.setBorderPainted(false);
        B7.addActionListener(this);
        B7.setBounds(30, 220, 80, 80);
        jf.add(B7);
        
        B8 = new JButton("8");
        B8.setFont(new Font("Arial", Font.PLAIN, 32));
        B8.addActionListener(this);
        B8.setBounds(120, 220, 80, 80);
        jf.add(B8);
        
        B9 = new JButton("9");
        B9.setFont(new Font("Arial", Font.PLAIN, 32));
        B9.addActionListener(this);
        B9.setBounds(210, 220, 80, 80);
        jf.add(B9);
        
        Bdiv = new JButton("/");
        Bdiv.setFont(new Font("Arial", Font.PLAIN, 32));
        Bdiv.addActionListener(this);
        Bdiv.setBounds(300, 220, 80, 80);
        jf.add(Bdiv);
        
        // Row 2
        B4 = new JButton("4");
        B4.setFont(new Font("Arial", Font.PLAIN, 32));
        B4.addActionListener(this);
        B4.setBounds(30, 310, 80, 80);
        jf.add(B4);
        
        B5 = new JButton("5");
        B5.setFont(new Font("Arial", Font.PLAIN, 32));
        B5.addActionListener(this);
        B5.setBounds(120, 310, 80, 80);
        jf.add(B5);
        
        B6 = new JButton("6");
        B6.setFont(new Font("Arial", Font.PLAIN, 32));
        B6.addActionListener(this);
        B6.setBounds(210, 310, 80, 80);
        jf.add(B6);
        
        Bmult = new JButton("*");
        Bmult.setFont(new Font("Arial", Font.PLAIN, 32));
        Bmult.addActionListener(this);
        Bmult.setBounds(300, 310, 80, 80);
        jf.add(Bmult);
        
        // Row 3
        B1 = new JButton("1");
        B1.setFont(new Font("Arial", Font.PLAIN, 32));
        B1.addActionListener(this);
        B1.setBounds(30, 400, 80, 80);
        jf.add(B1);
        
        B2 = new JButton("2");
        B2.setFont(new Font("Arial", Font.PLAIN, 32));
        B2.addActionListener(this);
        B2.setBounds(120, 400, 80, 80);
        jf.add(B2);
        
        B3 = new JButton("3");
        B3.setFont(new Font("Arial", Font.PLAIN, 32));
        B3.addActionListener(this);
        B3.setBounds(210, 400, 80, 80);
        jf.add(B3);
        
        Bsub = new JButton("-");
        Bsub.setFont(new Font("Arial", Font.PLAIN, 32));
        Bsub.addActionListener(this);
        Bsub.setBounds(300, 400, 80, 80);
        jf.add(Bsub);
        
        // Row 4
        Bdot = new JButton(".");
        Bdot.setFont(new Font("Arial", Font.PLAIN, 32));
        Bdot.addActionListener(this);
        Bdot.setBounds(30, 490, 80, 80);
        jf.add(Bdot);
        
        B0 = new JButton("0");
        B0.setFont(new Font("Arial", Font.PLAIN, 32));
        B0.addActionListener(this);
        B0.setBounds(120, 490, 80, 80);
        jf.add(B0);
        
        Bequal = new JButton("=");
        Bequal.setFont(new Font("Arial", Font.PLAIN, 32));
        Bequal.addActionListener(this);
        Bequal.setBounds(210, 490, 80, 80);
        jf.add(Bequal);
        
        Badd = new JButton("+");
        Badd.setFont(new Font("Arial", Font.PLAIN, 32));
        Badd.addActionListener(this);
        Badd.setBounds(300, 490, 80, 80);
        jf.add(Badd);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == B1) {
            displayLabel.setText(displayLabel.getText() + "1");
        } else if (e.getSource() == B2) {
            displayLabel.setText(displayLabel.getText() + "2"); 
        } else if (e.getSource() == B3) {
            displayLabel.setText(displayLabel.getText() + "3"); 
        } else if (e.getSource() == B4) {
            displayLabel.setText(displayLabel.getText() + "4"); 
        } else if (e.getSource() == B5) {
            displayLabel.setText(displayLabel.getText() + "5");
        } else if (e.getSource() == B6) {
            displayLabel.setText(displayLabel.getText() + "6");
        } else if (e.getSource() == B7) {
            displayLabel.setText(displayLabel.getText() + "7");
        } else if (e.getSource() == B8) {
            displayLabel.setText(displayLabel.getText() + "8");
        } else if (e.getSource() == B9) {
            displayLabel.setText(displayLabel.getText() + "9");
        } else if (e.getSource() == B0) {
            displayLabel.setText(displayLabel.getText() + "0");
        } else if (e.getSource() == Bdot) {
            displayLabel.setText(displayLabel.getText() + ".");
        } else if (e.getSource() == Bclear) {
            displayLabel.setText("");
        } else if (e.getSource() == Bmult) {
            operator = 3;
            ans = Double.parseDouble(displayLabel.getText());
            displayLabel.setText("");
        } else if (e.getSource() == Bsub) {
            operator = 2;
            ans = Double.parseDouble(displayLabel.getText());
            displayLabel.setText("");
        } else if (e.getSource() == Badd) {
            operator = 1;
            ans = Double.parseDouble(displayLabel.getText());
            displayLabel.setText("");
        } else if (e.getSource() == Bdiv) {
            operator = 4;
            ans = Double.parseDouble(displayLabel.getText());
            displayLabel.setText("");
        } else if (e.getSource() == Bequal) {
            switch (operator) {
                case 1 -> {
                    ans = ans + Double.parseDouble(displayLabel.getText());
                    displayLabel.setText(Double.toString(ans));
                    ans = 0;
                }
                case 2 -> {
                    ans = ans - Double.parseDouble(displayLabel.getText());
                    displayLabel.setText(Double.toString(ans));
                    ans = 0;
                }
                case 3 -> {
                    ans = ans * Double.parseDouble(displayLabel.getText());
                    displayLabel.setText(Double.toString(ans));
                    ans = 0;
                }
                case 4 -> {
                    ans = ans / Double.parseDouble(displayLabel.getText());
                    displayLabel.setText(Double.toString(ans));
                    ans = 0;
                }
                default -> displayLabel.setText("Invalid Operation!");
            }
        }
    }
}