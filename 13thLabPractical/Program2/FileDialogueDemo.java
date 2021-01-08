import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class FileDialogueDemo extends Frame implements ActionListener{
	Button b;
	FileDialog fd;
	FileDialogueDemo(String name){
		super(name);
		b = new Button("Open File");

		add(b);
		b.addActionListener(this);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
				System.out.println("Frame closed");
			}
		});
	}

	public void actionPerformed(ActionEvent ae){
		if(fd == null){
			System.out.println("File Dialog Created..");
			FileDialogueDemo tempF = new FileDialogueDemo("tempFrame");
			fd = new FileDialog(tempF, "File Dialog");
			fd.setVisible(true);
		}
	}

	public static void main(String arg[]){
		FileDialogueDemo obj = new FileDialogueDemo("MyFileDemo");
		obj.setSize(400, 400);
		obj.setVisible(true);
	}
}