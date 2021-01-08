import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MouseEvents" WIDTH=500 HEIGHT=300>
</applet>
*/

public class MouseEvents extends Applet 
	implements MouseListener, MouseMotionListener{
	String msg = "";
	int mouseX = 0, mouseY = 0;

	public void init(){
			addMouseListener(this);
			addMouseMotionListener(this);

			//	Setting up the dark theme.
			setBackground(Color.black);
			setForeground(Color.cyan);
	}

	//	Let's Handle the events

	//	Mouse click
	public void mouseClicked(MouseEvent me){
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Clicked ";
		repaint();
	}

	//	Mouse Enetred
	public void mouseEntered(MouseEvent me){
		mouseX = 0;
		mouseY = 10;
		repaint();
	}

	//	Mouse Exited
	public void mouseExited(MouseEvent me){
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Exited ";
		repaint();
	}

	//	Mouse Pressed
	public void mousePressed(MouseEvent me){
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Down";
		showStatus("Mouse Pressed.");
		repaint();
	}

	//	Mouse Releasaed
	public void mouseReleased(MouseEvent me){
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up";
		repaint();
	}

	//	Mouse Dragged
	public void mouseDragged(MouseEvent me){
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "*";
		showStatus("Dragging mouse at " + mouseX + " , " + mouseY);
		repaint();
	}

	//	Mouse Moved
	public void mouseMoved(MouseEvent me){
		showStatus("Moving mouse at " + me.getX() + " , " + me.getY());
	}

	public void paint(Graphics g){
		g.drawString(msg, mouseX, mouseY);
	}
}