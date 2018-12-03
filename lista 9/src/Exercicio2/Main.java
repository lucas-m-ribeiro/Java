package Exercicio2;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Janela jn = new Janela();
		JFrame janela = new JFrame("Calculadora Java");
		janela.getContentPane().add(jn);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 400);
		janela.setVisible(true);
	}
}
