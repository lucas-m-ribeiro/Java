/*Desenvolva um aplicativo que determine o salário de um empregado que recebe por hora trabalhada. 
A empresa paga “hora normal” para as primeiras 40 horas trabalhadas e 50% a mais para todas as horas trabalhadas além das 40 horas. 
O aplicativo deve receber a quantidade de horas trabalhadas e o valor da hora normal e calcular o salário bruto do empregado. 
*/

package exercicios;
import java.util.Scanner;

public class Exe7 {
	
	public static void main(String[] args) {
		Scanner calculo = new Scanner (System.in);
		
		int salario_normal, salario_extra, horasTrabalhadas, hora_normal, hora_extra;
		
		System.out.println("insira o salario por hora: ");
		salario_normal = calculo.nextInt();
		
		System.out.println("Insira as horas trabalhadas: ");
		hora_normal = calculo.nextInt();
		
		
		horasTrabalhadas = salario_normal * hora_normal;
		
		hora_extra = (salario_normal * 50)/100;
		
		salario_extra = hora_extra * salario_normal;
		
		if (hora_normal <= 40)
			System.out.println("seu salario é de: " +horasTrabalhadas);
		else
			System.out.println("seu salario com hora extra é de: "+ salario_extra);
	}
}
