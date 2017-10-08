/*Uma empresa que faz negócios por reembolso postal vende cinco produtos cujos preços de varejo são como segue:  
P1 R$1,00 – 
P2 R$2,98 – 
P3 R$9,98 – 
P4 R$4,49 e 
P5 R$6,87. 
Escreva um aplicativo que leia uma série de pares de números como segue: código do produto, quantidade vendida. 
Seu programa deve determinar o valor total de produtos vendidos, discriminando a porcentagem vendida em dinheiro de cada produto.
*/

package Exercicios;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int qtd;
		int codigo;
		double total = 0;
		int vendidos;

		double p1 = 1;
		double p2 = 2.98;
		double p3 = 9.98;
		double p4 = 4.49;
		double p5 = 6.87;
		
		System.out.println("Entre com a quantidade de produtos que foram vendidos: ");
		vendidos = scanner.nextInt();
		
		for(int k = 0; k < vendidos; k++){
			System.out.println("Entre com o codigo do produto com numeros de 1 a 5: ");
			codigo = scanner.nextInt();
			
			System.out.println("Quantidade de produtos: ");
			qtd = scanner.nextInt();
			
			if(codigo == 1)
				total += qtd * p1;
			
			else if(codigo == 2)
				total = qtd * p2;
			
			else if(codigo == 3)
				total = qtd * p3;
			
			else if(codigo == 4)
				total = qtd * p4;
			
			else if (codigo == 5)
				total = qtd * p5;
		}
		
		System.out.println("Foram vendidos: " + total + " em produtos");
	}
}