package exercicios;

import java.util.Scanner;

public class Descriptografa {

	public static void main(String[] args) {

				Scanner criptografa = new Scanner (System.in);
				
				int senha = 0;
				while (senha > 10000 || senha < 1000){
					System.out.println("Digite uma senha com 4 digitos: ");
					senha = criptografa.nextInt();
				}
				int numero1, numero2, numero3, numero4;
				
				numero4 = senha % 10;
				numero4 = (numero4 + 10) - 7;
				numero4 %= 10;
				senha /= 10;
				numero3 = senha %10;
				numero3 = (numero3 + 10) - 7;
				numero3 %= 10;
				senha /= 10;
				numero2 = senha % 10;
				numero2 = (numero2 + 10) - 7;
				numero2 %= 10;
				senha /= 10;
				numero1 = senha % 10;
				numero1 = (numero1 + 10) - 7;
				numero1 %= 10;
			
			int aux, aux2;
			aux = numero3;
			numero3 = numero1;
			aux2 = numero4;
			numero4 = numero2;
			System.out.printf("a senha criptografada e: %d %d %d %d\n", aux, aux2, numero3, numero4);	
	}
}