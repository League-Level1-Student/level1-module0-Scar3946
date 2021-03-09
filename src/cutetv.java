import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class cutetv {
	
public static void main(String[] args) {
	

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