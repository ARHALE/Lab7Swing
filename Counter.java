//import libraries
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


  //create cunstructor for  counter
 Counter() {
   //declare & initialize frame
   JFrame frame = new JFrame("Let's Count");
   //set layout to flow layout
   frame.setLayout(new FlowLayout());
   
    //set size of frame
   frame.setSize(200,110);

    //create buttons
   JButton leftButton = new JButton("Left");
   JButton rightButton = new JButton("Right");

   leftButton.addActionListener(this);
   rightButton.addActionListener(this);
    //initialize Count Variables
   int leftCount = 0;
   int rightCount = 0;

    //add  buttons to frame
   frame.add(leftButton);
   frame.add(rightButton);

   //initialize instance variables
   leftLabel = new JLabel ("Count: " +leftCount);
   rightLabel = new JLabel ("Count: "+rightCount);
   
   //add labels to the frame
   frame.add(leftLabel);
   frame.add(rightLabel);

   JButton reset = new JButton("Reset");
   reset.addActionListener(this);
   frame.add(reset);

   frame.setVisible(true);
   
   
    }

    public void actionPerformed(ActionEvent ae) {
      if(ae.getActionCommand().equals("Left")){
        //could also write as leftCount++
        leftCount = leftCount+ 1;
       //set leftLabel to be the string "Count :" + the value of leftCount 
        leftLabel.setText("Count: " + leftCount);
      }

      else if(ae.getActionCommand().equals("Right")){
        rightCount = rightCount +1;
        //set rightLabel to be the string "Count :" + the value of rightCount 
        rightLabel.setText("Count: " + rightCount);
      }

      else {
        rightCount = 0;
        leftCount = 0;
        //set left & right  labels  to  be the string "Count: " + the value of each respective count
        leftLabel.setText("Count: " + leftCount);
        rightLabel.setText("Count: " +rightCount);
      }
    }
   }