/* Desenvolva um aplicativo que determinará se um cliente de uma loja de departamentos excedeu o limite de crédito em uma conta-corrente. 
Para cada cliente, os seguintes fatos estão disponíveis: número da conta, saldo no início do mês, total de todos os itens cobrados desse cliente no mês, total de créditos aplicados ao cliente no mês e limite de crédito autorizado. 
O programa deve inserir todos esses fatos com ponteiros, calcular o novo saldo (= saldo inicial + despesas - créditos), exibir o novo saldo e determinar se o novo saldo excede o limite de crédito do cliente. 
Avisar se o crédito do cliente está excedido ou não.
*/

package exercicios;
import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		Scanner credito = new Scanner (System.in);
		
		int numeroConta;
		double saldoMes, itensCobrados, creditosAplicados, limiteAutorizado;
		
		System.out.println("insira o numero da conta: ");
		numeroConta = credito.nextInt();
		
		System.out.println("Insira seu saldo do mes: ");
		saldoMes = credito.nextInt();
		
		System.out.println("Insira o valor dos itens cobrados: ");
		itensCobrados = credito.nextInt();
		
		System.out.println("Insira o valor gasto em credito desse mes: ");
		creditosAplicados = credito.nextInt();
		
		System.out.println("Insira seu limite de credito: ");
		limiteAutorizado = credito.nextInt();
		
		double calculodeSaldo;
		calculodeSaldo = saldoMes + itensCobrados - limiteAutorizado;
		
		if (calculodeSaldo > 0)
			System.out.printf("novo saldo = %.2f\n !CREDITO EXCEDIDO!", calculodeSaldo);
		else
			System.out.printf("Novo saldo = %.2f\n CREDITO NAO EXCEDIDO", calculodeSaldo );
			
		}
	}

