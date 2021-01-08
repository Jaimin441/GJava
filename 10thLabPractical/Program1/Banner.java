import java.applet.*; 
import java.awt.*; 
  
/* 
<applet code="Banner" width=500 height=100> 
</applet> 
*/
public class Banner extends Applet implements Runnable{
	String msg = "This is a normal msg";
	Thread t = null;
	boolean stopFlag;

	public void init(){
		setBackground(Color.black);
		setForeground(Color.cyan);
	}

	public void start(){
		for(int i = 0; i < 100; i++){ msg += " ";}
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}

	public void run(){
		char ch;

		while(true){
			try{
				repaint();
				Thread.sleep(150);

				ch = msg.charAt(0);
				msg = msg.substring(1, msg.length());
				msg += ch;
				if(stopFlag) break;
			}
			catch(InterruptedException e){}
		}
	}

	public void stop(){
		stopFlag = true;
		t = null;
	}
	public void paint(Graphics g){
		g.drawString(msg, 20, 40);
	}
}