/* Uma empresa de grande porte quer transmitir dados via internet, mas está preocupada com a possibilidade de seus telefones estarem grampeados. 
Ela pediu para você escrever um programa que criptografe os dados de modo que estes possam 
ser transmitidos mais seguramente. Todos os dados são transmitidos como inteiros de quatro dígitos. 
Seu aplicativo deve ler um inteiro de quatro dígitos inserido pelo usuário e criptográfa-lo desta maneira: 
Substitua cada dígito pelo resultado da adição de 7 ao dígito e obtendo o resto depois da visão do novo valor por 10. 
Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então imprima o inteiro criptográfado. 
Escreva um outro aplicativo separado que receba como entrada um inteiro de quatro dígitos criptografado e o descriptografe para forma o número original. 
*/

package exercicios;
import java.util.Scanner;

public class Exe8 {

	public static void main(String[] args) {
		Scanner criptografa = new Scanner (System.in);
		
		int senha = 0;
		while (senha > 10000 || senha < 1000){
			System.out.println("Digite uma senha com 4 digitos: ");
			senha = criptografa.nextInt();
		}
		int numero1, numero2, numero3, numero4;
		
		numero4 = senha % 10;
		numero4 += 7;
		numero4 %= 10;
		senha /= 10;
		numero3 = senha %10;
		numero3 += 7;
		numero3 %= 10;
		senha /= 10;
		numero2 = senha % 10;
		numero2 += 7;
		numero2 %= 10;
		senha /= 10;
		numero1 = senha % 10;
		numero1 += 7;
		numero1 %= 10;
	
	int aux, aux2;
	aux = numero3;
	numero3 = numero1;
	aux2 = numero4;
	numero4 = numero2;
	System.out.printf("a senha criptografada e: %d %d %d %d", aux, aux2, numero3, numero4);	
	}
}