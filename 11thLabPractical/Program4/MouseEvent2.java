import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.lang.Math;
/*
<applet CODE="MouseEvent2" WIDTH=400 HEIGHT=300>
</applet>
*/

public class MouseEvent2 extends Applet
implements MouseListener{
	String msg = "";
	int lowerLimit, upperLimit;
	int primeNo, pLwrLmt, pUpLmt;	//	Prime Number, Prime Lower limit, Prime Upper Limit
	int angNo, angLwrLmt, angUpLmt;

	public void init(){
		String temp;
		addMouseListener(this);

		//	Setting dark theme
		setBackground(Color.black);
		setForeground(Color.cyan);

		lowerLimit = 2;
		upperLimit = 200;

		angLwrLmt = pLwrLmt = lowerLimit;
		angUpLmt = pUpLmt = upperLimit;
	}

	//	Prime number logic
	private boolean isPrime(int val){
		if(val == 1){ return false;}
		else if(val == 2){ return true; }
		else{
			for(int i = 2; i < val; i++){
				if(val % i == 0 ) return true;
			}
			return false;
		}
	}
	public void mouseEntered(MouseEvent me){
		if(pLwrLmt == pUpLmt){ 
			msg = "No prime Number left in given range"; 
			repaint();
		}
		primeNo = pLwrLmt;
		while(isPrime(primeNo) && primeNo <= pUpLmt){
			primeNo += 1;
		}
		msg = "Printing Prime = " + primeNo;
		primeNo += 1;
		pLwrLmt = primeNo;
		repaint();
	}

	//	Angstrom logic
	private boolean isAngstrong(int val){
		int temp, sum = 0, n_digit = 0;
		temp = val;
		while(temp != 0){
			n_digit += 1;	//	Getting the number of digit in val
			temp /= 10;
		}
		temp = val;

		while(temp != 0){
			sum += Math.pow(temp%10, n_digit);	//	Normal angstromg logic
			temp /= 10;
		}

		if(sum == val){ return true; }
		else{ return false; }
	}

	public void mouseExited(MouseEvent me){
		if(angLwrLmt == angUpLmt){ 
			msg = "No Angstrong Number left in given range"; 
			repaint();
		}
		angNo = angLwrLmt;
		while(!isAngstrong(angNo) && angNo <= angUpLmt){ 
			angNo += 1;
		}

		if(isAngstrong(angNo)){
			msg = "Printing Angstrong = " + angNo;
		}
		else{ 
			msg = ""; 
		}

		angNo += 1;
		angLwrLmt = angNo;
		repaint();
	}

	//	Handling the do nothing events
	public void mouseClicked(MouseEvent me){ 
		// DO NOTHING FUNCTION 
	}
	public void mousePressed(MouseEvent me){ 
		// DO NOTHING FUNCTION 
	}
	public void mouseReleased(MouseEvent me){ 
		// DO NOTHING FUNCTION 
	}

	public void paint(Graphics g){
		g.drawString(msg, 5, 10);
	}
}