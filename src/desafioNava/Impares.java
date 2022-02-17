package desafioNava;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		
		/*8)	Leia um valor inteiro X. 
		 * Em seguida mostre os ímpares de 1 a X, um valor por linha, inclusive o X, se for o caso.
			Exemplo: 
			Digite o valor de X: 8
			1
			3
			5
			7
			Fim */
		
		Scanner entrada = new Scanner(System.in);
		int x = 0;
		
		System.out.println("Digite um valor inteiro para X");
		x = entrada.nextInt();
		
		for(int i = 1; i <= x; i++) {
			
			if (i % 2 == 1) {
				System.out.println(i + " É ímpar!");
			}
		}
		
		
		entrada.close();
	}
}
