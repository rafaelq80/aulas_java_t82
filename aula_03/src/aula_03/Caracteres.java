package aula_03;

public class Caracteres {

	public static void main(String[] args) {
		
		String frase_01 = "Turma Java 82";
		String frase_02 = "TURMA JAVA 82";
		String frase_03 = "TURMA JAVA 82";
		
		System.out.println(frase_01 == frase_02);
		System.out.println(frase_03 == frase_02);
		
		System.out.println(frase_01.equals(frase_02));
		System.out.println(frase_03.equals(frase_02));
		
		System.out.println(frase_01.equalsIgnoreCase(frase_02));
		System.out.println(frase_03.equalsIgnoreCase(frase_02));
		
		System.out.println(frase_01.compareToIgnoreCase(frase_02));
		System.out.println(frase_03.compareTo(frase_02));
	}

}
