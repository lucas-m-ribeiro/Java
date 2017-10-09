package br.com.fatec.PDF4;

import java.util.Scanner;

public class Professor extends Pessoa {
	private String numeroRegistro;
	private String quantidadeHoraAula;
	private Scanner scanner = new Scanner(System.in);

	@Override
	public String dadosFormatados() {
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados + "\nRegistros: " + this.getNumeroRegistro();
		dadosFormatados = dadosFormatados + "\n hora/aula: " + this.getQuantidadeHoraAula();
		return dadosFormatados();
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getQuantidadeHoraAula() {
		return quantidadeHoraAula;
	}

	public void setQuantidadeHoraAula(String quantidadeHoraAula) {
		this.quantidadeHoraAula = quantidadeHoraAula;
	}

	public Professor adicionaProfessor(Professor x) {
		System.out.println("Entre com o nome do professor: ");
		x.setNome(scanner.nextLine());

		System.out.println("Entre com o email do professor: ");
		x.setEmail(scanner.next());

		System.out.println("Entre com o telefone: ");
		x.setTelefone(scanner.next());

		System.out.println("Entre com o numero de registro: ");
		x.setNumeroRegistro(scanner.next());

		System.out.println("Digite a quantidade de horas: ");
		x.setQuantidadeHoraAula(scanner.next());

		return x;
	}

	public void EditarProfessor() {
		System.out.println("Entre com 1 para alterar o nome");
		System.out.println("Entre com 2 para alterar o telefone");
		System.out.println("Entre com 3 para alterar o email");
		System.out.println("Entre com 4 para alterar o numero de registro");
		System.out.println("Entre com 5 para alterar a quantidade de hora/aula");
		int escolha = scanner.nextInt();

		switch (escolha) {
		case 1: {
			System.out.println("Entre com o novo nome: ");
			String nome = scanner.next();
			this.setNome(nome);
			break;
		}
		case 2: {
			System.out.println("Entre com o novo telefone: ");
			String tel = scanner.next();
			this.setTelefone(tel);
		}

		case 3: {
			System.out.println("Entre com o novo email: ");
			String Email = scanner.next();
			this.setEmail(Email);
		}
		case 4: {
			System.out.println("Entre com o novo numero de registo");
			String Numeroregistro = scanner.next();
			this.setNumeroRegistro(Numeroregistro);
		}
		case 5: {
			System.out.println("Entre com a nova quantidade de hora/aula: ");
			String QuantidadeHoraAula = scanner.next();
			this.setQuantidadeHoraAula(QuantidadeHoraAula);
		}

		}
	}
}
