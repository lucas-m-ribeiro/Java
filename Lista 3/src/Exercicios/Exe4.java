/* Escreva um método múltiplo() que determina um par de inteiros se o se segundo é múltiplo do primeiro. 
O método deve retorna o valor boleano true se o segundo número for múltiplo do primeiro. */

package Exercicios;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		Scanner multiplo = new Scanner(System.in);
		
		//void calcula() {
			
		int num1, num2;
		boolean confirma;
		
		System.out.println("Entre com um numero: ");
		num1 = multiplo.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		num2 = multiplo.nextInt();
		
		if(num1 % num2 == 0){
			confirma = true;
			System.out.println(confirma);
		}
		else{
			confirma = false;
			System.out.println(confirma);
			}
	}
}

