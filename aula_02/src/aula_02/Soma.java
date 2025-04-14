package aula_02;

public class Soma {

	public static void main(String[] args) {
		
		int numero_01 = 2, numero_02 = 2;
		String numeroS_01 = "2", numeroS_02 = "2";
		
		System.out.printf("\nSoma: %d + %d = %d", numero_01, numero_02, (numero_01 + numero_02));
		System.out.printf("\nConcatenação: %s + %s = %s", numeroS_01, numeroS_02, (numeroS_01 + numeroS_02));
		
		// Atribuição com soma
		System.out.println(numero_01 = numero_01 + 2);
		System.out.println(numero_02 += 2);
	}

}
