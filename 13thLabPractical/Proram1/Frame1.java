import java.awt.*;
import java.awt.event.*;
import java.applet.*;
	
/*
<applet CODE=Frame1 WIDTH=400 HEIGHT=300>
</applet>
*/

//	Frame class with annoymous Adapter class
class Sampleframe extends Frame 
	implements MouseListener, MouseMotionListener, KeyListener{
	String fmsg = "";
	int fx=100, fy=200;

	Sampleframe(String title){
		super(title);

		setBackground(Color.black);
		setForeground(Color.cyan);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				setVisible(false);
			}
		});

		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
	}

	public void mousePressed(MouseEvent me){
		fx = me.getX();
		fy = me.getY();

		fmsg = "Down";
		repaint();
	}

	public void mouseReleased(MouseEvent me){
		fx = me.getX();
		fy = me.getY();

		fmsg="UP";
		repaint();
	}

	public void mouseEntered(MouseEvent me){
		fx = 50;
		fy = 100;
		fmsg = "Mouse entered In Frame";
		repaint();
	}

	public void mouseExited(MouseEvent me){
		fx = 50;
		fy = 100;
		fmsg = "Mouse left Frame";
		repaint();
	}

	public void mouseClicked(MouseEvent me){
		fx = me.getX();
		fy = me.getY();

		fmsg="Mouse Clicked";
		repaint();
	}

	public void mouseDragged(MouseEvent me){
		fx = me.getX();
		fy = me.getY();
		fmsg = "*";
		repaint();
	}

	public void mouseMoved(MouseEvent me){
		fmsg = "Mouse moved at ( " + me.getX() + ", " + me.getY() + ")";
		fx=50;
		fy=100;
		repaint();
	}

	//	Handling key event;
	public void keyPressed(KeyEvent ke){
		if(fmsg.startsWith("Key")){
			fmsg = "";
		}
		else{
			fmsg="Key Released";
		}
		fx = 20;
		fy = 50;
	}

	public void keyReleased(KeyEvent ke){
		if(fmsg.startsWith("Key")){
			fmsg = "";
		}
		else{
			fmsg="Key Released";
		}
		fx = 20;
		fy = 50;
		fmsg="Key Released";
	}

	public void keyTyped(KeyEvent ke){
		fmsg += ke.getKeyChar(); 

		repaint();
	}
	public void paint(Graphics g){
		
		g.drawString(fmsg, fx, fy);
	}
}

public class Frame1 extends Applet{
	Sampleframe frame;

	String msg = "";
	int x=0, y=0;

	public void init(){
		frame = new Sampleframe("MyFrame");
		frame.setSize(400, 300);
		frame.setVisible(true);

		requestFocus();
		//	Handling mouse Event
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent me){
				x = me.getX();
				y = me.getY();

				msg = "Down";
				showStatus("Mouse Pressed");
				repaint();
			}

			public void mouseReleased(MouseEvent me){
				x = me.getX();
				y = me.getY();

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

		});

		//	Handling Mouse motion event
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent me){
				x = me.getX();
				y = me.getY();
				msg = "*";
				repaint();
			}

			public void mouseMoved(MouseEvent me){
				showStatus("Mouse moving at (" + me.getX() + ", " + me.getY() + ")");
			}
		});

		addKeyListener(new KeyAdapter(){
			//	Handling key event;
			public void keyPressed(KeyEvent ke){
				if(msg.startsWith("Key")){
					msg = "";
				}
				else{
					msg="Key Pressed";
				}
				x = 20;
				y = 50;
			}

			public void keyReleased(KeyEvent ke){
				if(msg.startsWith("Key")){
					msg = "";
				}
				else{
					msg="Key Released";
				}
				x = 20;
				y = 50;
			}

			public void keyTyped(KeyEvent ke){
				msg += ke.getKeyChar();
				repaint();
			}
		});
	}

	public void paint(Graphics g){
		g.drawString(msg, x, y);
	}	
}