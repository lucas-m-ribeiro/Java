package Ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Agenda {
	Collection<Pessoa> ag;
	Scanner scanner;
	boolean isAdd = false;
	public boolean f;

	public Agenda() {
		ag = new TreeSet<Pessoa>();
		scanner = new Scanner(System.in);
	}

	public void CadastrarContato() {
		System.out.println("Nome: ");
		String nome = scanner.next();

		System.out.println("Email: ");
		String email = scanner.next();

		System.out.println("Telefone: ");
		String telefone = scanner.next();

		try {
			ag.add(new Pessoa(nome, email, telefone));
			save(ag);
		} catch (Exception e) {
		}
	}

	public void save(Collection<Pessoa> agenda2) throws Exception {
		FileOutputStream saida = new FileOutputStream("lista11.txt");
		ObjectOutputStream saidaO = new ObjectOutputStream(saida);
		saidaO.writeObject(agenda2);
		saidaO.close();
	}

	@SuppressWarnings({ "resource", "unchecked" })
	public void receber() throws Exception {
		FileInputStream entrada = new FileInputStream("lista11.txt");
		ObjectInputStream entradaO = new ObjectInputStream(entrada);
		Set<Pessoa> p = (Set<Pessoa>) entradaO.readObject();
		ag = p;
	}

	public void GetDB() {
		try {
			receber();
		} catch (Exception e) {

		}

	}

	public void excluirContato() throws InterruptedException {

		f = false;
		System.out.println("Entre com o nome para excluir: ");
		String nome = scanner.nextLine();
		Iterator<Pessoa> it = ag.iterator();
		while (it.hasNext()) {
			if (it.next().nome.equalsIgnoreCase(nome)) {
				System.out.println("Deseja excluir " + nome + " da agenda?? (S/N)");
				String r = scanner.next();
				scanner.nextLine();
				if (r.equalsIgnoreCase("S")) {
					System.out.println("\nExcluido com sucesso!\n");
					it.remove();
					try {
						save(ag);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				f = true;
			}
		}
		if (!f)
			System.out.println("\nContato nao encontrado!\n");

	}

	public void imprimirContato() {
		for (Pessoa pessoa : ag) {
			pessoa.toString();
		}
	}

}
