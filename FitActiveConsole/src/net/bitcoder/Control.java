package net.bitcoder;

import javax.swing.JFrame;

public class Control extends JFrame {
	
	public Control() {
		
		
		setSize(800,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new ControlPanel());
	}

	public static void main(String[] args) {
		
		new Control();
	}


}
