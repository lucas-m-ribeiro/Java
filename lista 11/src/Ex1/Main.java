package Ex1;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		agenda.GetDB();
		boolean ciclo = true;
		while (ciclo) {
			System.out.println("1 - Entre para cadastrar um novo contato\n2 - Entre para listar contatos salvos\n3 -Entre para excluir um contato \n4 - Sair do programa\n");
			String operacao = scan.next();
			scan.nextLine();
			switch (operacao) {
			case "1":
				agenda.CadastrarContato();
				break;
				
			case "2":
				agenda.imprimirContato();
				break;
				
			case "3":
				agenda.excluirContato();
				
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
