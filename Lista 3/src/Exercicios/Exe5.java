/* Escreva um aplicativo que utiliza um objeto do tipo Array de 1000 elementos para exibir os números primos entre 2 a 999. */

package Exercicios;

public class Exe5 {

	public static void main(String[] args) {
		
		int primos [];
		primos = new int [999];
		
		int x = 2;
		
		for(x = 2; x < primos.length;x++){
			primos[x] = x;
			if(primos[x] % 2 != 0)
				System.out.println(primos[x]);
		}
	}
}
