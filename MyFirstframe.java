/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author MATSAKI CHABALALA
 */
public class MyFirstframe extends JFrame {
    
    public MyFirstframe(){
     setTitle("My first GUI");
     setSize(200,250);
     setDefaultLookAndFeelDecorated(true);
     setResizable(true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
  setForeground(Color.BLUE);
   setVisible(true);     
        
        
        
        
    }
    
}
