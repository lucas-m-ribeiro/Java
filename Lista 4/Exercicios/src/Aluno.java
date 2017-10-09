package br.com.fatec.PDF4;

import java.util.Scanner;

public class Aluno extends Pessoa {
	private String numeroMatricula;
	Scanner scanner = new Scanner(System.in);

	@Override
	public String dadosFormatados() {
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados + "\n Matricula: " + this.getNumeroMatricula();
		return dadosFormatados;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Aluno adicionaAluno(Aluno a) {
		System.out.println("Entre com o nome do aluno: ");
		a.setNome(scanner.nextLine());

		System.out.println("Entre com o email do aluno: ");
		a.setEmail(scanner.next());

		System.out.println("Entre com o telefone do aluno: ");
		a.setTelefone(scanner.next());

		System.out.println("Entre com o numero da matricula do aluno: ");
		a.setNumeroMatricula(scanner.next());

		return a;
	}

	public void ediçãoAluno() {
		System.out.println("Entre com 1 para altera o nome do aluno: ");
		System.out.println("Entre com 2 para alterar o telefone do aluno: ");
		System.out.println("Entre com 3 para alterar o email do aluno: ");
		System.out.println("Entre com 4 para alterar o numero de matricula do aluno: ");
		int escolha = scanner.nextInt();
		switch (escolha) {

		case 1: {
			System.out.println("Entre com o nome do aluno: ");
			String nome = scanner.next();
			this.setNome(nome);
		}
		case 2: {
			System.out.println("Entre com o telefone: ");
			String tel = scanner.next();
			this.setTelefone(tel);

		}
		case 3: {
			System.out.println("Entre com o novo email: ");
			String Email = scanner.next();
			this.setEmail(Email);

		}
		case 4: {
			System.out.println("Entre com o novo numero de matricula: ");
			String NumeroMatricula = scanner.next();
			this.setNumeroMatricula(NumeroMatricula);
		}
		}
	}
}
