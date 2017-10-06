/*Escreva um aplicativo que solicita ao usuário inserir dois números inteiros e imprima a soma, a média e imprima os números em ordem crescente.*/

package exercicios;
import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int media;
		int soma;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = num.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = num.nextInt();
		
		soma = numero1 + numero2;
		media = soma/ 2;
		
		System.out.println("Soma e igual a: " + soma);
		System.out.println("Media e igual a: " + media);
		
		if(numero1 > numero2)
			System.out.println("numeros em ordem crescente: " +numero2+" "+numero1);
		else
			System.out.println("numeros em ordem crescente: " +numero1+" "+numero2);
	}
}
