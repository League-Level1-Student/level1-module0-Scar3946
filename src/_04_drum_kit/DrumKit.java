package _04_drum_kit;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrumKit implements MouseListener {

	JLabel drumLabelWithImage;

	public void run() throws MalformedURLException {

		// 1. Make a JFrame variable and initialize it using "new JFrame()"
JFrame cheese = new JFrame ();
		// 2. Make the frame visible and
		// set its default close operation to JFrame.EXIT_ON_CLOSE
cheese.setVisible(true);
cheese.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. Set the size of the frame
cheese.setSize(200, 200);
		// 4. Set the title of the frame
cheese.setTitle("druming");
		// 5. Make a JPanel variable and initialize it using "new JPanel().
JPanel code = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
cheese.add(code);
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "recipe package(drum_kit)".

		// 8. Put the name of your image file in a String variable.
String african = "africandrum.png";
String mozart = "DrumMozart.jpg";
String korean = "Koreandrum.jpg";
String bongos = "bongo drum.jpeg";
String dadrum  = "drum.png";
		// 9. Edit the next line to use your String variable
drumLabelWithImage = createLabelImage(bongos);
JLabel drumLabelWithImage2 = createLabelImage(dadrum);
JLabel drumLabelWithImage3 = createLabelImage(korean);
JLabel drumLabelWithImage4 = createLabelImage(mozart);
JLabel drumLabelWithImage5 = createLabelImage(african);

drumLabelWithImage2.setSize(100, 100);
drumLabelWithImage3.setSize(100, 100);


		// 10. Add the image to the panel
code.add(drumLabelWithImage);
code.add(drumLabelWithImage2);
code.add(drumLabelWithImage3);
code.add(drumLabelWithImage4);
code.add(drumLabelWithImage5);

		// 11. Set the layout of the panel to "new GridLayout()"
code.setLayout(new GridLayout());
		// 12. call the pack() method on the frame. Run your program. Do you see
		// your drum image?
cheese.pack();
		// 13. add this mouse listener to drumLabelWithImage
drumLabelWithImage.addMouseListener(this);
drumLabelWithImage2.addMouseListener(this);
drumLabelWithImage3.addMouseListener(this);
drumLabelWithImage4.addMouseListener(this);
drumLabelWithImage5.addMouseListener(this);
		// 18. Add more images to make a drumkit. Remember to add this mouse
		// listener to each one.

	}

	public void mouseClicked(MouseEvent e) {
		// 14. Print "mouse clicked" to the console. Run your program and watch
		// the console to see when this is printed.

		JLabel drumClicked = (JLabel) e.getSource(); // This line gets the label
														// that the mouse
														// clicked on

		// 15. Download a drum sound and drop it into your "recipe package(drum_kit)".
		// You can find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.]]

		// 16. If they clicked on the drumImage...
		
		if( drumClicked == drumLabelWithImage) {
			JOptionPane.showMessageDialog(null, "Playing drum 1");
		}

		// 17. ...use the playSound method to play a drum sound. Test to see if
		// it works

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
