package Ex2;

public class Letras {
	String str;
	String[] UmBuraco = { "A", "Q", "R", "O", "P", "D", "4", "6", "9", "0" },
			doisBurracos = { "B", "8" };

	public Letras(String palavra) {
		this.str = palavra;
	}

	public void Buracos() {
		int count = 0;
		String[] letra = str.split("");
		for (int i = 0; i < letra.length; i++) {
			letra[i] = letra[i].toUpperCase();
			for (int j = 0; j < UmBuraco.length; j++) {
				try {
					if (letra[i].equals(UmBuraco[j]))
						count += 1;
					else if (letra[i].equals(doisBurracos[j]))
						count += 2;
				} catch (Exception e) {
					if (letra[i].equals(UmBuraco[j]))
						count += 1;
				}
			}
		}
		System.out.println("A palavra possui "+ count + " burracos!");
	}
}