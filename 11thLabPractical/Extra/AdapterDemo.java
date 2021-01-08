import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet CODE=AdapterDemo WIDTH=400 HEIGHT=300>
</applet>
*/

public class AdapterDemo extends Applet{
	int mouseX, mouseY;
	String msg;

	public void init(){
		mouseX = mouseY = 0;
		msg = "";

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me){
				mouseX = 0;
				mouseY = 10;
				msg = "Mouse Clicked at (" + me.getX() + ", " + me.getY() + ")";
				repaint();
			}
		});

		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent me){
				showStatus("Mouse Moving at (" + me.getX() + ", " + me.getY() + ")");
			}
		});

		setBackground(Color.black);
		setForeground(Color.cyan);
	}

	public void paint(Graphics g){
		g.drawString(msg, mouseX, mouseY);
	}
}