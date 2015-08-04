package week8project3;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Week8Project3 extends JFrame {

    public static void main(String[] args) {
      Week8Project3 frame = new Week8Project3();
      frame.setSize(600,400);
      frame.setTitle("Week8FinalProjectSolution");
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);  
    }
    
    public Week8Project3(){
      setLayout(new GridLayout());
      //Create calendar.   
      Calendar myCalendar = new GregorianCalendar();
        
      //Obtain month and year.  
      int moy = myCalendar.get(Calendar.MONTH) + 1;
      int year = myCalendar.get(Calendar.YEAR);
      String moyString = Integer.toString(moy);
      String yearString = Integer.toString(year);
        
      //Obtain first day of the month.
      myCalendar.set(Calendar.DAY_OF_MONTH, 1);
      int firstDayOfMonth = myCalendar.get(Calendar.DAY_OF_WEEK);
        
      //Obtain number of days in month.
      int daysInMonth = myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
      
      //Create JLabel to display day and year above calendar.
      JLabel currentDate = new JLabel(moyString + "/" + yearString);
        currentDate.setHorizontalAlignment(JLabel.CENTER);

      //Create calendar.
      JPanel centerPanel = new JPanel();
        
        centerPanel.setLayout(new GridLayout(7,6));
        centerPanel.add(new JLabel("Sunday"));
        centerPanel.add(new JLabel("Monday"));
        centerPanel.add(new JLabel("Tuesday"));
        centerPanel.add(new JLabel("Wednesday"));
        centerPanel.add(new JLabel("Thursday"));
        centerPanel.add(new JLabel("Friday"));
        centerPanel.add(new JLabel("Saturday"));
        
        for(int j = 1; j < (daysInMonth + firstDayOfMonth); j++)
            
          if(j < firstDayOfMonth ){
              centerPanel.add(new JLabel(""));
          }
        
          else{
              String dayString = Integer.toString(j - firstDayOfMonth + 1);
              JLabel actualDays = new JLabel(dayString);
              actualDays.setBorder(BorderFactory.createLineBorder(Color.black));
              actualDays.setHorizontalAlignment(SwingConstants.RIGHT);
              actualDays.setVerticalAlignment(SwingConstants.TOP);
              centerPanel.add(actualDays);
          }
      
      //Place JLavel and calendar on JPanel.
      JPanel northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout());
        northPanel.add(currentDate, BorderLayout.NORTH);
        northPanel.add(centerPanel, BorderLayout.CENTER);
      
      //Add calendar to frame.
        add(northPanel);
    }
}
