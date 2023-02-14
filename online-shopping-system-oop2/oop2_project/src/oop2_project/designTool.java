/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author msi9
 */
public class designTool extends JFrame{
    JButton start_t;
    JButton start_s;
    JButton start_j;
    JButton start_a;
    designTool()
    {
     super("DESIGN TOOL");
      
      JTabbedPane tabed= new JTabbedPane();
      Font f = new Font("Serif", Font.PLAIN+Font.ITALIC, 40);
      Font f2 = new Font("Serif", Font.PLAIN+Font.ITALIC, 10);
      
      Icon imgT = new ImageIcon(getClass().getResource("shirtH.jpg"));
     
      
     start_t= new  JButton();
     start_s= new  JButton();
     start_a= new  JButton();
     start_j= new  JButton();
     //----------------------------
     Icon img2 = new ImageIcon(getClass().getResource("tshirt.png"));
     
     start_t.setIcon(imgT);
     start_t.setFont(f);
     start_t.setForeground(Color.decode("#BBD4EA"));
     start_t.setBackground(Color.LIGHT_GRAY);
     tabed.addTab("T-SHIRT",img2,start_t);
     tabed.setFont(f2);
     
     Icon img3 = new ImageIcon(getClass().getResource("sneaker.png"));
     Icon imgS = new ImageIcon(getClass().getResource("shoseH.jpg"));
     start_s.setIcon(imgS);
     start_s.setFont(f);
     start_s.setForeground(Color.decode("#BBD4EA"));
     start_s.setBackground(Color.LIGHT_GRAY);
     tabed.addTab("SHOES",img3,start_s);
     tabed.setFont(f2);
     
      Icon img4 = new ImageIcon(getClass().getResource("jean.png"));
      Icon imgJ = new ImageIcon(getClass().getResource("jeanH.jpg"));
      start_j.setIcon(imgJ);
      start_j.setFont(f);
      start_j.setForeground(Color.decode("#BBD4EA"));
      start_j.setBackground(Color.LIGHT_GRAY);
      tabed.addTab("JEANS",img4,start_j);
      tabed.setFont(f2);
     
      Icon img5 = new ImageIcon(getClass().getResource("watch.png"));
      Icon imgA = new ImageIcon(getClass().getResource("accessory.jpg"));
      start_a.setIcon(imgA);
      start_a.setFont(f);
      start_a.setForeground(Color.decode("#BBD4EA"));
      start_a.setBackground(Color.LIGHT_GRAY);
      tabed.addTab("Accessories",img5,start_a);
      tabed.setFont(f2);

     
     add(tabed);
     handler h = new handler();
     start_t .addActionListener(h);
     start_s.addActionListener(h);
     start_j.addActionListener(h);
     start_a.addActionListener(h);
      
    }   
      public class handler implements ActionListener
    {
    
 
        public void actionPerformed(ActionEvent ae) {
           
         if(start_t==ae.getSource())
         {
             
          dispose();        
        t_shirt h = new t_shirt();
        h.setVisible(true);
        h.setSize(800,800);
        h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        h.setLocationRelativeTo(null);
             
             
         }
         else if(start_s==ae.getSource())
         {
             
           dispose();       
        shoes h = new shoes();
        h.setVisible(true);
        h.setSize(800,800);
        h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        h.setLocationRelativeTo(null);
             
             
         }
         else if(start_j==ae.getSource())
         {
             
           dispose();       
        jeans h = new jeans();
        h.setVisible(true);
        h.setSize(800,800);
        h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        h.setLocationRelativeTo(null);
             
             
         }
         else 
         {
             dispose();
        Accessories h = new Accessories();
        h.setVisible(true);
        h.setSize(800,800);
        h.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        h.setLocationRelativeTo(null);
         
        
        }
    
         
     }
}  
    }
