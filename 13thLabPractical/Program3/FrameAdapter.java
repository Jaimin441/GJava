import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class FrameAdapter extends Frame{
	String status = "";
	String msg = "";
	int x=0, y=10;
	//	Handling Key Event
	public FrameAdapter(){
		addKeyListener(new KeyAdapter(){
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
		});

		//	Handling mouse Listener
		addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent me){
				x = 50;
				y = 100;
				msg = "Mouse entered In Applet";
				status = "";
				repaint();
			}

			public void mouseExited(MouseEvent me){
				x = 50;
				y = 100;
				msg = "Mouse left Applet";
				status = "";
				repaint();
			}

			public void mouseClicked(MouseEvent me){
				x = me.getX();
				y = me.getY();

				msg="Mouse Clicked";
				status = "";
				repaint();
			}

		});

		//	Handling Mouse Motion Listener
		addMouseMotionListener(new MouseMotionAdapter(){
				public void mouseDragged(MouseEvent me){
				x = me.getX();
				y = me.getY();
				msg = "*";
				repaint();
			}
		});

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g){
		g.drawString(msg, x, y);
	}

	public static void main(String arg[]){
		FrameAdapter frame = new FrameAdapter();
		frame.setTitle("My Frame");
		frame.setSize(500, 400);
		frame.setVisible(true);
	}
}