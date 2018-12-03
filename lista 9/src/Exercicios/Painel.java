package Exercicios;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Painel extends JPanel{

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		int x = getX();
		int y = getY();
		for (int i = 0; i < 15; i++) {
			g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
		}
	}
}