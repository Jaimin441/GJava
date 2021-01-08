import java.applet.*;
import java.awt.*;

/*
<applet CODE="OddEven" WIDTH=500 HEIGHT=400>
</applet>
*/

public class OddEven extends Applet{
	static int val = 0;
	String msg;
	public void init(){
		setBackground(Color.black);
		setForeground(Color.cyan);
	}

	public void start(){
		if(val % 2 == 0) msg = val + " is EVEN ||";
		else msg = val + " is ODD ||";

		val+=1;
	}

	public void paint(Graphics g){
		g.drawString(msg, 100, 100);
	}
}