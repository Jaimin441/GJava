import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class JustFrame extends Frame
 implements KeyListener, MouseListener, MouseMotionListener{
	String msg = "";
	String status = "";
	int x=50, y=60;

	public JustFrame(){
		setBackground(Color.black);
		setForeground(Color.cyan);

		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.out.println("Window closed...");
				System.exit(0);
			}
		});
	}

	//	Handling Key Event
	public void keyPressed(KeyEvent ke){
		status = "Key Pressed";
		x = 20;
		y = 50;
		repaint();
	}

	public void keyReleased(KeyEvent ke){
		status = "Key Pressed";
		x = 20;
		y = 50;
		repaint();
	}

	public void keyTyped(KeyEvent ke){
		msg += ke.getKeyChar(); 
		repaint();
	}

	//	Handling Mouse Motion Events
	public void mouseDragged(MouseEvent me){
		x = me.getX();
		y = me.getY();
		msg = "*";
		repaint();
	}

	public void mouseMoved(MouseEvent me){
		status = "Mouse moving at (" + me.getX() + ", " + me.getY() + ")";
		msg = "";
	}

	//	Handling Mouse Eventl
	public void mousePressed(MouseEvent me){
		x = 0;
		y = 10;

		msg = "Down";
		repaint();
	}

	public void mouseReleased(MouseEvent me){
		x = 0;
		y = 10;

		msg="UP";

		repaint();
	}

	public void mouseEntered(MouseEvent me){
		x = 0;
		y = 10;
		msg = "Mouse entered In Applet";
		repaint();
	}

	public void mouseExited(MouseEvent me){
		x = 0;
		y = 10;
		msg = "Mouse left Applet";
		repaint();
	}

	public void mouseClicked(MouseEvent me){
		x = me.getX();
		y = me.getY();

		msg="Mouse Clicked";
		repaint();
	}

	public void paint(Graphics g){
		g.drawString(msg, x, y);
		g.drawString(status, x+40, y+40);
	}

	public static void main(String arg[]){
		JustFrame frame = new JustFrame();
		frame.setSize(500, 400);
		frame.setTitle("Apna Frame");
		frame.setVisible(true);
	}
}