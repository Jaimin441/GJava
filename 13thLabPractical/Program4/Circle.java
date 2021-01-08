import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Circle extends Frame{
	Circle(){
		setBackground(Color.black);
		setForeground(Color.cyan);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g){
		g.drawOval(100, 50, 50, 50);
		// g.fillRoundRect(120, 120, 60, 60, 60, 60);
	}

	public static void main(String arg[]){
		Circle obj = new Circle();
		obj.setTitle("Circle");
		obj.setSize(400, 300);
		obj.setVisible(true);
	}
}