import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

        

public class FirstGUI extends JFrame{
    
    public static void main(String[] args) {
      JFrame frame = new FirstGUI();
      
      JPanel panel = new JPanel();
      
      
      JButton jbtOK = new JButton("OK");
      
      panel.setLayout(null);
      
      jbtOK.setBounds(225, 150, 75, 25);
      jbtOK.setToolTipText("Click OK to proceed.");
      jbtOK.setForeground(Color.red);
      jbtOK.setBackground(Color.yellow);
      jbtOK.setMnemonic('K');
      jbtOK.setHorizontalAlignment(SwingConstants.RIGHT);
      jbtOK.setVerticalAlignment(SwingConstants.BOTTOM);
      jbtOK.setHorizontalTextPosition(SwingConstants.LEFT);
      jbtOK.setVerticalTextPosition(SwingConstants.TOP);
      jbtOK.setIconTextGap(5);
      
      panel.setBounds(200, 100, 100, 100);
      
      panel.add(jbtOK);
      frame.add(panel);
      
      frame.setTitle("FirstGUI");
      frame.setSize(325,225);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
}
