package agenda;

import java.util.Scanner;

public class Aplicação {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner (System.in);
		AgendaTelefonica agenda = new AgendaTelefonica();

		int sair = 0;
		int opcao = 0;

		while (sair == 0){
			switch (opcao){
			case 0: {
				agenda.imprimeOpcoes();
				opcao = scanner.nextInt();
				break;
			}
			
			case 1: {
				agenda.imprimePessoas();{
					opcao = 0;
					break;
				}
			}
			
			case 2: {
				agenda.cadastrarPessoa();{
					opcao = 0;
					break;
				}
			}
			
			case 3: {
				sair = 1;
				System.out.println("\n Ate mais.\n");
				break;
			}

			}
		
			default: {
			agenda.imprimeOpcoes();
			opcao = scanner.nextInt();
			break;
		}
		}
	}
}
