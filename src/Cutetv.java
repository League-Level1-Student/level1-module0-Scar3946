import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cutetv implements ActionListener {
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
			int rand = new Random().nextInt(5);
			 if(rand == 1) {
				 showDucks();
			 }
			 if (rand == 2) {
				showFrog();
			if (rand == 3) {
				showFluffyUnicorns();
//seriously a unicorn?
			}

			 }
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

		private JLabel createLabelImage(String fileName){
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