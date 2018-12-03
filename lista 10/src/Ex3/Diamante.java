package Ex3;

public class Diamante {
	char letra;
	char[] alfabeto = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
			'U', 'V', 'W', 'X', 'Y', 'Z' };

	public Diamante(char letra) {
		this.letra = letra;
	}

	public void imagem() {
		int i = letra - 65;
		if (i > 0) {
			for (int j = 0; j <= i; j++) {
				for (int k = j; k < i; k++) {
					System.out.printf(" ");
				}
				System.out.print(alfabeto[j]);
				for (int k = 1; k <= j * 2; k++) {
					System.out.printf(" ");
				}
				if (j != 0)
					System.out.print(alfabeto[j]);
				System.out.println();
			}
			for (int j = i - 1; j >= 0; j--) {
				for (int k = j; k < i; k++) {
					System.out.printf(" ");
				}
				System.out.print(alfabeto[j]);
				for (int k = 1; k <= j * 2; k++) {
					System.out.printf(" ");
				}
				if (j != 0)
					System.out.print(alfabeto[j]);
				System.out.println();
			}
		}
		else
			System.out.println(letra);
	}
}