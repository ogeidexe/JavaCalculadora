package Interface;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class Main extends JFrame{
	
	JButton botao;
	JTextField caixaDeText;
	JTextArea  text;
	
	JPanel G;
	
	
	public Main(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setSize(300,500);
	
		
		setLayout(new BorderLayout());
		
		G = new JPanel();
		
		caixaDeText = new JTextField();
		
		
		G.setLayout(new GridLayout(5, 4));
		
		
		add("North", caixaDeText);

		caixaDeText.setText("Calcular");	
		
		add("Center",G);
		
		G.add(new JButton(" 0"));
		G.add(new JButton(" 1"));
		G.add(new JButton(" 2"));
		G.add(new JButton(" 3"));
		G.add(new JButton(" 4"));
		G.add(new JButton(" 5"));
		G.add(new JButton(" 6"));
		G.add(new JButton(" 7"));
		G.add(new JButton(" 8"));
		G.add(new JButton(" 9"));
		
		
		
		
		setVisible(true);
		
				
		
	}
	
	
	
	public static void main(String[] args) {
		Main janela = new Main();
		
		
	}

}
