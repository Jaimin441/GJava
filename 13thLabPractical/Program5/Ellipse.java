import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Ellipse extends Frame{
	Ellipse(){
		setBackground(Color.black);
		setForeground(Color.cyan);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g){
		g.drawOval(200, 150, 50, 25);
	}

	public static void main(String arg[]){
		Ellipse obj = new Ellipse();
		obj.setTitle("Ellipse");
		obj.setSize(400, 300);
		obj.setVisible(true);
	}
}