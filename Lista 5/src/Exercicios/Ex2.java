/* Escreva um aplicativo que solicite ao usuário inserir o tamanho do lado de um quadrado e então exiba um quadrado vazio desse tamanho com asteriscos. 
Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis entre 1 e 20. 
*/

package Exercicios;
import java.util.Scanner;

public class quadrado{
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        System.out.print(" Digite o numero do tamanho do quadrado de 1 a 20 :");
        int q = input.nextInt();
		
        for (int a = 1; a <= q; a++) {
            System.out.print("*");
        }
        for (int a = 1; a <= q - 2; a++) {
            System.out.print("\n*");
            switch (q) {
                case 3:
                    System.out.print(" ");
                    break;
                case 4:
                    System.out.print("  ");
                    break;
                case 5:
                    System.out.print("   ");
                    break;
                case 6:
                    System.out.print("    ");
                    break;
                case 7:
                    System.out.print("     ");
                    break;
                case 8:
                    System.out.print("      ");
                    break;
                case 9:
                    System.out.print("       ");
                    break;
                case 10:
                    System.out.print("        ");
                    break;
                case 11:
                    System.out.print("         ");
                    break;
                case 12:
                    System.out.print("          ");
                    break;
                case 13:
                    System.out.print("           ");
                    break;
                case 14:
                    System.out.print("            ");
                    break;
                case 15:
                    System.out.print("             ");
                    break;
                case 16:
                    System.out.print("              ");
                    break;
                case 17:
                    System.out.print("               ");
                    break;
                case 18:
                    System.out.print("                ");
                    break;
                case 19:
                    System.out.print("                 ");
                    break;
                case 20:
                    System.out.print("                  ");
                    break;
            }
            System.out.print("*\n");
        }
        for (int a = 1; a <= q; a++) {
            System.out.print("*");
        }
    }
}