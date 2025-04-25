package aula_08;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while(true) {
			
			System.out.println("\nDigite o primeiro numero:");
			double numero1 = leia.nextDouble();
			
			System.out.println("Digite o segundo numero:");
			double numero2 = leia.nextDouble();
			
			System.out.println("\n**************************************************");
			System.out.println("1 - Somar                                         ");
			System.out.println("2 - Subtrair                                      ");
			System.out.println("3 - Multiplicar                                   ");
			System.out.println("4 - Dividir                                       ");
			System.out.println("0 - Sair                                          ");
			System.out.println("**************************************************");
			System.out.println("Qual operação matemática você deseja executar     ");
			
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				leia.close();
				sobre();
				System.exit(0);
			}
					
			switch(opcao) {
				case 1 -> System.out.printf("\n%.2f + %.2f = %.2f", numero1, numero2, somar(numero1, numero2));
				case 2 -> System.out.printf("\n%.2f - %.2f = %.2f", numero1, numero2, subtrair(numero1, numero2));
				case 3 -> System.out.printf("\n%.2f * %.2f = %.2f", numero1, numero2, multiplicar(numero1, numero2));
				case 4 -> {
					var divisao = dividir(numero1, numero2);
					if (divisao == -1)
						System.out.println("Não existe divcisão por zero!");
					else
						System.out.printf("\n%.2f / %.2f = %.2f", numero1, numero2, divisao);
				}
				default -> System.out.println("\n Opção inválida!");
			}
			
			
			
		}
		
	}
	
	static double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	static double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}
	
	static double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}
	
	static double dividir(double numero1, double numero2) {
		if (numero2 == 0) {
			return -1;
		}
		
		return numero1 / numero2;
	}
	
	static void sobre() {
		System.out.println("Calculadora com Métodos");
		System.out.println("Feito por: Rafael");
	}

}
