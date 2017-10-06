/*Escreva um aplicativo que lê dois inteiros, determina se o primeiro é um múltiplo do segundo*/

package exercicios;
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		Scanner multiplos = new Scanner (System.in);
		
		int numero1, numero2;
		
		System.out.println("Entre com dois valores: ");
		numero1 = multiplos.nextInt();
		numero2 = multiplos.nextInt();
		
		if(numero1 % numero2 == 0){
			System.out.println(+numero1 +" é multiplo de " +numero2);
		}
		else
			System.out.println(+numero1 +" NAO é multiplo de " +numero2);
	}
}