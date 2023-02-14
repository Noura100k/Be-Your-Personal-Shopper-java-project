/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author msi9
 */
public class payment extends JFrame {
     JButton back;
     JButton pay;
    payment()
    {
       super("payment");
       Icon img = new ImageIcon(getClass().getResource("card1.png"));
       JLabel payment = new JLabel("PAYMENT PAGE",SwingConstants.CENTER);
       JLabel icon = new JLabel(img);
       Font f = new Font("Serif",Font.BOLD+Font.ITALIC, 38);//for page name
       Font f2 = new Font("Serif", Font.PLAIN, 20);//for the text of buttons
       payment.setFont(f);
       Box b1=Box.createHorizontalBox();
       
       JTextField card_num = new JTextField ("Card number");
       back= new JButton ("back to home page");
        back.setBackground(Color.decode("#6BCCC9"));
       JTextField cvi = new JTextField ("Enter CVI");
         pay = new JButton("PAY");
       pay.setBackground(Color.decode("#F7A058"));
       card_num.setBackground(Color.decode("#F5EFC5"));
       cvi.setBackground(Color.decode("#F5EFC5"));
       
       card_num.setFont(f2);
       cvi.setFont(f2);
       b1.add(card_num);
       b1.add(cvi);
       b1.add(pay);
       b1.add(back);
       
       add(BorderLayout.NORTH,payment);
       add(BorderLayout.CENTER,icon);
       add(BorderLayout.SOUTH,b1);
    
         handler h = new handler();
        pay.addActionListener(h);
        back.addActionListener(h);
    
    
    
    
    
    
    }
    
     public class handler implements ActionListener
    {
    
 
        public void actionPerformed(ActionEvent ae) {
           
         if(pay==ae.getSource())
         {
             
             
         }
         else
         {
              dispose();
         
            homepage h = new homepage();
            
h.setVisible(true);
h.setSize(800,800);
h.setLocationRelativeTo(null);
h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

         
         
         
         }
         
         
         
         
         
        }
    
}
}
