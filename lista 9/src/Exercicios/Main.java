package Exercicios;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		Painel mp = new Painel();
		JFrame janela = new JFrame("Titulo");
		janela.getContentPane().add(mp);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 400);
		janela.setVisible(true);
	}
}
