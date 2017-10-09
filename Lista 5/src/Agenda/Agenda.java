import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	private List<Aluno> alunos;
	private List<Professor> professores;
	private Scanner scanner = new Scanner(System.in);

	public Agenda() {
		alunos = new ArrayList<Aluno>();
		professores = new ArrayList<Professor>();
	}

	public void listartodos() {
		System.out.println("\nLista de contato de alunos\n");
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Telefone: " + aluno.getTelefone());
			System.out.println("Email: " + aluno.getEmail());
			System.out.println("Numero matricula: " + aluno.getNumeroMatricula());
		}

		System.out.println("\nLista de contatados dos professores\n");
		for (Professor professor : professores) {
			System.out.println("Nome: " + professor.getNome());
			System.out.println("telefone: " + professor.getTelefone());
			System.out.println("Email: " + professor.getEmail());
			System.out.println("Registro: " + professor.getNumeroRegistro());
			System.out.println("Quantidade Hora Aula: " + professor.getQuantidadeHoraAula() + "\n");
		}
	}

	public void cadastrarAluno() throws IOException {
		Aluno a = new Aluno();
		System.out.println("Entre com o nome do aluno: ");
		a.setNome(scanner.nextLine());

		System.out.println("Entre com o email: ");
		a.setEmail(scanner.next());

		System.out.println("Digite o telefone: ");
		a.setTelefone(scanner.next());

		System.out.println("Entre com o numero de matricula: ");
		a.setNumeroMatricula(scanner.next());
		alunos.add(a);
	}

	public void editaAluno() {
		System.out.println("Entre com o nome do aluno: ");
		String novoConteudo = " ";
		String nome = scanner.next();
		Aluno al = null;
		for (Aluno ler : alunos) {
			if (ler.getNome().equalsIgnoreCase(nome)) {
				al = ler;
			}
		}

		if (al != null) {
			System.out.println("Deseja alterar o nome (s/n): ");
			String escolha = scanner.next();
			if (escolha.equalsIgnoreCase("s")) {

				System.out.println("Entre com o novo nome: ");
				novoConteudo = scanner.next();
				al.setNome(novoConteudo);
			}

			System.out.println("Deseja alterar o telefone (s/n): ");
			escolha = scanner.next();
			if (escolha.equalsIgnoreCase("s")) {

				System.out.println("Entre com o novo telefone: ");
				novoConteudo = scanner.next();
				al.setTelefone(novoConteudo);

			}

			System.out.println("Deseja alterar o email (s/n): ");
			escolha = scanner.next();
			if (escolha.equalsIgnoreCase("s")) {

				System.out.println("Entre com o novo email: ");
				novoConteudo = scanner.next();
				al.setEmail(novoConteudo);
			}

			System.out.println("Deseja alterar o N° de matricula (s/n): ");
			escolha = scanner.next();
			if (escolha.equalsIgnoreCase("s")) {

				System.out.println("Entre com o novo N° de matricula: ");
				novoConteudo = scanner.next();
				al.setNumeroMatricula(novoConteudo);
			}
		}
	}
	
	public void cadastrarProfessor() throws IOException {
		Professor a = new Professor();
		System.out.println("Entre com o nome do professor: ");
		a.setNome(scanner.nextLine());

		System.out.println("Digite o Telefone: ");
		a.setTelefone(scanner.next());

		System.out.println("Entre com o email: ");
		a.setEmail(scanner.next());
	
		System.out.println("Entre com N° de registro: ");
		a.setNumeroRegistro(scanner.next());
		
		System.out.println("Entre com a quantidade de hora/aula: ");
		a.setQuantidadeHoraAula(scanner.next());
		
		professores.add(a);
	}
	
	public void editaFessor() {
		System.out.println("Entre com o nome do professor: ");
		String novoConteudo = " ";
		String nome = scanner.next();
		Professor prof = null;
		for (Professor ler : professores) {
			if (ler.getNome().equalsIgnoreCase(nome)) {
				prof = ler;
			}
		}

		if (prof != null) {
			System.out.println("Deseja alterar o nome (s/n): ");
			String escolha = scanner.next();
			if (escolha.equalsIgnoreCase("s")) {

				System.out.println("Entre com o novo nome: ");
				novoConteudo = scanner.next();
				prof.setNome(novoConteudo);
			}

			System.out.println("Deseja alterar o telefone (s/n): ");
			escolha = scanner.next();
			if (escolha.equalsIgnoreCase("s")) {

				System.out.println("Entre com o novo telefone: ");
				novoConteudo = scanner.next();
				prof.setTelefone(novoConteudo);

			}

			System.out.println("Deseja alterar o email (s/n): ");
			escolha = scanner.next();
			if (escolha.equalsIgnoreCase("s")) {

				System.out.println("Entre com o novo email: ");
				novoConteudo = scanner.next();
				prof.setEmail(novoConteudo);
			}

			System.out.println("Deseja alterar o N° de registro (s/n): ");
			escolha = scanner.next();
			if (escolha.equalsIgnoreCase("s")) {

				System.out.println("Entre com o novo N° de registro: ");
				novoConteudo = scanner.next();
				prof.setNumeroRegistro(novoConteudo);
			}

			System.out.println("Deseja alterar a quantidade hora/aula: ");
			escolha = scanner.next();
			if (escolha.equalsIgnoreCase("s")) {

				System.out.println("Entre com a nova quantidade hora/aula: ");
				novoConteudo = scanner.next();
				prof.setQuantidadeHoraAula(novoConteudo);
			}
		}
	}

	public void deletarAluno() {
		String nome;
		System.out.println("Entre com o nome que deseja excluir: ");
		nome = scanner.next();
		Aluno deletaAluno = null;
		for (Aluno estudante : alunos) {
			if (estudante.getNome().equals(nome)) {
				deletaAluno = estudante;
			}
		}
		if (deletaAluno != null) {
			System.out.println(deletaAluno.getNome() + "\nRemovido com sucesso!\n");
			alunos.remove(deletaAluno);
		}
	}

	public void cadastroProfessor() throws IOException {
		Professor fessor = new Professor();
		professores.add(fessor.cadastraProfessor());
	}

	public void deletaFessor() {
		String nome;
		System.out.println("Entre com o nome que deseja deletar: ");
		nome = scanner.next();
		Professor deletaProfessor = null;
		for (Professor fessor : professores) {
			if (fessor.getNome().equals(nome)) {
				deletaProfessor = fessor;
			}
		}
		if (deletaProfessor != null) {
			System.out.println(deletaProfessor.getNome() + "\nRemovido com sucesso!\n");
			professores.remove(deletaProfessor);
		}
	}

	public void Opcoes() {
		System.out.println("Entre com 1 para cadastrar alunos!");
		System.out.println("Entre com 2 para deletar alunos");
		System.out.println("Entre com 3 para cadastrar professores!");
		System.out.println("Entre com 4 para deletar professores!");
		System.out.println("Entre com 5 para alterar alunos!");
		System.out.println("Entre com 6 para alterar professores!");
		System.out.println("Entre com 7 para listar todos!");
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Professor> professores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
}
