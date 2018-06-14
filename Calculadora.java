package relacion01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejer12 extends JFrame implements ActionListener{
	
	private JTextField pantalla;
	private JButton cero,uno,dos,tres,cuatro,cinco,seis,siete,
	ocho,nueve,sumar,restar,multiplicar,dividir,raiz,igual,borrar;
	private double num1=0;
	private double num2=0;
	private char opcion;
	
	public Ejer12(){
		this.setTitle("Calculadora");
		JPanel principal=new JPanel();
		principal.setLayout(new GridLayout(2,2));
		pantalla=new JTextField();
		pantalla.setEditable(false);
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(1, 1));
		p1.add(pantalla);
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(4, 5));
		sumar=new JButton("+");
		sumar.addActionListener(this);
		restar=new JButton("-");
		restar.addActionListener(this);
		multiplicar=new JButton("*");
		multiplicar.addActionListener(this);
		dividir=new JButton("/");
		dividir.addActionListener(this);
		raiz=new JButton("raiz");
		raiz.addActionListener(this);
		igual=new JButton("=");
		igual.addActionListener(this);
		cero=new JButton("0");
		cero.addActionListener(this);
		uno=new JButton("1");
		uno.addActionListener(this);
		dos=new JButton("2");
		dos.addActionListener(this);
		tres=new JButton("3");
		tres.addActionListener(this);
		cuatro=new JButton("4");
		cuatro.addActionListener(this);
		cinco=new JButton("5");
		cinco.addActionListener(this);
		seis=new JButton("6");
		seis.addActionListener(this);
		siete=new JButton("7");
		siete.addActionListener(this);
		ocho=new JButton("8");
		ocho.addActionListener(this);
		nueve=new JButton("9");
		nueve.addActionListener(this);
		borrar=new JButton("C");
		borrar.addActionListener(this);

		p2.add(siete);
		p2.add(ocho);
		p2.add(nueve);
		p2.add(dividir);
		p2.add(raiz);
		p2.add(cuatro);
		p2.add(cinco);
		p2.add(seis);
		p2.add(multiplicar);
		p2.add(igual);
		p2.add(uno);
		p2.add(dos);
		p2.add(tres);
		p2.add(restar);
		p2.add(borrar);
		p2.add(cero);
		p2.add(sumar);
		
		this.add(principal);
		principal.add(p1);
		principal.add(p2);
		
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 
		if(e.getSource()==sumar){
			num1=Double.parseDouble(pantalla.getText());
			pantalla.setText("");
			opcion='+';
		}
		if(e.getSource()==restar){
			num1=Double.parseDouble(pantalla.getText());
			pantalla.setText("");
			opcion='-';
			
		}
		if(e.getSource()==multiplicar){
			num1=Double.parseDouble(pantalla.getText());
			pantalla.setText("");
			opcion='*';
			
		}
		if(e.getSource()==dividir){
			num1=Double.parseDouble(pantalla.getText());
			pantalla.setText("");
			opcion='/';
			
		}
		if(e.getSource()==raiz){
			num1=Double.parseDouble(pantalla.getText());
			pantalla.setText("");
			opcion='r';
			
		}
		if(e.getSource()==borrar){
			pantalla.setText(" ");
		
		}
		
		if(e.getSource()==igual){
			switch (opcion) {
			case '+':
				num2=Double.parseDouble(pantalla.getText());
				pantalla.setText(""+(num1+num2));
				break;
			case '-':
				num2=Double.parseDouble(pantalla.getText());
				pantalla.setText(""+(num1-num2));
				
				break;
			case '*':
				num2=Double.parseDouble(pantalla.getText());
				pantalla.setText(""+(num1*num2));
				
				break;
			case '/':
				num2=Double.parseDouble(pantalla.getText());
				pantalla.setText(""+(num1/num2));
				
				break;
			case 'r':
				pantalla.setText(""+(Math.sqrt(num1)));
				
				break;
			}
		}
		if(e.getSource()==uno){
			pantalla.setText(pantalla.getText()+1);

		}
		if(e.getSource()==dos){
			pantalla.setText(pantalla.getText()+2);
			
		}
		if(e.getSource()==tres){
			pantalla.setText(pantalla.getText()+3);
			
		}
		if(e.getSource()==cuatro){
			pantalla.setText(pantalla.getText()+4);
			
		}
		if(e.getSource()==cinco){
			pantalla.setText(pantalla.getText()+5);
			
		}
		if(e.getSource()==seis){
			pantalla.setText(pantalla.getText()+6);
			
		}
		if(e.getSource()==siete){
			pantalla.setText(pantalla.getText()+7);
			
		}
		if(e.getSource()==ocho){
			pantalla.setText(pantalla.getText()+8);
			
		}
		if(e.getSource()==nueve){
			pantalla.setText(pantalla.getText()+9);
			
		}
		if(e.getSource()==cero){
			pantalla.setText(pantalla.getText()+0);
			
		}  	
	}

	public static void main(String[] args) {
		new Ejer12();
	}
}

