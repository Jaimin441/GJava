import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="OddEvenOnClick" WIDTH=400 HEIGHT=300>
</applet>
*/

public class OddEvenOnClick extends Applet 
	implements MouseListener{

	String msg = "";
	int num = 0;
	int mouseX = 0, mouseY = 0;
	//	Intitaliztion or assignment of listener to source

	public void init(){
		addMouseListener(this);

		//	Setting up the dark theme
		setBackground(Color.black);
		setForeground(Color.cyan);
	}

	//	Setting up Handlers

	public void mouseClicked(MouseEvent me){
		mouseX = 0;
		mouseY += 16; //	taking to the next line

		if(num % 2 == 0){
			msg = "Even Number :- " + num;
		}
		else{
			msg = "Odd Number :- " + num;
		}
		num += 1;
		repaint();
	}
	//	Now we implemented MouseListener interface so we need to implement the methods too
	// 	but as here they are of no use so we create a 'Do nothing function';
	public void mousePressed(MouseEvent me){	// do Nothing 
	}

	public void mouseReleased(MouseEvent me){
		// do Nothing
	}

	public void mouseEntered(MouseEvent me){
		// do Nothing
	}

	public void mouseExited(MouseEvent me){
		// do Nothing
	}

	public void paint(Graphics g){
		g.drawString(msg, mouseX, mouseY);
	}
}