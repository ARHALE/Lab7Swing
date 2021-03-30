import java.awt*;
import java.awt.event*;
import javax.swing*;

//create Counter class
public class Counter implements  ActionListener {
  
  //declare  instance variables
  Jlabel leftLabel;
  Jlabel rightLabel;
  int leftCount;
  int rightCount;

  //Counter  Constructor Creation
  Counter(){
    //set frame
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    
    //set size of frame
    frame.setSize(200,  110);

    //create buttons
    JButton leftButton = new JButton("Left");
    JButton rightButton = new JButton("Right");

    int leftCount = 0;
    int rightCount = 0;

    JLabel leftLabel = new JLabel("Count: " + leftCount);
    JLabel rightLabel = new JLabel("Count: " + rightCount);

    //Create action listeners
    leftButton.addActionListener(this);
    rightButton.addActionListener(this);
    //create reset button
    JButton reset = new JButton("Reset");
    reset.addActionListener(this);

   //add labes and buttons to frame
   frame.add(leftButton);
   frame.add(rightButton);
   frame.add(leftLabel);
   frame.add(rightLabel);
   frame.add(reset);
   //setframe  visible
   frame.setVisible(true);
  }
  //create action  performed method
    public void actionPerformed(ActionEvent ae) {
      if(ae.getActionCommand().equals("Left")){
        leftCount = leftCount + 1;
        leftLabel.setText("Count: " + leftCount);
      }

      else if(ae.getActionCommand().equals("Right")){
        rightCount = rightCount + 1;
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