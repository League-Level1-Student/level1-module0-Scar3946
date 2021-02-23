package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jackintheboz implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
JOptionPane.showMessageDialog(null, "woohoo");			
	}
  
	public void showButton () {
		System.out.println("Button Clicked");
	
		JFrame rame = new JFrame();
		rame.setVisible(true);
		rame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JButton button = new JButton();
		button.setText("Suprise");
		rame.add(button);
		rame.pack();
		button.addActionListener(this);
	 
}
}
