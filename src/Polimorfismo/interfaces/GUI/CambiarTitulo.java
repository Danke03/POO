package Polimorfismo.interfaces.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class CambiarTitulo extends JFrame implements ActionListener{
	
	JButton pulsame;
	
	public CambiarTitulo() {
		setTitle("Cambiar titulo");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		pulsame = new JButton("pulsame");
		pulsame.addActionListener(this);
		add(pulsame);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		setTitle("Ahora me llamo Ventanita");
		getContentPane().setBackground(Color.CYAN);
	}
	public static void main (String[]args) {
		new CambiarTitulo();
	}
}
