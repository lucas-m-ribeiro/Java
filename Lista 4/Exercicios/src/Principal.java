package br.com.fatec.PDF4;

import java.util.Scanner;

public class Principal {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		Agenda a = new Agenda();

		int finalizar = 0;
		int escolhas = 0;

		while (finalizar == 0) {
			switch (escolhas) {

			case 0: {
				a.opcoes();
				escolhas = scanner.nextInt();
				break;
			}

			case 1: {
				a.cadastraAluno();
				escolhas = 0;
				break;
			}

			case 2: {
				a.cadastraProfessor();
				escolhas = 0;
				break;
			}
			case 3: {
				a.removerAluno();
				escolhas = 0;
				break;
			}
			case 4: {
				a.removerProfessor();
				escolhas = 0;
				break;
			}
			case 5: {
				a.editaAluno();
				escolhas = 0;
				break;
			}
			case 6: {
				a.editaProfessor();
				escolhas = 0;
				break;
			}
			case 7: {
				a.listarTodos();
				escolhas = 0;
				break;
			}
			}
		}

	}
}
