import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

// GUI Input Form for your class
// Fork this repl
// Copy your class into MyClass.java
// Add JLabels and JTextfields for your class attributes
// Uncomment code in actionPerformed() to write to a file and change the constructor call for your class.

public class Main {
  public static void main(String[] args) {
    // A JFrame is a window where we can design our UI
    JFrame frame = new JFrame("Input Form");
    frame.setSize(500, 500);
    // in FlowLayout, objects will be added in order
    frame.setLayout(new FlowLayout(FlowLayout.LEFT));

    // create Labels, TextFields, Buttons
    JLabel celebrityNameLabel = new JLabel("Enter Celebrity name");
    JTextField celebrityNameField = new JTextField(10); // size = 10
    JLabel clue1NameLabel = new JLabel("Enter clue 1");
    JTextField clue1NameField = new JTextField(10);
    
    JButton enterButton = new JButton("Enter");
    JLabel outputLabel = new JLabel();

    // add components to JFrame in this order
    frame.add(celebrityNameLabel);
    frame.add(celebrityNameField);
    frame.add(clue1NameLabel);
    frame.add(clue1NameField);
    frame.add(enterButton);
    frame.add(outputLabel);
    
    // add event listener for button click
    enterButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) 
    {
      // Create an object of your class with the form inputs
      Celebrity c = new Celebrity(celebrityNameField.getText(),
   clue1NameField.getText() );
      // print out in label using c.toString()
      outputLabel.setText("You entered "
                          + c);
      // Uncomment to write to the file output.txt
      /*
       try {
      FileWriter file = new FileWriter("output.txt", true); // true appends
      file.write(c  + "\n" );
      file.close();
     
    } catch (IOException ex) {
      System.out.println("An I/O error occurred.");
      ex.printStackTrace();
    }
       */
      
    }}); // end of actionlistener
    
    // make the frame visible
    frame.setVisible(true);
  }
}
