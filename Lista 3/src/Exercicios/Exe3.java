/* Um estacionamento cobra uma taxa mínima de R$2,00 para estacionar por até três horas. 
Um adicional de R$0,50 por hora não necessariamente inteira é cobrado após as três primeiras horas. 
Escreva um aplicativo que calcule e exiba as taxas de estacionamento para um cliente que estacionou. 
O aplicativo deve receber o intervalo de tempo que o veículo ficou estacionado e exibir a cobrança para o cliente.
*/

package Exercicios;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner tempo = new Scanner (System.in);
		
		double taxa = 2.00;
		double hora;
		
		System.out.println("Digite o tempo do veiculo estacionado: ");
		hora = tempo.nextDouble();
		
		if(hora > 3.00){
			double tempoExtra = hora - 3;
			double pagamento = (0.50 * tempoExtra) + 2;
			
			System.out.printf("o valor tota do estacionamento e %.2f", pagamento);
		}
		else{
			System.out.println("O valor do estacionamento e a taxa minima R$ 2.00");
		}
	}
}
