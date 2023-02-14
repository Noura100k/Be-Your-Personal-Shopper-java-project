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
import java.awt.event.WindowEvent;
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
public class homepage extends JFrame{
   JButton design_tool;
   JButton view_cart;
   JButton payment;
   JButton about;
     JButton exit;
   
    homepage ()
    {
    
      super("HOME PAGE");
       design_tool = new  JButton("design tool");
      view_cart = new  JButton("view cart");
       payment= new  JButton("payment");
      about= new  JButton("about us");
     
      JLabel text = new JLabel("HOME PAGE",SwingConstants.CENTER);
      Font f2 = new Font("Serif", Font.ITALIC+Font.BOLD, 28);
      Font f = new Font("Serif",Font.BOLD+Font.ITALIC, 38);//for page name
      design_tool.setFont(f);
      view_cart.setFont(f);
      payment.setFont(f);
      text.setFont(f);
      about.setFont(f);
       Icon img = new ImageIcon(getClass().getResource("house.png"));
      text.setIcon(img);
      about.setBackground(Color.decode("#E8EFAF"));
      design_tool.setBackground(Color.decode("#8ECECB"));
      view_cart.setBackground(Color.decode("#8ECECB"));
      payment.setBackground(Color.decode("#8ECECB"));
      view_cart.setForeground(Color.decode("#FFFFFF"));
      design_tool.setForeground(Color.decode("#FFFFFF"));
      payment.setForeground(Color.decode("#FFFFFF"));
      about.setForeground(Color.decode("#105F7A"));
 
      add(BorderLayout.NORTH,text);
      add(BorderLayout.WEST,design_tool);
      add(BorderLayout.CENTER,view_cart);
      add(BorderLayout.EAST,payment);
      add(BorderLayout.SOUTH,about);
     
    
      
       
    
    handler h = new handler();
    design_tool.addActionListener(h);
    view_cart.addActionListener(h);
    payment.addActionListener(h);
    }
   
    
      public class handler implements ActionListener
    {
    
 
        public void actionPerformed(ActionEvent ae) {
           
        if(design_tool==ae.getSource())
        {
            dispose();
               designTool h = new designTool();
    
               h.setVisible(true);
               h.setSize(800,800);
               h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               h.setLocationRelativeTo(null);
            
        }  
        else if(payment==ae.getSource())
        {
        
              dispose();
             payment h = new payment();
    
               h.setVisible(true);
               h.setSize(800,800);
               h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               h.setLocationRelativeTo(null);
        

        
        }
        else if(view_cart==ae.getSource())
        {
              dispose();
               Cart h = new Cart();
    
               h.setVisible(true);
               h.setSize(800,800);
               h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               h.setLocationRelativeTo(null);
          
        
        
        
        }
        else
        {
              
            
            
            
            
            
        }
        }
 
        

    
    
}
   

 
    
}
