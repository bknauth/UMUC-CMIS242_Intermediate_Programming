import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Week5Homework3 extends JFrame {
  // Create a panel for displaying message
  protected MessagePanel messagePanel
    = new MessagePanel("Welcome to Java");

  // Declare two buttons to move the message left and right
  private JButton jbtLeft = new JButton("<=");
  private JButton jbtRight = new JButton("=>");
  
  // Create radio buttons to set message colors.
  private JRadioButton jrbRed = new JRadioButton("Red");
  private JRadioButton jrbYellow = new JRadioButton("Yellow");
  private JRadioButton jrbWhite = new JRadioButton("White");
  private JRadioButton jrbGray = new JRadioButton("Gray");
  private JRadioButton jrbGreen = new JRadioButton("Green");

  public static void main(String[] args) {
    Week5Homework3 frame = new Week5Homework3();
    frame.setTitle("Week5Homework3");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setVisible(true);
  }

  public Week5Homework3() {
    // Set the background color of messagePanel
    messagePanel.setBackground(Color.white);
    
    // Create Panel jpButtons to hold two Buttons "<=" and "right =>"
    JPanel jpButtons = new JPanel();
    jpButtons.add(jbtLeft);
    jpButtons.add(jbtRight);
    
    // Create panel to hold radio buttons.
    JPanel jpRadioButtons = new JPanel();
    jpRadioButtons.add(jrbRed);
    jpRadioButtons.add(jrbYellow);
    jpRadioButtons.add(jrbWhite);
    jpRadioButtons.add(jrbGray);
    jpRadioButtons.add(jrbGreen);
    
    // Create a readio-button group
    ButtonGroup group = new ButtonGroup();
    group.add(jrbRed);
    group.add(jrbYellow);
    group.add(jrbWhite);
    group.add(jrbGray);
    group.add(jrbGreen);

    // Set keyboard mnemonics
    jbtLeft.setMnemonic('L');
    jbtRight.setMnemonic('R');

    // Set tool tip text on the buttons
    jbtLeft.setToolTipText("Move message to left");
    jbtRight.setToolTipText("Move message to right");
    
    // Place panels in the frame
    setLayout(new GridLayout(5, 1));
    add(new JLabel("Select Message Panel Background"));
    add(jpRadioButtons);
    add(messagePanel);
    add(jpButtons);
    
    
    // Register listeners with the buttons
    jbtLeft.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.moveLeft();
      }
    });
    jbtRight.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        messagePanel.moveRight();
      }
    });
    
    // Register listeners for radio buttons.
    jrbRed.addActionListener(new ActionListener(){
    @Override
      public void actionPerformed(ActionEvent e) {
      messagePanel.setBackground(Color.red);
      }
    });
    
    jrbYellow.addActionListener(new ActionListener(){
    @Override
      public void actionPerformed(ActionEvent e) {
      messagePanel.setBackground(Color.yellow);
      }
    });
    
    jrbWhite.addActionListener(new ActionListener(){
    @Override
      public void actionPerformed(ActionEvent e) {
      messagePanel.setBackground(Color.white);
      }
    });
    
    jrbGray.addActionListener(new ActionListener(){
    @Override
      public void actionPerformed(ActionEvent e) {
      messagePanel.setBackground(Color.gray);
      }
    });
    
    jrbGreen.addActionListener(new ActionListener(){
    @Override
      public void actionPerformed(ActionEvent e) {
      messagePanel.setBackground(Color.green);
      }
    });
  }
}
