import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Aluno extends Pessoa {
	private String numeroMatricula;
	private String Telefone;
	private String nome;
	private String Email;

	@Override
	public String dadosFormatados() {
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados + "\nMatricula: " + this.getNumeroMatricula();
		return dadosFormatados;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
}
