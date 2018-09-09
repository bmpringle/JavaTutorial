package MyFirstApp;



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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;





public class NumbersGame 
{
	
	static char caracter= 'b';
	
	
	public static void main(String[] args) 
	{	

		 
		String str;
			
		int np = -1;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Font font1 = new Font("SansSerif", Font.BOLD, 100);
		JTextField textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setPreferredSize(screenSize);
		textField.setFont(font1);
		textField.setText("-1");
		str=textField.getText();
		
		
		textField.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent e) 
            {
                if((caracter > '0') || (caracter < '9'))
                {
            	caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) 
                	{
                    e.consume();
                
                    }
                
                }
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
       	    	 if(str=="-1") 
       	    	 	{
       	    		 
       	    		  np=-1;
       	    	
       	    	 	}else 
       	    	 	{
       	    		  np=Integer.parseInt(str);
       	    		 
       	    	 	}
                }
            }
        });
		
		int g=5;
		Random rand = new Random();
		int n=rand.nextInt(51);
		
		int w=0;
		
		JLabel label1 = new JLabel("Test");
		label1.setText("Try to guess my number from 1 to 50! You have "+g+" guesses left(Make sure to type 0 before a one digit number)");
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
		
		
		
		
		while (w==0) 
		{
			
			 
			
			 //np=Integer.parseInt(textField.getText());
			 
			 
				//System.out.println(textField.getText());
			
		
			/*KeyEvent e = new KeyEvent(textField, w, w, w, w, caracter);
			
			 if (e.getKeyCode()==KeyEvent.VK_ENTER){
			    	np=Integer.parseInt(textField.getText());
			    	
			    }*/
		
			
			
			//System.out.println(Integer.parseInt(textField.getText()));
			
			if(np != -1) 
			{	
				if(np==n) 
				{
					w=1;
					label1.setText("Correct! You Win");
			
 
				}else if(np < n) 
				{
		 		g=g-1;
		 		if(g==0) 
			 	{
				w=-1;
			 	}
			 
			 	label1.setText("Too Low! You have "+g+ " guesses left!(Make sure to type 0 before a one digit number)");
		 		}else
		 		{
		 			g=g-1;
		 			if(g==0) 
		 			{
		 				w=-1;
		 			}
			 
		 			label1.setText("Too High! You have "+g+ " guesses left!(Make sure to type 0 before a one digit number)");
		 		}
		 
			}
		
		}
		if(w==1) 
		{
			
		}else
		{
		 label1.setText("You Lost! The correct answer was "+g+" Try Again!");
		 
		}
	
	
	}
}
	

