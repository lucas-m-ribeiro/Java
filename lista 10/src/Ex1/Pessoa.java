package Ex1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Pessoa implements Serializable {
	String nome;
	private String email;
	private String telefone;
	
	public Pessoa(String nome, String email, String tel) {
		this.nome = nome;
		this.email = email;
		this.telefone = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return telefone;
	}

	public void setTel(String tel) {
		this.telefone = tel;
	}
}