package MyFirstApp;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Container;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


public class NumbersGame 
{
	static int np = -1;
	static int w=0;
	static int g = 5;
	static String str = "-1";

	public static void main(String[] args) 
	{	
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Font font1 = new Font("SansSerif", Font.BOLD, 100);
		JTextField textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setPreferredSize(screenSize);
		textField.setFont(font1);

		
		textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
                if(((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    e.consume();
                }
            }
		});
		
		Random rand = new Random();
		int n=rand.nextInt(51);
		
		JLabel label1 = new JLabel("Test");
		label1.setText("Try to guess my number from 1 to 50! You have "+g+" guesses left");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setVerticalAlignment(SwingConstants.CENTER);
		
		JFrame frame = new JFrame("FrameExp");
		
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(label1);
		contentPane.add(textField);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(screenSize);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.pack();
		frame.setVisible(true);
		
		Action action = new AbstractAction()
		{
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("some action");
				label1.setText("Enter");
				str=textField.getText();
				np=Integer.parseInt(str);
				if(np != -1) 
				{	
					if(np==n) 
					{
						w=1;
					}
					else if(np < n) 
					{
						g=g-1;
						if(g==0) 
						{
							w=-1;
						}
						label1.setText("Too Low! You have "+g+ " guesses left! "+n+" is the number.");
					}else
					{
						g=g-1;
						if(g==0) 
						{
							w=-1;
						}
						label1.setText("Too High! You have "+g+ " guesses left! "+n+" is the number.");
					}
					
					if(w==1) 
					{
						label1.setText("Correct! You Win");
					}else if(w==-1) 
					{
						label1.setText("You Lost! The correct answer was "+n+" Try Again!");	
					}
				}
			}
		};
		textField.addActionListener(action);
		
	}
	
}