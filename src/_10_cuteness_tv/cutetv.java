package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cutetv implements ActionListener {
	  @Override
	  public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

	x+=1 ;
	if (e.getSource()== cheese) {
 showDucks();
 System.out.println("something");
 
	}
	if(e.getSource() == crocodile) {
		showFrog();
	}
	else {
		showFluffyUnicorns();
		//en serio?
		
	}
	  }
	  JButton button = new JButton();
	    JButton cheese = new JButton();
	    JButton crocodile = new JButton();
int x = 0 ;
	public void showButton () {
		System.out.println("Button Clicked");
	
		JFrame rame = new JFrame();
		rame.setVisible(true);
		rame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
		button.setText("the duck");
		JPanel panel = new JPanel();
		rame.add(panel);
		panel.add(button);
		rame.pack();
		panel.add(cheese);
		panel.add(crocodile);
		
		
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
