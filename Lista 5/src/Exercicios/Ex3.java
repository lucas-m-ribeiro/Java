/* Escreva um aplicativo que leia três valores, diferentes de zero 
inseridos pelo usuário e determine e imprima se eles poderiam representar os lados de um triângulo retângulo. 
*/

package Exercicios;

import java.util.Scanner;

public class Ex3 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int soma = 0;

		System.out.println("Entre com 1° valor: ");
		num1 = entrada.nextInt();
		System.out.println("Entre com o 2° valor: ");
		num2 = entrada.nextInt();
		System.out.println("Entre com o 3° valor: ");
		num3 = entrada.nextInt();

		if ((num1 * num1) + (num2 * num2) == (num3 * num3)) {
			System.out.println("É triangulo retangulo!");
		} else if ((num2 * num2) + (num1 * num1) == (num3 * num3)) {
			System.out.println("É triangulo retangulo!");
		} else if ((num2 * num2) + (num3 * num3) == (num1 * num1)) {
			System.out.println("É triangulo retangulo!");
		} else if ((num1 * num1) + (num3 * num3) == (num2 * num2)) {
			System.out.println("É triangulo retangulo!");
		} else if ((num3 * num3) + (num1 * num1) == (num2 * num2)) {
			System.out.println("É triangulo retangulo!");
		} else if ((num3 * num3) + (num2 * num2) == (num1 * num1)) {
			System.out.println("É triangulo retangulo!");
		} else {
			System.out.println("Nao é triangulo retanulo!");

		}
	}
}