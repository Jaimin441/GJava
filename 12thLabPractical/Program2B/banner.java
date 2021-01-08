import java.awt.*;
import java.applet.*;

/*
<applet CODE="banner" WIDTH=400 HEIGHT=300>
</applet>
*/

public class banner extends Applet implements Runnable{
	String str = "| This is a moving Banner |";
	Thread t = null;
	boolean flagState;

	public void init(){
		setBackground(Color.black);
		setForeground(Color.cyan);
	}
	public void start(){
		t = new Thread(this);
		flagState = false;
		t.start();
	}

	public void run(){
		try{

			while(true){
				repaint();
				Thread.sleep(250);

				char ch = str.charAt(1);

				str = "|" + str.substring(2, str.length()-1);
				str += ch + "|";

				if(flagState) break;
			}
		}catch(InterruptedException e){
			System.out.println("Thread Interrupted");
		}
	}

	public void stop(){
		t = null;
		flagState = true;
	}

	public void paint(Graphics g){
		g.drawString(str, 150, 150);
	}
}