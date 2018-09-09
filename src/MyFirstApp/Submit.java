package MyFirstApp;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class Submit implements KeyListener {

	String nameInput;

	int np = -1;
   
	
	public Submit(String textField, int rt){
		
		nameInput=textField;
		rt=np;
		
	    
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		

		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	    if (e.getKeyCode()==KeyEvent.VK_ENTER){
	    	 if(nameInput=="-1") {
	    		 
	    		 
	    	
	    	 }else {
	    		 np=Integer.parseInt(nameInput);
	    		 
	    	 }
	    }

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




}