package test;

import javax.swing.JFrame;

public class FrameCalculadora extends JFrame {
	
	public FrameCalculadora() {
		
		setTitle("Calculadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 500);
		
		getContentPane().add(new PanelCalculadora());

		setVisible(true);
	}
	

}
