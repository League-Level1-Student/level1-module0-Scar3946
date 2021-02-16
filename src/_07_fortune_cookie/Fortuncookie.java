package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Fortuncookie implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
JOptionPane.showMessageDialog(null, "woohoo");			
		}
		
public void showButton () {
	System.out.println("Button Clicked");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton button = new JButton();
	button.setText("click me ");
	frame.add(button);
	frame.pack();
 
 button.addActionListener(this);
 int rand = new Random().nextInt(5);
 if(rand == 1) {
	 JOptionPane.showMessageDialog(null, "you will eat cheese");
 }
 if (rand == 2) {
	 JOptionPane.showMessageDialog(null," you will eat an apple" );
if (rand == 3) {
	JOptionPane.showMessageDialog(null, "you will play videogames");

}

 }
		}	
}

