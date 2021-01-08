import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Arc extends Frame{
	Arc(){
		setBackground(Color.black);
		setForeground(Color.cyan);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g){
		g.drawString("Anti-Clockwise", 30, 80);
		g.drawArc(40, 100, 150, 150, 330, 240);
		g.drawRect(20, 60, 200, 170);

		g.drawString("Anti-Clockwise", 250, 80);
		g.drawArc(270, 100, 150, 100, 330, -120);
		g.drawRect(240, 60, 200, 170);
	}

	public static void main(String arg[]){
		Arc obj = new Arc();
		obj.setTitle("Arc");
		obj.setSize(500, 400);
		obj.setVisible(true);
	}
}