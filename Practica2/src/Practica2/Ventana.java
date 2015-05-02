package Practica2;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Ventana extends JFrame implements ActionListener{
	
	JButton boton1, boton2, boton3, boton4;
	
	//crear u cosntructor
	Ventana()
	{
		setTitle("Torres de Hanoi - Juego");
		setBounds(300, 300, 640, 420);
		setVisible(true);
		Container contentpane = getContentPane();
		
		//inicializar los botones con el texto
		boton1 = new JButton("Instrucciones");
		boton2 = new JButton("Jugar");
		boton3 = new JButton("Records");
		boton4 = new JButton("Demo");
		
		//cuadrícula de la ventana
		contentpane.setLayout(new GridLayout(2,2));
		
		//Quitando los bordes de los botones
		boton1.setBorderPainted(false);
		boton2.setBorderPainted(false);
		boton3.setBorderPainted(false);
		boton4.setBorderPainted(false);
		
		//Agregando los botones para que se muestren en la ventana
		contentpane.add(boton1);
		contentpane.add(boton2);
		contentpane.add(boton3);
		contentpane.add(boton4);
		
		//
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		boton4.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == boton1){//Boton de isntrucciones
			System.out.println("Instrucciones");
		}
		else if (e.getSource() == boton2){//Boton de Jugar
			System.out.println("Jugar");			
		}
		else if (e.getSource() == boton3){//Boton de Records
			System.out.println("Records");			
		}
		else {
			System.out.println("Demo");//Boton de demo
		}
		
	}

}
