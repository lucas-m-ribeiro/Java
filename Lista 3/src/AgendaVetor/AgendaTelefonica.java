package AgendaVetor;

import java.util.Scanner;
import java.util.Vector;

public class AgendaTelefonica {
	private Vector<Pessoa> pessoas;
	private Scanner scanner;

	public AgendaTelefonica() {
		pessoas = new Vector<Pessoa>();
		scanner = new Scanner(System.in);
	}

	public void cadastrarPessoa() {
		System.out.println("n insira o nome da pessoa: ");
		String nome = scanner.next();

		System.out.println("\n insira o telefone da pessoa: ");
		String telefone = scanner.next();

		System.out.println("\n insira um email para pessoa: ");
		String email = scanner.next();

		Pessoa nova = new Pessoa(nome, telefone, email);
		pessoas.add(nova);
		System.out.println("\n novo contato adicionado");
	}

	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma opção: \n");
		System.out.println("1 - listar contatos.\n");
		System.out.println("2 - incluir contatos. \n");
		System.out.println("3 - sair\n");

	}

	public void imprimirPessoas() {
		for (Pessoa pessoa : pessoas) {
			if (pessoa != null) {
				System.out.println("\nNome: " + pessoa.getNome() + "\nTelefone: " + pessoa.getTelefone() + "\nEmail: "
						+ pessoa.getEmail());
			}
		}
	}

	public Vector<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(Vector<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
