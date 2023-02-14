/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author msi9
 */
public class login extends JFrame{
    Font f = new Font("Serif", Font.PLAIN, 38);
    Font f2 = new Font("Serif", Font.ITALIC+Font.BOLD, 28);
    JLabel userName = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JTextField userN= new JTextField("Enter username");
    JTextField userP= new JTextField("Enter password",20);
    JPanel panel= new JPanel();
    Icon back = new ImageIcon(getClass().getResource("background.png"));
    JLabel image = new JLabel(back);
    JLabel login= new JLabel("LOGIN PAGE");
    JButton b = new JButton("login");
    JButton back_to_welcome= new JButton("back");
    

   
   
    
    
    login()
  {
      super("login");
      setLayout(null);
      userName.setFont(f);
      password.setFont(f);
      userName.setForeground(Color.decode("#62502A"));
      password.setForeground(Color.decode("#62502A"));
      login.setFont(f);
    
     
      Icon img = new ImageIcon(getClass().getResource("login_b.png"));
      login.setForeground(Color.decode("#62502A"));
      login.setIcon(img);
     
      
      userName.setBounds(100,150,350,350);
      userN.setBounds(310,310,250,38);
      password.setBounds(100,250,350,350);
      userP.setBounds(310,410,250,38);
      login.setBounds(180,1,350,110);
      b.setBounds(580,630,180,99);
      b.setBackground(Color.decode("#EAEBB7"));
      b.setFont(f2);
      b.setForeground(Color.decode("#62502A"));
      
      back_to_welcome.setBounds(30,630,180,99);
      back_to_welcome.setBackground(Color.decode("#EAEBB7"));
      back_to_welcome.setFont(f2);
      back_to_welcome.setForeground(Color.decode("#62502A"));
      
      
      
      
      
      
      
      userN.setBackground(Color.decode("#B1DAE9"));
      userP.setBackground(Color.decode("#B1DAE9"));
      
      add(userName);
      add(userN);
      add(password);
      add(userP);
      add(login);
      
      add(b);
    add(back_to_welcome);
    
      handler h = new handler();
    b.addActionListener(h);
    back_to_welcome.addActionListener(h);
    
    
    
                
  }
     public class handler implements ActionListener
    {
    
 
        public void actionPerformed(ActionEvent ae) {
           
         if(back_to_welcome==ae.getSource())
         {
              dispose();        
        welcom h= new welcom();
        h.setVisible(true);
        h.setSize(800,800);
        h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        h.setLocationRelativeTo(null);

         }
         else
         {
         
          dispose();   
        homepage h = new homepage();
        h.setVisible(true);
        h.setSize(800,800);
        h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        h.setLocationRelativeTo(null);
         
         
         
         
         
         
         
         
         }
         
         
         
         
         
         
         
        }
     }
    
    
    

}
