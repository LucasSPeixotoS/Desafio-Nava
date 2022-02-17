package desafioNava;

import java.util.Scanner;

public class FormatarHoraMinSeg {

	public static void main(String[] args) {
		
		/*6)	Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no formato horas:minutos:segundos conforme exemplo:
			Exemplo de resultado esperado.
			Digite a duração em segundos: 140811
			39:6:51 
			Obs: Os dados em vermelho, são os dados que o usuário vai digitar.*/
		
		Scanner entrada = new Scanner(System.in);
		int duracao, segundos = 0;
		int minutos = 0;
		int horas = 0;
		
		System.out.println("Digite a duração em segundos: ");
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
