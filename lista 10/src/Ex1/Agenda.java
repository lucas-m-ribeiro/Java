package Ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	private ArrayList<Pessoa> pessoa;
	private Scanner scanner;
	private String nome, email, telefone;

	public Agenda() {
		pessoa = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public void save(ArrayList<Pessoa> pessoas) throws Exception {
		FileOutputStream saida = new FileOutputStream("lista5.txt");
		ObjectOutputStream saidaO = new ObjectOutputStream(saida);
		saidaO.writeObject(pessoas);
		saidaO.close();
	}

	@SuppressWarnings({ "resource", "unchecked" })
	public void recebe() throws Exception {
		FileInputStream entrada = new FileInputStream("lista5.txt");
		ObjectInputStream entradaO = new ObjectInputStream(entrada);
		ArrayList<Pessoa> p = (ArrayList<Pessoa>) entradaO.readObject();
		pessoa = p;
	}

	public void GetDB() {

		try {
			recebe();
		} catch (Exception e) {
		}

	}

public void inserirCadastro() {
		System.out.println("Entre com o nome: ");
		nome = scanner.nextLine();
		
		System.out.println("Entre com o email: ");
		email = scanner.nextLine();
		
		System.out.println("Entre com o telefone: ");
		telefone = scanner.nextLine();
		
		pessoa.add(new Pessoa(nome, email, telefone));

		System.out.println("\nCadastrado com sucesso!!!\n");
	}

public	void imprimirContatos() {
		int numeroCadastro = 0;
		for (Pessoa pessoa : pessoa) {
			System.out.println("NumeroCadastro: " + numeroCadastro + " | Nome: " + pessoa.getNome() + "  \t| Email: " + pessoa.getEmail()
					+ "    \t| Telefone: " + pessoa.getTel());
			numeroCadastro++;
			if(numeroCadastro == 0){
				System.out.println("\nNao a contatos salvos na agenda!\n");
			}
		}
}

public void remove() {
		imprimirContatos();
		System.out.println("Entre com o numero de cadastro do contato: ");
		int i = scanner.nextInt();
		scanner.nextLine();
		pessoa.remove(i);
		System.out.println("\nRemovido com sucesso!!!\n");
	}
}