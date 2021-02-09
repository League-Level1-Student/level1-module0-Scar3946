package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortuncookie {
public void showButton() {
	public class Fortuncookie implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	System.out.println("Button Clicked");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
	frame.pack();
 JOptionPane.showMessageDialog(null, "woohoo");
 button.addActionListener(null);
	
}
}
