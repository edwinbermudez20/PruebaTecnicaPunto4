package co.com.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener{
	
	JPanel base = (JPanel) this.getContentPane();
	JTextField jTextField = new JTextField();
	JButton jButton1 = new JButton("1");
	JButton jButton2 = new JButton("2");
	JButton jButton3 = new JButton("3");
	JButton jButtonDel = new JButton("DEL");
	
	JButton jButton4 = new JButton("4");
	JButton jButton5 = new JButton("5");
	JButton jButton6 = new JButton("6");
	JButton jButtonS = new JButton("+");
	
	JButton jButton7 = new JButton("7");
	JButton jButton8 = new JButton("8");
	JButton jButton9 = new JButton("9");
	JButton jButtonR = new JButton("-");
	
	JButton jButtonM = new JButton("*");
	JButton jButton0 = new JButton("0");
	JButton jButtonD = new JButton("/");
	JButton jButtonP = new JButton(".");
	
	JButton jButtonI = new JButton("=");
	
	public Calculadora() {
		base.setLayout(null);
		setSize(350, 450);
		setTitle("CALCULADORA");
		setVisible(true);
		
		jTextField.setBounds(22, 8, 288, 70);
		jTextField.setFont(new Font("tahoma", Font.BOLD, 25));
		add(jTextField);
		
		jButton1.setBounds(22, 83, 60, 60);
		jButton1.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButton1);
		jButton1.addActionListener(this);
		
		jButton2.setBounds(87, 83, 60, 60);
		jButton2.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButton2);
		jButton2.addActionListener(this);
		
		jButton3.setBounds(152, 83, 60, 60);
		jButton3.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButton3);
		jButton3.addActionListener(this);
		
		jButtonDel.setBounds(217, 83, 92, 60);
		jButtonDel.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButtonDel);
		jButtonDel.addActionListener(this);
		
		//--------------------------------------------------------
		
		jButton4.setBounds(22, 148, 60, 60);
		jButton4.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButton4);
		jButton4.addActionListener(this);
		
		jButton5.setBounds(87, 148, 60, 60);
		jButton5.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButton5);
		jButton5.addActionListener(this);
		
		jButton6.setBounds(152, 148, 60, 60);
		jButton6.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButton6);
		jButton6.addActionListener(this);
		
		jButtonS.setBounds(217, 148, 92, 60);
		jButtonS.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButtonS);
		jButtonS.addActionListener(this);

		//--------------------------------------------------------
		
		jButton7.setBounds(22, 213, 60, 60);
		jButton7.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButton7);
		jButton7.addActionListener(this);
		
		jButton8.setBounds(87, 213, 60, 60);
		jButton8.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButton8);
		jButton8.addActionListener(this);
		
		jButton9.setBounds(152, 213, 60, 60);
		jButton9.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButton9);
		jButton9.addActionListener(this);
		
		jButtonR.setBounds(217, 213, 92, 60);
		jButtonR.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButtonR);
		jButtonR.addActionListener(this);

		//--------------------------------------------------------
		
		jButtonM.setBounds(22, 278, 60, 60);
		jButtonM.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButtonM);
		jButtonM.addActionListener(this);
		
		jButton0.setBounds(87, 278, 60, 60);
		jButton0.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButton0);
		jButton0.addActionListener(this);
		
		jButtonD.setBounds(152, 278, 60, 60);
		jButtonD.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButtonD);
		jButtonD.addActionListener(this);
		
		jButtonP.setBounds(217, 278, 92, 60);
		jButtonP.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButtonP);
		jButtonP.addActionListener(this);
		
		//--------------------------------------------------------
		
		jButtonI.setBounds(22, 343, 288, 60);
		jButtonI.setFont(new Font("tahoma", Font.BOLD, 20));
		add(jButtonI);
		jButtonI.addActionListener(this);
	}
	
	public static void main(String[] args) {
		try {
			new Calculadora();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se presento un error:"+e.getMessage());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource() == jButton1) {
				if(jTextField.getText() == "") {
					jTextField.setText("1");
				}else {
					jTextField.setText(jTextField.getText()+1);
				}
			}else if(e.getSource() == jButton2) {
				if(jTextField.getText() == "") {
					jTextField.setText("2");
				}else {
					jTextField.setText(jTextField.getText()+2);
				}
			}else if(e.getSource() == jButton3) {
				if(jTextField.getText() == "") {
					jTextField.setText("3");
				}else {
					jTextField.setText(jTextField.getText()+3);
				}
			}else if(e.getSource() == jButton4) {
				if(jTextField.getText() == "") {
					jTextField.setText("4");
				}else {
					jTextField.setText(jTextField.getText()+4);
				}
			}else if(e.getSource() == jButton5) {
				if(jTextField.getText() == "") {
					jTextField.setText("5");
				}else {
					jTextField.setText(jTextField.getText()+5);
				}
			}else if(e.getSource() == jButton6) {
				if(jTextField.getText() == "") {
					jTextField.setText("6");
				}else {
					jTextField.setText(jTextField.getText()+6);
				}
			}else if(e.getSource() == jButton7) {
				if(jTextField.getText() == "") {
					jTextField.setText("7");
				}else {
					jTextField.setText(jTextField.getText()+7);
				}
			}else if(e.getSource() == jButton8) {
				if(jTextField.getText() == "") {
					jTextField.setText("8");
				}else {
					jTextField.setText(jTextField.getText()+8);
				}
			}else if(e.getSource() == jButton9) {
				if(jTextField.getText() == "") {
					jTextField.setText("9");
				}else {
					jTextField.setText(jTextField.getText()+9);
				}
			}else if(e.getSource() == jButton0) {
				if(jTextField.getText() == "") {
					jTextField.setText("0");
				}else {
					jTextField.setText(jTextField.getText()+0);
				}
			}else if(e.getSource() == jButtonS) {
				if(jTextField.getText() == "") {
					jTextField.setText("+");
				}else {
					jTextField.setText(jTextField.getText()+"+");
				}
			}else if(e.getSource() == jButtonR) {
				if(jTextField.getText() == "") {
					jTextField.setText("-");
				}else {
					jTextField.setText(jTextField.getText()+"-");
				}
			}else if(e.getSource() == jButtonM) {
				if(jTextField.getText() == "") {
					jTextField.setText("*");
				}else {
					jTextField.setText(jTextField.getText()+"*");
				}
			}else if(e.getSource() == jButtonD) {
				if(jTextField.getText() == "") {
					jTextField.setText("/");
				}else {
					jTextField.setText(jTextField.getText()+"/");
				}
			}else if(e.getSource() == jButtonP) {
				if(jTextField.getText() == "") {
					jTextField.setText(".");
				}else {
					jTextField.setText(jTextField.getText()+".");
				}
			}else if(e.getSource() == jButtonDel) {
				jTextField.setText("");
			}else if(e.getSource() == jButtonI) {
				
				String cadena = jTextField.getText();
				int largo = cadena.length();
				
				for (int i = 0; i < largo; i++) {
					char caracter = cadena.charAt(i);
					if(caracter == '+') {
						String primeraParte = cadena.substring(0,i);
						String segundaParte = cadena.substring(i+1,cadena.length());
						suma(primeraParte, segundaParte);
					}else if(caracter == '-') {
						String primeraParte = cadena.substring(0,i);
						String segundaParte = cadena.substring(i+1,cadena.length());
						resta(primeraParte, segundaParte);
					}else if(caracter == '*') {
						String primeraParte = cadena.substring(0,i);
						String segundaParte = cadena.substring(i+1,cadena.length());
						multiplicacion(primeraParte, segundaParte);
					}else if(caracter == '/') {
						String primeraParte = cadena.substring(0,i);
						String segundaParte = cadena.substring(i+1,cadena.length());
						division(primeraParte, segundaParte);
					}
				}
			}
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Se presento un error:"+e2.getMessage());
		}
	}
	
	public void suma (String numero1, String numero2) {
		try {
			double resultado = Double.parseDouble(numero1)+Double.parseDouble(numero2);
			jTextField.setText(Double.toString(resultado));
		} catch (Exception e3) {
			JOptionPane.showMessageDialog(null, "Se presento un error:"+e3.getMessage());
		}
	}
	
	public void resta (String numero1, String numero2) {
		try {
			double resultado = Double.parseDouble(numero1)-Double.parseDouble(numero2);
			jTextField.setText(Double.toString(resultado));
		} catch (Exception e4) {
			JOptionPane.showMessageDialog(null, "Se presento un error:"+e4.getMessage());
		}
	}
	
	public void multiplicacion (String numero1, String numero2) {
		try {
			double resultado = Double.parseDouble(numero1)*Double.parseDouble(numero2);
			jTextField.setText(Double.toString(resultado));
		} catch (Exception e5) {
			JOptionPane.showMessageDialog(null, "Se presento un error:"+e5.getMessage());
		}
	}
	
	public void division (String numero1, String numero2) {
		try {
			double cero = Double.parseDouble(numero2);
			
			if(cero == 0) {
				jTextField.setText("No se puede dividir por cero");
			}
			
			double resultado = Double.parseDouble(numero1)/Double.parseDouble(numero2);
			jTextField.setText(Double.toString(resultado));
		} catch (Exception e6) {
			JOptionPane.showMessageDialog(null, "Se presento un error:"+e6.getMessage());
		}
	}

}
