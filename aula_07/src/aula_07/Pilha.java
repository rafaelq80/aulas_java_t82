package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Cria a Estrutura de dados Pilha
		Stack<String> pilha = new Stack<String>();
		
		// Adiciona elementos na pilha
		pilha.add("Comunicação não Violenta");
		pilha.add("IT: A Coisa");
		pilha.add("A Coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Diário de um Banana");
		pilha.add("Senhor dos Anéis");
		pilha.add("O Código Da Vinci");
		
		// Adicionar um elemento na pilha, via teclado 
		System.out.println("Digite o Título de um livro: ");
		pilha.push(leia.nextLine());
		
		System.out.println(pilha);
		
		// Retira um elemento da Pilha 
		pilha.pop();
		
		System.out.println(pilha);
		
		// Adiciona um Elemento na pilha
		pilha.push("Roube como um Artista");

		System.out.println(pilha);
		
		// Exibe o elemento que está no topo da pilha
		System.out.println(pilha.peek());
		
		// Verifica se um elemento existe na pilha
		System.out.println("O Livro Diário de um Banana, existe na Pilha? " + pilha.contains("Diário de um Banana"));
		
		leia.close();
	}

}
