/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week4homework2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Week4Homework2 extends JFrame {
  private JButton jbt1, jbt2, jbt3, jbt4, jbt5, jbt6;

  public static void main(String[] args) {
    Week4Homework2 frame = new Week4Homework2();
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Week4Homework2");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }

  public Week4Homework2() {
    // Create panel p1 add three buttons
    JPanel p1 = new JPanel();
    p1.setLayout(new FlowLayout());
    p1.add(jbt1 = new JButton("Button 1"));
    p1.add(jbt2 = new JButton("Button 2"));
    p1.add(jbt3 = new JButton("Button 3"));
    
    

    // Create Panel p2 and add three buttons
    JPanel p2 = new JPanel();
    p2.setLayout(new FlowLayout());
    p2.add(jbt4 = new JButton("Button 4"));
    p2.add(jbt5 = new JButton("Button 5"));
    p2.add(jbt6 = new JButton("Button 6"));

    // Place p1 and p2 in the frame
    setLayout(new FlowLayout());
    add(p1);
    add(p2);
  
  jbt1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      System.out.println("You pressed Button 1!");
      }
    }
  );
  
  jbt2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      System.out.println("You pressed Button 2!");
      }
    }
  );
  
  jbt3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      System.out.println("You pressed Button 3!");
      }
    }
  );
  
  jbt4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      System.out.println("You pressed Button 4!");
      }
    }
  );
  
  jbt5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      System.out.println("You pressed Button 5!");
      }
    }
  );
  
  jbt6.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      System.out.println("You pressed Button 6!");
      }
    }
  );
  
  }
}