import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//create Counter class
public class Counter implements ActionListener {

  //declare  instance variables  
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;

  //Counter  Constructor Creation
 Counter() {
   //set frame
   JFrame frame = new JFrame("Let's Count");
   frame.setLayout(new FlowLayout());
   
    //set size of frame
   frame.setSize(200,110);

    //create buttons
   JButton leftButton = new JButton("Left");
   JButton rightButton = new JButton("Right");

   leftButton.addActionListener(this);
   rightButton.addActionListener(this);

   int leftCount = 0;
   int rightCount = 0;


   frame.add(leftButton);
   frame.add(rightButton);

   leftLabel = new JLabel ("Count: " +leftCount);
   rightLabel = new JLabel ("Count: "+rightCount);
   
   frame.add(leftLabel);
   frame.add(rightLabel);

   JButton reset = new JButton("Reset");
   reset.addActionListener(this);
   frame.add(reset);

   frame.setVisible(true);
   
   
    }

    public void actionPerformed(ActionEvent ae) {
      if(ae.getActionCommand().equals("Left")){
        leftCount++;
        leftLabel.setText("Count: " + leftCount);
      }

      else if(ae.getActionCommand().equals("Right")){
        rightCount++;
        rightLabel.setText("Count: " + rightCount);
      }

      else {
        rightCount = 0;
        leftCount = 0;
        leftLabel.setText("Count: " + leftCount);
        rightLabel.setText("Count: " +rightCount);
      }
    }
   }