package MyFirstApp;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class JFrameExp {
	public static void main(String[] args) 
	{

		/*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame frame = new JFrame("FrameExp");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(screenSize);
		frame.pack();
		frame.setVisible(true);*/
		/*JLabel label2 = new JLabel("Test");
		label2.setText("You have "+g+" guesses left");
		label2.setAlignmentX(SwingConstants.CENTER);
		label2.setAlignmentY(SwingConstants.CENTER);*/
		/*JLabel label1 = new JLabel("Test");
		label1.setText("Try to guess my number from 1 to 50!");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setVerticalAlignment(SwingConstants.CENTER);*/
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame frame = new JFrame("FrameExp");
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.add(label1);
		//frame.add(label2);
		frame.setPreferredSize(screenSize);
		frame.pack();
		frame.setVisible(true);
	}
}
