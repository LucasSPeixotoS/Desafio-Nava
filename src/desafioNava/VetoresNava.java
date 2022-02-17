package desafioNava;

import java.util.Scanner;

public class VetoresNava {

	public static void main(String[] args) {
		
		/*9)Faça um programa que leia um número inteiro positivo N (máximo = 9) e depois N números inteiros e armazene-os em um vetor.
		 *Em seguida, mostrar na tela todos os números negativos lidos.

		Exemplo:
		Quantos números você vai digitar? 3
		Digite um número: -1
		Digite um número: 9
		Digite um número: -51
		Números Negativos:
		-51
		-1
		Fim */
		
		Scanner entrada = new Scanner(System.in);
		int total, numero;

		System.out.println("Quantos números vovcê vai digitar? ");
		total = entrada.nextInt();
		int [] quantidades = new int [total];
		
		System.out.println("Números negativos:");
		
		for(int i = 0; i < quantidades.length; i++) {
			System.out.println("Digite um número:");
			numero = entrada.nextInt();
			quantidades [i] = numero;
			}
		
		System.out.println("Números negativos:");
		
		for(int i = 0; i < quantidades.length; i++) {
			if (quantidades[i] < 0 ) {
				System.out.println(quantidades[i]);
			}
		}
		
		entrada.close();
	}
}
