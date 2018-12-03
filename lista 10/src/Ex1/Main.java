package Ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		agenda.GetDB();
		boolean ciclo = true;
		while (ciclo) {
			System.out.println("1 - Entre com um novo cadastro\n2 - liste todos os contatos salvos\n3 -Entre para excluir um contato\n4 - Sair do programa\n");
			String op = scan.next();
			switch (op) {
			case "1":
				agenda.inserirCadastro();
				break;
				
			case "2":
				agenda.imprimirContatos();
				break;
				
			case "3":
				agenda.remove();
				break;
				
			case "4":
				ciclo = false;
				break;
				
			default:
				break;
			}
		}
	}
}