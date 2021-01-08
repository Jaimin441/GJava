import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet CODE="HandleMouseEvent" WIDTH=400 HEIGHT=300>
</applet>
*/

public class HandleMouseEvent extends Applet{
	String  msg;
	int mouseX = 0, mouseY = 0;

	public void init(){
		msg = "";

		//	Setting up dark theme
		setBackground(Color.black);
		setForeground(Color.cyan);

		addMouseListener(new MouseAdapter(){

			public void mousePressed(MouseEvent me){
				mouseX = me.getX();
				mouseY = me.getY();

				msg = "*";
				repaint();
			}

			public void mouseClicked(MouseEvent me){
				mouseX = 0;
				mouseY = 10;

				msg = "Mouse Clicked";
				repaint();
			}
		});

		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent me){
				mouseX = me.getX();
				mouseY = me.getY();
				msg = "*";
				showStatus("Mouse dragging at (" + me.getX() + ", " + me.getY() + ")");
				repaint();
			}
		});
	}

	public void paint(Graphics g){
		g.drawString(msg, mouseX, mouseY);
	}
}