package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int dividendo = 0;
		int divisor = 0;

		while (true) {

			try {

				System.out.println("Digite o Dividendo: ");
				dividendo = leia.nextInt();

				System.out.println("Digite o Divisor: ");
				divisor = leia.nextInt();

				divide(dividendo, divisor);
				break;

			} catch (InputMismatchException e) {
				//System.out.println("Erro: " + e);
				leia.nextLine();
				System.out.println("Digite um número inteiro positivo\n");
			} catch (ArithmeticException e) {
				//System.out.println("Erro: " + e);
				leia.nextLine();
				System.out.println("Digite um número inteiro diferente de zero\n");
			} finally {
				System.out.println("Programa em Execução!");
			}

		}

		leia.close();
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
