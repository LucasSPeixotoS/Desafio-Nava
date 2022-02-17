package desafioNava;

import java.util.Scanner;

public class VetoresNava {

	public static void main(String[] args) {
		
		/*9)Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 9) e depois N n�meros inteiros e armazene-os em um vetor.
		 *Em seguida, mostrar na tela todos os n�meros negativos lidos.

		Exemplo:
		Quantos n�meros voc� vai digitar? 3
		Digite um n�mero: -1
		Digite um n�mero: 9
		Digite um n�mero: -51
		N�meros Negativos:
		-51
		-1
		Fim */
		
		Scanner entrada = new Scanner(System.in);
		int total, numero;

		System.out.println("Quantos n�meros vovc� vai digitar? ");
		total = entrada.nextInt();
		int [] quantidades = new int [total];
		
		System.out.println("N�meros negativos:");
		
		for(int i = 0; i < quantidades.length; i++) {
			System.out.println("Digite um n�mero:");
			numero = entrada.nextInt();
			quantidades [i] = numero;
			}
		
		System.out.println("N�meros negativos:");
		
		for(int i = 0; i < quantidades.length; i++) {
			if (quantidades[i] < 0 ) {
				System.out.println(quantidades[i]);
			}
		}
		
		entrada.close();
	}
}
