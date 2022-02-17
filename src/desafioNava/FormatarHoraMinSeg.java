package desafioNava;

import java.util.Scanner;

public class FormatarHoraMinSeg {

	public static void main(String[] args) {
		
		/*6)	Fazer um programa para ler uma dura��o de tempo em segundos, da� imprimir na tela esta dura��o no formato horas:minutos:segundos conforme exemplo:
			Exemplo de resultado esperado.
			Digite a dura��o em segundos: 140811
			39:6:51 
			Obs: Os dados em vermelho, s�o os dados que o usu�rio vai digitar.*/
		
		Scanner entrada = new Scanner(System.in);
		int duracao, segundos = 0;
		int minutos = 0;
		int horas = 0;
		
		System.out.println("Digite a dura��o em segundos: ");
		duracao = entrada.nextInt();
		
		for(int i = 0; i < duracao; i++) {
			
			if(segundos <= i) {
				segundos = segundos + 1;
			}
			if(segundos == 60) {
				segundos = 0;
				minutos = minutos + 1;
			}
			
			if(minutos == 60) {
				minutos = 0;
				horas = horas + 1;
			}
			
		}
		System.out.printf("Isso equivale a %d:%d:%d.", horas, minutos, segundos);
		
		entrada.close();
	}
	
}
