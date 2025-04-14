package aula_02;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		double numero_01 = leia.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double numero_02 = leia.nextDouble();
		
		System.out.printf("\n%f + %f = %.2f", numero_01, numero_02, (numero_01 + numero_02));
		System.out.printf("\n%f - %f = %.2f", numero_01, numero_02, (numero_01 - numero_02));
		System.out.printf("\n%f * %f = %.2f", numero_01, numero_02, (numero_01 * numero_02));
		System.out.printf("\n%f / %f = %.2f", numero_01, numero_02, (numero_01 / numero_02));
		System.out.printf("\n%f ^ %f = %.2f", numero_01, numero_02, Math.pow(numero_01, numero_02));
		System.out.printf("\n%f R %f = %.2f", numero_01, numero_02, Math.sqrt(numero_01));
	}

}
