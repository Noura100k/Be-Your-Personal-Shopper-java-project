/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_project;

import javax.swing.JFrame;

/**
 *
 * @author msi9
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class t_shirt extends JFrame {
    
    String product_name[]={"black shirt","yellow shirt","blue shirt","vlunteer shirt"};
    String images[]={"black.jpg","yellow.jpg","blue.jpg","v2.jpg"};
    String quantity[]={"select quantity","1","2","3","4"};
    //set fonts for jlabel
    Font f = new Font("Serif",Font.BOLD+Font.ITALIC, 38);//for page name
    Font f2 = new Font("Serif", Font.PLAIN, 10);//for the text of buttons
    //icons for buttons
    Icon img = new ImageIcon(getClass().getResource("ca.png"));
    Icon img2 = new ImageIcon(getClass().getResource("ho.png"));
    Icon img3 = new ImageIcon(getClass().getResource("se.png"));
   
    //buttons
    JButton back_design = new  JButton("BACK TO DESIGN TOOL",img3);
    JButton back = new  JButton("BACK TO HOMEPAGE",img2);
    JButton complete = new  JButton("COMPLETE OUTFIT",img); 
    JButton add_to_cart= new JButton("add to cart");
    JComboBox c = new JComboBox(quantity);
    //box 
    Box b1=Box.createHorizontalBox();
    Box b2=Box.createVerticalBox();
    Box b3=Box.createHorizontalBox();
    //labels
    
    JLabel text = new JLabel("T-SHIRT PAGE",SwingConstants.CENTER);
    JLabel text1 = new JLabel();
    JLabel text2 = new JLabel("price is:");
    //jlist that dispaly product name
    JList Tshirt_list=new  JList(product_name);
    //price
    JTextField price =new  JTextField("price");
    JTextField total_price =new  JTextField("total price");
    
     t_shirt()
     {
     
      Tshirt_list.setBackground(Color.decode("#9DC7CE"));
     
      Tshirt_list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      
      text.setFont(f);
      text.setForeground(Color.decode("#62502A"));
      text.setFont(f);
      complete.setBackground(Color.decode("#385768"));
      complete.setForeground(Color.decode("#FFFFFF"));
      complete.setFont(f2);
      back_design.setBackground(Color.decode("#385768"));
      back_design.setForeground(Color.decode("#FFFFFF"));
      back_design.setFont(f2);
      back.setBackground(Color.decode("#385768"));
      back.setForeground(Color.decode("#FFFFFF"));
      text1.setBackground(Color.decode("#C7DAD6"));
      back.setFont(f2);
      add_to_cart.setBackground(Color.decode("#5D8989"));
      add_to_cart.setForeground(Color.decode("#FFFFFF"));
      c.setBackground(Color.decode("#BDE5C9"));
      total_price.setBackground(Color.decode("#F0F3DC"));
      price.setBackground(Color.decode("#F0F3DC"));
      b1.add(back_design);
      b1.add(back);
      b1.add(complete);
      
      b2.add(text1);
      b2.add(price);
     
      
      b3.add(text);
      b3.add(c);
      b3.add(add_to_cart);
      b2.add(b3);
      b2.add(total_price);
      
      add(BorderLayout.SOUTH,b1);
       add(BorderLayout.NORTH,text);
      add(BorderLayout.CENTER,Tshirt_list);
      add(BorderLayout.EAST,b2);
     
      Tshirt_list.addListSelectionListener(
       new ListSelectionListener()
       {
       
      
         public void valueChanged(ListSelectionEvent lse) {
            
             
             Icon img = new ImageIcon(getClass().getResource(images[Tshirt_list.getSelectedIndex()]));
             text1.setIcon(img);
         }

       
       }

      );
      
       
     handler h = new handler();
    back_design.addActionListener(h);
    back.addActionListener(h);
    complete.addActionListener(h);
     
     }
    public class handler implements ActionListener
    {
    
 
        public void actionPerformed(ActionEvent ae) {
           
             if(back_design==ae.getSource())
         {
             
            dispose();      
        designTool h = new designTool();
        h.setVisible(true);
        h.setSize(800,800);
        h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        h.setLocationRelativeTo(null);
             
             
         }
        else if(back==ae.getSource())
         {
             
               dispose();   
        homepage h = new homepage();
        h.setVisible(true);
        h.setSize(800,800);
        h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        h.setLocationRelativeTo(null);
             
             
         }
        else
        {
        dispose();
        shoes h = new shoes();
        h.setVisible(true);
        h.setSize(800,800);
        h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        h.setLocationRelativeTo(null);
        
        
        
        
        
        }


            
            
        }  

    
    
}
}