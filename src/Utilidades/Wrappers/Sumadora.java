package Utilidades.Wrappers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Sumadora extends JFrame implements ActionListener{
	
	JTextField valor1;
	JTextField valor2;
	JLabel suma;
	JLabel igual;
	JLabel resultado;
	JButton sumar;
	Integer sumando1, sumando2;
	
Sumadora(){
	setTitle("Sumadora");
	setSize(300,80);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	getContentPane().setBackground(Color.RED);
	setLayout(new FlowLayout());
	valor1 = new JTextField("100",5);
	//valor1.addActionListener(this);
	valor2 = new JTextField("100",5);
	//valor2.addActionListener(this);
	suma = new JLabel ("+");
	igual = new JLabel("=");
	resultado = new JLabel("200");
	sumar = new JButton("Sumar");
	sumar.addActionListener(this);
	add(valor1);
	add(suma);
	add(valor2);
	add(igual);
	add(resultado);
	add(sumar);
	
	setVisible(true);
	//pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	try {
		
	
	sumando1=Integer.parseInt(valor1.getText());
	sumando2=Integer.parseInt(valor2.getText());
	resultado.setText(String.valueOf(sumando1 +sumando2));
	valor1.setText("");
	valor2.setText("");
	}
	catch (NumberFormatException ex) 
	{
		JOptionPane.showMessageDialog(null, "Los datos introducidos deben ser numericos");
		//System.out.println("Error: el dato introducido no se puede convertir en un double.");
		//ex.printStackTrace();
		valor1.setText("");
		valor2.setText("");
		resultado.setText("0.0");
	}
	}
	


	public static void main(String[] args) {
		new Sumadora();

	}


}
