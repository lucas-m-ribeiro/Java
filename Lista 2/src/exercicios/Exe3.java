/*Escreva um aplicativo que solicita ao usuário inserir cinco números inteiros e imprima o maior, o menor número do grupo */

package exercicios;
import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int valor[] = new int [5];
		int maior = 0, menor = 5;
		
		System.out.println("Digite 5 valores: ");
		for(int i = 0; i < valor.length; i++){
			valor[i] = input.nextInt();
			if (valor[i] > maior){
				maior = valor[i];
			}
		}
		
		for(int j = 0; j < valor.length; j++){
			if(valor[j] < menor){
				menor = valor[j];
			}
		}
		System.out.println("maior valor e: " + maior);
		System.out.println("menor valor e: " + menor);
	}
}
