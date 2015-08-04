import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Week6Project2 extends JFrame {

  public static void main(String[] args){
  Week6Project2 frame = new Week6Project2();
  frame.setSize(300,300);
  frame.setTitle("TestImageIcon");
  frame.setLocationRelativeTo(null);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
  
  private ImageIcon grapesIcon = new ImageIcon("image/grapes-1.gif");
  JLabel gat = new JLabel("Grapes", grapesIcon, JLabel.CENTER);
  
  //Declare Strings for ComboBoxes.
  private String[] horizontalAlignment = {"LEFT", "CENTER", "RIGHT"};
  private String[] verticalAlignment = {"TOP", "CENTER", "BOTTOM"};
  
  //Create two combo boxes for grapes alignment(GridLayout).
  
  private JComboBox cbGrapesHorizontal = new JComboBox(horizontalAlignment);
  private JComboBox cbGrapesVertical = new JComboBox(verticalAlignment);
  
  private JComboBox cbTextHorizontal = new JComboBox(horizontalAlignment);
  private JComboBox cbTextVertical = new JComboBox(verticalAlignment);
    
  
  public Week6Project2(){
    
    
    //Create panel holding grapesIcon and text.
    
    gat.setHorizontalTextPosition(JLabel.CENTER);
    gat.setVerticalTextPosition(JLabel.BOTTOM);
    gat.setIconTextGap(5);
    
    cbGrapesHorizontal.setSelectedIndex(1);
    cbGrapesVertical.setSelectedIndex(1);
    cbTextHorizontal.setSelectedIndex(1);
    cbTextVertical.setSelectedIndex(2);
    
    JPanel grapesAndText = new JPanel();
    grapesAndText.setLayout(new BorderLayout());
    grapesAndText.add(gat);
    
    //Create panel with two labels for grapes alignment (GridLayout).
    JPanel grapeLabels = new JPanel();
    grapeLabels.setLayout(new GridLayout(2,1));
    grapeLabels.add(new JLabel("Horizontal"));
    grapeLabels.add(new JLabel("Vertical"));
    
    //Create panel to hold grapes and text (GridLayout).
    JPanel cbGrapesPanel = new JPanel();
    cbGrapesPanel.setLayout(new GridLayout(2,1));
    cbGrapesPanel.add(cbGrapesHorizontal);
    cbGrapesPanel.add(cbGrapesVertical);
    
    //Create panel to hold both label panel and combo box panel for grapes 
    //(BorderLayout).
    JPanel grapesLabelsAndBoxes = new JPanel();
    grapesLabelsAndBoxes.setBorder(new TitledBorder("Horizontal Alignment"));
    grapesLabelsAndBoxes.setLayout(new GridLayout(1,2));
    grapesLabelsAndBoxes.add(grapeLabels);
    grapesLabelsAndBoxes.add(cbGrapesPanel);
    
    //Create panel with two labels for text position (GridLayout).
    JPanel textLabels = new JPanel();
    textLabels.setLayout(new GridLayout(2,1));
    textLabels.add(new JLabel("Horizontal"));
    textLabels.add(new JLabel("Vertical"));
    
    //Create panel for two combo boxes for text position (GridLayout).
    cbTextHorizontal.setSelectedItem("CENTER");
    cbTextVertical.setSelectedItem("TOP");
    
    JPanel cbTextPanel = new JPanel();
    cbTextPanel.setLayout(new GridLayout(2,1));
    cbTextPanel.add(cbTextHorizontal);
    cbTextPanel.add(cbTextVertical);
    
    //Create panel to hold both label panel and combo box panel for text
    //position (BorderLayout).
    JPanel textLabelsAndBoxes = new JPanel();
    textLabelsAndBoxes.setBorder(new TitledBorder("Text Position"));
    textLabelsAndBoxes.setLayout(new GridLayout(1,2));
    
    textLabelsAndBoxes.add(textLabels);
    textLabelsAndBoxes.add(cbTextPanel);
    
    //Create panel to hold alignment modifier panels (GridLayout).
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new GridLayout(1, 2));
    mainPanel.add(grapesLabelsAndBoxes);
    mainPanel.add(textLabelsAndBoxes);
    
    add(grapesAndText, BorderLayout.CENTER);
    add(mainPanel, BorderLayout.SOUTH);
    
    cbGrapesHorizontal.addActionListener(new ActionListener(){
        @Override
      public void actionPerformed(ActionEvent e) {
         if (cbGrapesHorizontal.getSelectedItem() == "LEFT") {
                    gat.setHorizontalAlignment(JLabel.LEFT);
                }
                else if (cbGrapesHorizontal.getSelectedItem() == "CENTER") {
                    gat.setHorizontalAlignment(JLabel.CENTER);
                }
                else {
                    gat.setHorizontalAlignment(JLabel.RIGHT);
                }
        }
    });
    
    cbGrapesVertical.addActionListener(new ActionListener(){
        @Override
      public void actionPerformed(ActionEvent e) {
         if (cbGrapesVertical.getSelectedItem() == "TOP") {
                    gat.setVerticalAlignment(JLabel.TOP);
                }
                else if (cbGrapesVertical.getSelectedItem() == "CENTER") {
                    gat.setVerticalAlignment(JLabel.CENTER);
                }
                else {
                    gat.setVerticalAlignment(JLabel.BOTTOM);
                }
        }
    });
    
    cbTextHorizontal.addActionListener(new ActionListener(){
        @Override
      public void actionPerformed(ActionEvent e) {
         if (cbTextHorizontal.getSelectedItem() == "LEFT") {
                    gat.setHorizontalTextPosition(JLabel.LEFT);
                }
                else if (cbTextHorizontal.getSelectedItem() == "CENTER") {
                    gat.setHorizontalTextPosition(JLabel.CENTER);
                }
                else {
                    gat.setHorizontalTextPosition(JLabel.RIGHT);
                }
        }
    });
    
    cbTextVertical.addActionListener(new ActionListener(){
        @Override
      public void actionPerformed(ActionEvent e) {
         if (cbTextVertical.getSelectedItem() == "TOP") {
                    gat.setVerticalTextPosition(JLabel.TOP);
                }
                else if (cbTextVertical.getSelectedItem() == "CENTER") {
                    gat.setVerticalTextPosition(JLabel.CENTER);
                }
                else {
                    gat.setVerticalTextPosition(JLabel.BOTTOM);
                }
        }
    });
    
  }
}
