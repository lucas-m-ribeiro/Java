package br.com.fatec.PDF4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

	Scanner scanner = new Scanner(System.in);
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private List<Professor> professores = new ArrayList<Professor>();

	public void listarTodos() {
		System.out.println("\nLista de contatos de alunos!\n");
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Telefone: " + aluno.getTelefone());
			System.out.println("Email: " + aluno.getEmail());
			System.out.println("Numero de matricula: " + aluno.getNumeroMatricula() + "\n");
		}

		System.out.println("\nLista de contatos de Professores\n");
		for (Professor professor : professores) {
			System.out.println("Nome: " + professor.getNome());
			System.out.println("Telefone: " + professor.getTelefone());
			System.out.println("Email: " + professor.getEmail());
			System.out.println("Registro: " + professor.getNumeroRegistro());
			System.out.println("Quantidade hora aula: " + professor.getQuantidadeHoraAula() + "\n");

		}
	}

	public void cadastraAluno() {
		Aluno x = new Aluno();
		x.adicionaAluno(x);
		alunos.add(x);
	}

	public void removerAluno() {
		String nome;
		System.out.println("Entre com o nome do aluno que deseja excluir: ");
		nome = scanner.next();
		Aluno alunoDeletar = null;
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equals(nome)) {
				alunoDeletar = aluno;
			}
		}
		if(alunoDeletar != null){
			System.out.println(alunoDeletar.getNome() + " \nRemovido com sucesso!\n");
			alunos.remove(alunoDeletar);
		}
	}

	public void cadastraProfessor() {
		Professor p = new Professor();
		p.adicionaProfessor(p);
		professores.add(p);
	}

	public void removerProfessor() {
		String nome;
		System.out.println("Entre com o nome do professor que deseja remover: ");
		nome = scanner.next();
		Professor deletarProfessor = null;
		for (Professor professor : professores) {
			if (professor.getNome().equals(nome)) {
				deletarProfessor = professor;
			}
		}
		if(deletarProfessor != null){
			System.out.println(deletarProfessor.getNome() + "\nRemovido com sucesso\n");
			professores.remove(deletarProfessor);
		}
	}

	public void editaAluno() {
		System.out.println("Entre com o nome do aluno a ser alterado: ");
		String nome = scanner.next();
		for (Aluno a : alunos) {
			if (a.getNome().equals(nome)) {
				a.ediçãoAluno();
			}
		}
	}

	public void editaProfessor() {
		System.out.println("Entre com o nome do professor que deseja alterar: ");
		String nome = scanner.next();
		for (Professor p : professores) {
			if (p.getNome().equals(nome)) {
				p.EditarProfessor();
			}
		}
	}

	public void opcoes() {
		System.out.println("Entre com 1 para cadastrar aluno!");
		System.out.println("Entre com 2 para cadastrar professor!");
		System.out.println("Entre com 3 para excluir aluno!");
		System.out.println("Entre com 4 para excluir professor!");
		System.out.println("Entre com 5 para editar aluno!");
		System.out.println("Entre com 6 para editar professor!");
		System.out.println("entre com 7 para listar todos os contatos salvos!");
	}

	public List<Aluno> getAlunos() {
		return getAlunos();
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessor(List<Professor> professores) {
		this.professores = professores;
	}
}
