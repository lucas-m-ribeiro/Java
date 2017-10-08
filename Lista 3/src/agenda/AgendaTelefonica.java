package agenda;

import java.util.Scanner;

public class AgendaTelefonica {
	private Pessoa [] pessoas;
	private Scanner scanner;

	public AgendaTelefonica(){
		pessoas = new Pessoa [5];
		scanner = new Scanner (System.in);
	}

	public void cadastrarPessoa(){
		for(int i = 0; i < pessoas.length; i++){
			if(pessoas[i] == null){
				System.out.println("\n insira o nome da pessoas: ");
				String nome = scanner.next();

				System.out.println("\nInsira o telefone da pessoa: ");
				String telefone = scanner.next();

				System.out.println("\n insira o email para a pessoa: ");
				String email = scanner.next();

				Pessoa nova = new Pessoa(nome, telefone, email);
				pessoas[i] = nova;

				System.out.println("\nNovo contato adicionado com sucesso\n");
				break;
			}
		}
	}

	public void imprimeOpcoes(){
		System.out.println("\n Escolha uma das opções: \n");
		System.out.println("1 - Listar contatos.\n");
		System.out.println("2 - incluir contatos.\n");
		System.out.println("3 - sair.");
	}

	public void imprimePessoas(){
		for(Pessoa pessoa: pessoas){
			if(pessoa != null){
				System.out.println("\n Nome: "+pessoa.getNome() + "\n Telefone: " +pessoa.getTelefone()+ "\nEmail: " +pessoa.getEmail());
			}
		}
	}

	public Pessoa [] getPessoa(){
		return pessoas;
	}

	public void setPessoas(Pessoa [] pessoas){
		this.pessoas = pessoas;
	}
}
