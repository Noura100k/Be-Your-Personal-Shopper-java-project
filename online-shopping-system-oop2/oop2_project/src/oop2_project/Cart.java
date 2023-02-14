/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
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
public class Cart extends JFrame{
    
    JButton back;
    Cart()
    {
       
        
       super("CART");
       
       
      JLabel cart= new  JLabel("CART PAGE",SwingConstants.CENTER);
       Font f = new Font("Serif",Font.BOLD+Font.ITALIC, 38);//for page name
       Font f2 = new Font("Serif", Font.PLAIN, 20);//for the text of buttons
       cart.setFont(f);
      JLabel product_name= new  JLabel("product name");
      JLabel product_price= new  JLabel("product price");
      JLabel product_quantity= new  JLabel(" product quantity");
      TextArea name = new TextArea(20,10);
      TextArea price = new TextArea(20,10);
      TextArea quantity = new TextArea(20,10);
      Box b1=Box.createVerticalBox();
      Box b2=Box.createVerticalBox();
      Box b3=Box.createVerticalBox();
      JTextField total= new JTextField("total price");
      JButton checkout= new JButton ("Checkout");
      back= new JButton ("back to home page");
       Icon img = new ImageIcon(getClass().getResource("o.png"));
       JLabel icon = new  JLabel(img);
      checkout.setBackground(Color.decode("#6BCCC9"));
      back.setBackground(Color.decode("#6BCCC9"));
      total.setBackground(Color.decode("#D2DCE0"));
      name.setBackground(Color.decode("#E1DBD3"));
      price.setBackground(Color.decode("#E1DBD3"));
      quantity.setBackground(Color.decode("#E1DBD3"));
      
      checkout.setForeground(Color.decode("#FFFFFF"));
       back.setForeground(Color.decode("#FFFFFF"));
      product_name.setFont(f2);
      product_quantity.setFont(f2);
       product_price.setFont(f2);
      b1.add(product_name);
      b1.add(name);
      
      b2.add( product_price);
      b2.add(price );
     
      
      b3.add(product_quantity);
      b3.add(quantity);
       Box b4=Box.createHorizontalBox();
       b4.add(b1);
       b4.add(b2);
       b4.add(b3);
      
        Box b5=Box.createHorizontalBox();
      b5.add(total);
      b5.add(checkout);
      b5.add(back);
        
        

       add(BorderLayout.NORTH,cart);
      // add(BorderLayout.WEST,);
        add(BorderLayout.CENTER,b4);
        add(BorderLayout.EAST,icon);
       add(BorderLayout.SOUTH,b5);
    
       handler h = new handler();
       
        back.addActionListener(h);
    
    
    }
     public class handler implements ActionListener
    {
    
 
        public void actionPerformed(ActionEvent ae) {
           
         if(back==ae.getSource())
         {
              dispose();
         
            homepage h = new homepage();
            
               h.setVisible(true);
            h.setSize(800,800);
            h.setLocationRelativeTo(null);
            h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             
         }
         else
         {
             

         
         
         
         }
         
    
    
        }
    
    
    
     }
    
    
    
    
    
    
}
