package br.com.fatec.PDF4;

public abstract class Pessoa implements Contato {
	private String nome;
	private String telefone;
	private String email;

	@Override
	public String dadosFormatados() {
		String dadosFormatados;
		dadosFormatados = "\nNome: " + this.getNome();
		dadosFormatados = dadosFormatados + "\n Telefone: " + this.getTelefone();
		dadosFormatados = dadosFormatados + "\n Email: " + this.getEmail();
		return dadosFormatados;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}