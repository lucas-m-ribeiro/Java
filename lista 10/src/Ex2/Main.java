package Ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Letras l;
		System.out.println("Palavra");
		Scanner scanner = new Scanner(System.in);
		String pal = scanner.next();
		l = new Letras(pal);
		l.Buracos();
	}

}
