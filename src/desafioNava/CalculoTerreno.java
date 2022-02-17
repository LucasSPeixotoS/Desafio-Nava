package desafioNava;

import java.util.Scanner;

public class CalculoTerreno {

	
	public static void main(String[] args) {
		
		/*5)	Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. 
		Em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais, conforme exemplo.
		Exemplo:
		Digite a largura do terreno: 10.0
		Digite o comprimento do terreno: 30.0
		Digite o valor do metro quadrado: 200.00
		Área do terreno = 300.00
		Preço do terreno = 60000.00
	
		i)	Declare as variáveis 
		ii)	Monte a lógica
		a.	Receber os dados do usuário
		b.	Fazer o cálculo
		iii)	Exibir o resultado
	
		Obs: Os dados em vermelho, são os dados que o usuário vai digitar*/

		Scanner entrada = new Scanner(System.in);
		double largura, comprimento, areaTotal, valor, precoTerreno;
		
		System.out.println("Digite a largura do terreno: ");
		largura = entrada.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = entrada.nextDouble();
		
		System.out.println("Digite o valor do metro quadrado: ");
		valor = entrada.nextDouble();
		
		areaTotal = largura * comprimento;
		precoTerreno = areaTotal * valor;
		
		System.out.printf("Área do terreno = %.2f.\n", areaTotal);
		System.out.printf("Preço do terreno = %.2f.", precoTerreno);
		
		entrada.close();
	}
}
