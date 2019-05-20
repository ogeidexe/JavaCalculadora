package test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelCalculadora extends JPanel {
	private JButton       backSpace;
	private JButton[]     numeros;
	private JButton[]     operadore;
	private JPanel        teclado; 
	private JTextField    resultado;
	private EscreverCusor escrever;
	private char[]        operadoreCaracter;
	public PanelCalculadora () {
		
		backSpace         =  new JButton("<="); 
		numeros   		  =  new JButton[10];
		operadore 		  =  new JButton[6] ;
		operadoreCaracter =  new char[] {'/','*','-','+','.','='};
		teclado   		  =  new JPanel();
		resultado         =  new JTextField();
		escrever          =  new EscreverCusor();
		
		
		
		
				
		resultado.setFont(new java.awt.Font("DS", 1, 64));
		
		resultado.setEditable(false);
		
		//inicializa os meus botões 
		for(int i=0;i< numeros.length;i++) {
			
			numeros[i] = new JButton(Integer.toString( i) );// Stancia
			numeros[i].setPreferredSize(new Dimension(100, 100)); // define tamanho
			numeros[i].addActionListener(escrever);
			
		}
		
		
		//numeros[0].addActionListener(escrever);
		
		
		//inicializa operadores
		for(int i=0; i < operadore.length;i++) {
			operadore[i] = new JButton(Character.toString(operadoreCaracter[i]) );// Stancia
			operadore[i].setPreferredSize(new Dimension(100, 100)); // define tamanho
			operadore[i].addActionListener(escrever);
			
		}
		
		
		
		setLayout(new BorderLayout()); //defino o meu Painel principal como BorderLayut Not sul lest oest
		teclado.setLayout(new GridLayout(4,4)); // define o meu teclado como grid
	
		
		//colocando os meus botões no meu teclado
		teclado.add(numeros[7]);
		teclado.add(numeros[8]);
		teclado.add(numeros[9]);
		teclado.add(operadore[0]);
		
		
		teclado.add(numeros[4]);
		teclado.add(numeros[5]);
		teclado.add(numeros[6]);
		teclado.add(operadore[1]);
		

		teclado.add(numeros[1]);
		teclado.add(numeros[2]);
		teclado.add(numeros[3]);
		teclado.add(operadore[2]);
		
		

		teclado.add(operadore[4]);
		teclado.add(numeros[0]);
		teclado.add(operadore[5]);
		teclado.add(operadore[3]);
		
		
		
		add("North",resultado);// adiciono uma caixa de texto no meu layout principal
		add("Center",teclado);// coloca o meu teclado no centro do meu layout principal
		
		
	}
	
	
	
	private class EscreverCusor implements ActionListener {
		private  boolean numero = true;
		private  boolean operador = false;
		private  double  numero1;
		private  double  numero2;
		private  int     posicao;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//Caso algum botão for apertado essas funções escreve oque foi apertado na tela
			
			if(numero) {
				
				for(int i=0; i < numeros.length;i++) {
					
					if(e.getSource() == numeros[i]  ) {
						resultado.setEnabled(true);
						
						resultado.setText(resultado.getText() +" "+i);
						
						resultado.setEnabled(false);
						
						
						
						operador = true;
						
					}	
				}
			
				
				
			}
		
			//Caso algum botão for apertado essas funções escreve oque foi apertado na tela
			
			
			if(operador) {
				
				
				
				for(int i=0;i<operadore.length-1;i++) {
					
					if(e.getSource() == operadore[i]) {
						numero =false;
						
						resultado.setVisible(true);
						resultado.setText(resultado.getText() + " "+operadoreCaracter[i]);
					
						operador = false;
					
						numero =true;
					}
					
				}
				
				
			}
		
			
			
			
			if(e.getSource() == operadore[5]) {
				
							}
				
				
				
	
		}


	}
}