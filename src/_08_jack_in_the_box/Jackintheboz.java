package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Jackintheboz implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

x+=1 ;
if (x == 5) {
JOptionPane.showMessageDialog(null, "woohoo");
showPicture("jackInTheBox.png");
}
	}

  int x = 0 ;
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
	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
	
}
