package desafioNava;

import java.util.Scanner;

public class ValoresCoordenadas {
	
	public static void main(String[] args) {
		
		/*7)Leia os valores das coordenadas X e Y de um ponto no plano cartesiano.
		 *  A seguir, determine qual o quadrante ao qual pertence o ponto (Q1, Q2, Q3 ou Q4).
		 *   Se o ponto estiver na origem, escreva a mensagem “ORIGEM”.
		 *  Se o ponto estiver sobre um dos eixos, escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
		 *     y
		 *  q2|q1
		 * ---|--- x
		 *  q3|q4
		 */
		Scanner entrada = new Scanner(System.in);
		double x, y;
		
		System.out.println("Digite o valor de X.");
		x = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y.");
		y = entrada.nextDouble();
		
		if (x > 0 && y > 0 ) {
			System.out.println("Pertence a Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Pertence a Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Pertence a Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Pertence a Q4");
		} else if (x == 0 && y == 0) {
			System.out.println("ORIGEM!");
		}
		
		entrada.close();
	}

}
