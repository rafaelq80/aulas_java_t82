package aula_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestaStreams {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");

		List<Integer> numerosAoCubo = numeros.stream()
				.map(n -> (int) Math.pow(n, 3))
				.collect(Collectors.toList());
		
		System.out.println("Numeros elevados ao cubo: " + numerosAoCubo);
		System.out.println("Coleção Numeros: " + numeros);
		
		List<Integer> numerosPares = numeros.stream()
				.filter(n -> n%2 == 0)
				.collect(Collectors.toList());
		
		System.out.println("Numeros pares: " + numerosPares);
		
		estados.stream()
				.filter(e -> e.toUpperCase().startsWith("R"))
				.forEach(System.out::println);
			
		long contagemEstadosIniciandoR = estados.stream()
				.filter(e -> e.toUpperCase().startsWith("R"))
				.distinct()
				.count();
		
		System.out.println("Estados que iniciam com a letra R: " + contagemEstadosIniciandoR);
		
		List<Integer> numerosOrdenados = numerosDesordenados.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Numeros Ordenados: " + numerosOrdenados);
		
	}

}
