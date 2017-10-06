/*Considere uma grande empresa que paga seu pessoal de vendas com base em comissões. 
O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante a semana. 
Desenvolva um aplicativo que receba a entrada de itens vendidos por um vendedor durante a última semana e calcule e exibe os rendimentos do vendedor */

package exercicios;
import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args){
		Scanner aumento = new Scanner (System.in);
		
		int vendas, comissao, calculo;
		
		System.out.println("Insira o valor das vendas realizada: ");
		vendas = aumento.nextInt();
		
		calculo = (vendas * 9)/100;
		comissao = calculo + 200;
		
		System.out.println("sua comissao é de " +calculo);
		System.out.println("Seu salario com comissao é de: " +comissao);
	}
}
