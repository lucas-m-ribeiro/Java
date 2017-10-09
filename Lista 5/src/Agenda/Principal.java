import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
	
				Scanner scanner = new Scanner(System.in);
				Agenda a = new Agenda();
				
				int finalizar = 0;
				int escolhas = 0;
				
				while (finalizar == 0){
					a.Opcoes();
					escolhas = scanner.nextInt();
					switch (escolhas){
					case 1:{
						a.cadastrarAluno();
						break;
					}
					case 2:{
						a.deletarAluno();
						break;
					}
					case 3:{
						a.cadastrarProfessor();
						break;
					}
					case 4:{
						a.deletaFessor();
						break;
					}
					case 5:{
						a.editaAluno();
						break;
					}
					case 6:{
						a.editaFessor();
						break;
					}
					case 7:{
						a.listartodos();
						break;
					}
					}
				}
			}
		}