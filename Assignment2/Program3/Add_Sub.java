import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class Add_Sub extends Frame
	implements ActionListener{
	
	Button add, sub, clear, quit;
	TextField values[] = new TextField[4];
	
	Add_Sub(){
		setLayout(new GridLayout(4, 2));
		String msg = "Integer";
		for(int i = 0; i < values.length; i++){
			if(i == 2) msg = "Float";
			values[i] = new TextField(30);
			values[i].setText(msg);
			add(values[i]);	//	We wont assign action with text field
		}

		add = new Button("Add");
		sub = new Button("Sub");
		clear = new Button("Clear");
		quit = new Button("Quit");

		add(add);
		add(sub);
		add(clear);
		add(quit);

		add.addActionListener(this);
		sub.addActionListener(this);
		clear.addActionListener(this);
		quit.addActionListener(this);
		quit.addActionListener(this);

		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	//	Get index value for int/flaot textField
	public int getActiveIndex(TextField tfs[]){
		String str1 = "", str2 = "";
		for(int i = 0; i < tfs.length; i+=2){

			str1 = tfs[i].getText();
			str2 = tfs[i+1].getText();

			if(str1.startsWith("Ans")) continue;
			if(str1.length() != 0 && str2.length() != 0){ return i; }
		}

		return -1;
	}

	//	Method to Perform add/Sub over Int/Float
	public void performAction(float val1, float val2, boolean isFloat, String opt, TextField textField){
		String ans = "Ans: ";
		if(opt.equals("Add")){
			if(isFloat) ans += val1 + " + " + val2 + " = " + (val1 + val2);
			else ans += (int)val1 + " + " + (int)val2 +  " = " + (int)(val1 + val2);
		}
		else{
			if(isFloat) ans += val1 + " - " + val2 + " = " + (val1 - val2);
			else ans += (int)val1 + " - " + (int)val2 +  " = " + (int)(val1 - val2);
		}
		textField.setText(ans);
	}

	//	Handling Action Event
	public void actionPerformed(ActionEvent ae){
		String str = ae.getActionCommand();
		System.out.println("Action = " + str);
		int indx = getActiveIndex(values);
		float val1 = 0, val2 = 0;
		boolean isFloat = true;

		//	Check for Which textField is set;
		if(indx == -1){
			values[0].setText("Invalid Values!!!!");
			values[2].setText("Invalid Values!!!!");
		}
		else if(indx == 0){
			val1 = Float.parseFloat(values[0].getText());
			val2 = Float.parseFloat(values[1].getText());
			isFloat = false;
		}
		else{
			val1 = Float.parseFloat(values[2].getText());
			val2 = Float.parseFloat(values[3].getText());
		}
		
		//	Check which button is Set;
		if(str.equals("Add")){
			performAction(val1, val2, isFloat, str, values[indx]);
		}
		else if(str.equals("Sub")) {
			performAction(val1, val2, isFloat, str, values[indx]);
		}
		else if(str.equals("Clear")){
			for(int i = 0; i < values.length; i++){values[i].setText(""); }
		}
		else{
			System.exit(0);
		}

		repaint();
	}

	public static void main(String arg[]){
		Add_Sub frame = new Add_Sub();
		frame.setSize(new Dimension(600, 400));
		frame.setTitle("Assignment 2");
		frame.setVisible(true);
		frame.setFont(new Font("SansSerif", Font.PLAIN, 30));
	}
}