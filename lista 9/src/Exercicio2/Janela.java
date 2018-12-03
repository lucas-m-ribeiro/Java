package Exercicio2;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame implements ActionListener {
	private JButton AC, soma, subtracao, divisao, multiplicacao, 
					um, dois, tres, quatro, cinco, seis, 
					sete, oito, nove, zero, igual;
	
	private int count = 0;
	static String a = "", b = "";
	static String painel = " ";
	double resultado;
	private JLabel Contador;
	private JLabel tela;

	public void calcular(double x, double y, String operaçao) {
		switch (operaçao) {
		case "+":
			tela.setText("  "+(double)(x+y));
			break;
		case "-":
			tela.setText("  "+(double)(x-y));
			break;
		case "*":
			tela.setText("  "+(double)(x*y));
			break;
		case "/":
			tela.setText("  "+ (double)(x/y));
			break;

		default:
			break;
		}
	}

	@SuppressWarnings("deprecation")
	public Janela() throws HeadlessException {
		super("Calculadora");
		Container c = getContentPane();
		c.setLayout(new GridLayout(6,6));
		soma = new JButton("+");
		subtracao = new JButton("-");
		divisao = new JButton("/");
		multiplicacao = new JButton("x");
		um = new JButton("1");
		dois = new JButton("2");
		tres = new JButton("3");
		quatro = new JButton("4");
		cinco = new JButton("5");
		seis = new JButton("6");
		sete = new JButton("7");
		oito = new JButton("8");
		nove = new JButton("9");
		zero = new JButton("0");
		AC = new JButton("AC");
		igual = new JButton("=");
		tela = new JLabel("" + painel);
		tela.setSize(50,50);
				
		c.add(new JLabel(""));c.add(new JLabel(""));c.add(new JLabel(""));c.add(tela);
		
		c.add(sete);c.add(oito);c.add(nove);c.add(soma);
		c.add(quatro);c.add(cinco);c.add(seis);c.add(subtracao);
		c.add(um);c.add(dois);c.add(tres);c.add(divisao);
		c.add(zero);c.add(AC);c.add(igual);c.add(multiplicacao);
		
		AC.addActionListener(this);
		zero.addActionListener(this);
		um.addActionListener(this);
		dois.addActionListener(this);
		tres.addActionListener(this);
		quatro.addActionListener(this);
		cinco.addActionListener(this);
		seis.addActionListener(this);
		sete.addActionListener(this);
		oito.addActionListener(this);
		nove.addActionListener(this);
		soma.addActionListener(this);
		subtracao.addActionListener(this);
		divisao.addActionListener(this);
		multiplicacao.addActionListener(this);
		igual.addActionListener(this);
		
		setSize(300,450);
		setVisible(true);
		setDefaultCloseOperation(3);

	}

	int flag = 1;
	String op = "";
	static boolean add = false;
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == um) 
			if (flag == 1)
				a  += "1";
			else
				b += "1";
		else if (e.getSource() == dois)
			if (flag == 1)
				a  += "2";
			else
				b  += "2";
		else if (e.getSource() == tres)
			if (flag == 1)
				a += "3";
			else
				b  += "3";
		else if (e.getSource() == quatro)
			if (flag == 1)
				a  += "4";
			else
				b  += "4";
		else if (e.getSource() == cinco)
			if (flag == 1)
				a  += "5";
			else
				b += "5";
		else if (e.getSource() == seis)
			if (flag == 1)
				a  += "6";
			else
				b += "6";
		else if (e.getSource() == sete)
			if (flag == 1)
				a  += "7";
			else
				b += "7";
		else if (e.getSource() == oito)
			if (flag == 1)
				a  += "8";
			else
				b += "8";
		else if (e.getSource() == nove)
			if (flag == 1)
				a  += "9";
			else
				b += "9";
		else if (e.getSource() == zero)
			if (flag == 1)
				a  += "0";
			else
				b += "0";
		else if (e.getSource() == soma){
			flag = 2;
			op = "+";
		}
		
		
		else if (e.getSource() == subtracao){
			flag = 2;
			op = "-";
		}
		else if (e.getSource() == divisao){
			flag = 2;
			op = "/";
		}
		else if (e.getSource() == multiplicacao){
			flag = 2;
			op = "*";
			
		}
		else if (e.getSource() == igual){
			flag = 1;
			calcular(Double.parseDouble(a),Double.parseDouble(b),op);
			add = true;
			a = b = op = "";
			painel = "0";
		}
		
		else if (e.getSource() == AC) {
			flag = 1;
			a = b = op = "";
			painel = "0";
		}
		
		if (!add) {
		painel = (a + " " + op + " " + b);
		tela.setText(painel);
		}
		add = false;
	}
}
