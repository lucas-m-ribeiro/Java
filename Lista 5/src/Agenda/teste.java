import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class teste {
	private static final String diretorio = "C:\\Users\\Aluno\\Desktop\\teste.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno aluno = new Aluno();
		aluno.setNome("Gustavo");
		alunos.add(aluno);
		aluno = null;
		aluno = new Aluno();
		aluno.setNome("Lucas");
		alunos.add(aluno);
		FileOutputStream escrever =  new FileOutputStream(diretorio);
		ObjectOutputStream escreverObj = new ObjectOutputStream(escrever);
		escreverObj.writeObject(alunos);
		System.out.println("Ok");
		
		FileInputStream leia = new FileInputStream(diretorio);
		ObjectInputStream ler = new ObjectInputStream(leia);
		
		List<Aluno> lista = (List<Aluno>) ler.readObject();
		
		for(Aluno aluno1: lista){
			System.out.println("nome" + aluno1.getNome());
		}
	}
}
