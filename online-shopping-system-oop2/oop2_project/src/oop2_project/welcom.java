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
import javax.swing.SwingConstants;

/**
 *
 * @author msi9
 */
public class welcom extends JFrame {
    
    JButton sign_up;
    JButton sign_in ;
     
    welcom()
    {
      super("WELCOME");
      JLabel text = new JLabel("WELCOME TO PERSONAL SHOPPER APP",SwingConstants.CENTER);
       sign_in = new JButton("SIGN IN");
       sign_up = new JButton("SIGN UP");
      Icon img = new ImageIcon(getClass().getResource("welcome.png"));
       Font f = new Font("Serif",Font.BOLD+Font.ITALIC, 38);//for page name
       Font f2 = new Font("Serif", Font.PLAIN, 20);//for the text of buttons
      
      JLabel img1= new JLabel(img);
      Box b1=Box.createHorizontalBox();
      sign_in .setFont(f2);
      sign_up .setFont(f2);
     
      sign_up.setBackground(Color.decode("#FFD982"));
      sign_in.setBackground(Color.decode("#FFD982"));
    
      text.setFont(f);
      
      
       b1.add(sign_in );
       b1.add(sign_up);
       add(BorderLayout.NORTH,text);
       add(BorderLayout.CENTER,b1);
       add(BorderLayout.EAST,img1);
       
    
    
    
     handler h = new handler();
      sign_up.addActionListener(h);
      sign_in.addActionListener(h);
    
    
    }
     public class handler implements ActionListener
    {
    
 
        public void actionPerformed(ActionEvent ae) {
           
         if(sign_in==ae.getSource())
         {
             login h = new login();
            h.setVisible(true);
            h.setSize(800,800);
            h.setLocationRelativeTo(null);
            h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
         }
         else 
         {
           homepage h = new homepage();
            h.setVisible(true);
            h.setSize(800,800);
            h.setLocationRelativeTo(null);
            h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
             
             
         }
        }
    
    
    
     }
    
    
    
    
    
    
    
    
}
