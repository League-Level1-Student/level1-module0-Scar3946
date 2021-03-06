package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String endermen = "https://static.wikia.nocookie.net/hypixel-skyblock/images/2/28/Enderman.png/revision/latest?cb=20200209104412";
		// 2. create a variable of type "Component" that will hold your image
Component comp;
		// 3. use the "createImage()" method below to initialize your Component
comp = createImage(endermen);
		// 4. add the image to the quiz window
quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String mining = JOptionPane.showInputDialog("What is this ?");
		// 7. print "CORRECT" if the user gave the right answer
if(mining.equalsIgnoreCase("enderman")) {
	System.out.println("CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	System.out.println("INCORRECT");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line
		// of code)
String ender = "https://upload.wikimedia.org/wikipedia/en/thumb/4/49/Creeper_%28Minecraft%29.png/220px-Creeper_%28Minecraft%29.png";
	endermen = ender ;	
// 11. add the second image to the quiz window
quizWindow.add(comp)
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String creeper = JOptionPane.showInputDialog("what is this");
		// 14+ check answer, say if correct or incorrect, etc.
if (creeper.equalsIgnoreCase("a creeper")) {
	System.out.println("CORRECT");
}
else{
	System.out.println("INCORRECT");
}
	
	
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
