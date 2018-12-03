package Ex1;

import java.io.Serializable;

public class Pessoa implements Comparable<Pessoa>, Serializable{
	String nome, email, telefone;
	int count;

	public Pessoa(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	
	@Override
	public String toString() {
		System.out.println("Nome: " + nome + "    \t| " + "Email: " + email + "     \t| " + "Telefone: " + telefone);
		return null;

	}
	
	@Override
	public int compareTo(Pessoa p) {
		
		return nome.compareToIgnoreCase(p.nome);
	}

}
