
import java.util.Locale;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		//==========================================================================================
		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o. 
		
		int N = 0;
		
		System.out.println("---->>>LER UM VALOR E DIZER SE O MESMO � POSITIVO OU NEGATIVO<<----"); 
		System.out.println("Entre com um Valor:"); 
		N = sc.nextInt(); 
 	     
 		if (N < 0) { 
 			System.out.println("N�mero NEGATIVO"); 
 		} 
		else { 
 			System.out.println("N�mero POSITIVO"); 
 		} 
 
 		
 		//==========================================================================================
 		//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
 		 		
 		int M = 0; 
 		
 		System.out.println();
 		System.out.println("---->>>LER UM VALOR E DIZER SE O MESMO � PAR OU IMPAR<<----"); 
 		System.out.println("Entre com um N�MERO par OU impar:"); 
 		M = sc.nextInt(); 
 		 	     
 		if (M % 2 == 0) { 
			System.out.println("N�mero PAR"); 
 		} 
		else { 
 			System.out.println("N�mero IMPAR"); 
 		} 
 		  			
		
 		//==========================================================================================
 		//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
 		//indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem crescente 
 		//ou decrescente.
 		
 		System.out.println();
		int A = 0;
		int B = 0;		

		System.out.println();
		System.out.println("---->>>LER DOIS VALORES E DIZER SE OS MESMOS S�O MULTIPLOS<<----"); 
		System.out.println("Entre com o 1� Valor:");  
        A = sc.nextInt();
        System.out.println("Entre com o 2� Valor:"); 
		B = sc.nextInt();	
		
		if (A % B == 0 || B % A == 0) {

			System.out.println("Sao Multiplos");

		}

		else {

			System.out.println("Nao sao Multiplos");

		}

		 			
		//==========================================================================================
 		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o 
 		//mesmo pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
 		
		int horaInicial = 0;
		int horaFinal = 0;
		int duracao;

		
		System.out.println();
		System.out.println("---->>>LER HORA INICIAL E FINAL DE UM JOGO E INFORMAR O TEMPO DE DURA��O<<----"); 
		System.out.println("Entre com a Hora Inicial:");  
		horaInicial = sc.nextInt(); 
		System.out.println("Entre com a Hora Final:"); 
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {

			duracao = horaFinal - horaInicial;

		}

		else {

			duracao = 24 - horaInicial + horaFinal;

		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
 		//==========================================================================================
 		//Com base na tabela abaixo, escreva um programa que leia o c�digo de um item e a quantidade deste item. 
 		//A seguir, calcule e mostre o valor da conta a pagar.
 		// 1 - Cachorro quente = R$ 4.00
 		// 2 - X-Salada = R$ 4.50
 		// 3 - X-Bacon  = R$ 5.00
 		// 4 - Torrada Simples = R$ 2.00
 		// 5 - Refrigerante = R$ 1.50

 		int codigo = 0;
		int quantidade = 0;
		double total; 
		
		System.out.println();
		System.out.println("---->>>COM BASE NA TABELA ABAIXO, LER C�DIGO E QTD DE UM ITEM E MOSTRAR O VALOR <<----"); 
		System.out.println("1 - Cachorro quente = R$ 4.00");
 		System.out.println("2 - X-Salada = R$ 4.50");
 		System.out.println("3 - X-Bacon  = R$ 5.00");
 		System.out.println("4 - Torrada Simples = R$ 2.00");
 		System.out.println("5 - Refrigerante = R$ 1.50");
		System.out.println("Entre com o C�digo do �tem:");  
        codigo = sc.nextInt();
        System.out.println("Entre com a Quantidade do �tem:");  
		quantidade = sc.nextInt();

		if (codigo == 1) {

			total = quantidade * 4.0;

		}

		else if (codigo == 2) {

			total = quantidade * 4.5;

		}

		else if (codigo == 3) {

			total = quantidade * 5.0;

		}

		else if (codigo == 4) {

			total = quantidade * 2.0;

		}

		else {

			total = quantidade * 1.5;

		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		
 		//==========================================================================================
 		//Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
 		//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor 
 		//n�o estiver em nenhum destes intervalos, dever� ser impressa a mensagem �Fora de intervalo�.
 		 
 		double numero = 0;

 		System.out.println();
		System.out.println("---->>>LER UM VALOR E INFORMAR EM QUAL INTERVALO ELE SE ENQUADRA, CFME ABAIXO<<----"); 
		System.out.println("INTERVALO [0,25]");
 		System.out.println("INTERVALO (25,50]");
 		System.out.println("INTERVALO (50,75]");
 		System.out.println("INTERVALO (75,100]");
		System.out.println("Entre com o Valor:");  
		numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {

			System.out.println("Fora de intervalo");

		}

		else if (numero <= 25.0) {

			System.out.println("Intervalo [0,25]");

		}

		else if (numero <= 50.0) {

			System.out.println("Intervalo (25,50]");

		}

		else if (numero <= 75.0) {

			System.out.println("Intervalo (50,75]");

		}		

		else {

			System.out.println("Intervalo (75,100]");

		}

		
		//==========================================================================================
 		//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
 		//A seguir, determine qual o quadrante ao qual pertence o ponto, ou se est� sobre um dos eixos cartesianos ou na origem (x = y = 0). 
 		//Se o ponto estiver na origem, escreva a mensagem �Origem�. 
 		//Se o ponto estiver sobre um dos eixos escreva �Eixo X� ou �Eixo Y�, conforme for a situa��o
 		
 		double x = 0.0;
		double y = 0.0;

		System.out.println();
		System.out.println("---->>>LER DOIS VALORES DECIMAIS QUE INFORMAM A COORDENADA DE UM PONTO EM UM PLANO");
		System.out.println("E DIGA EM QUAL QUADRANTE ESTE PONTO EST�<<----"); 
		System.out.println("Entre com o 1� Ponto(X):"); 
		x = sc.nextDouble();
		System.out.println("Entre com o 2� Ponto(Y):"); 
		y = sc.nextDouble();

		if (x == 0.0 && y == 0.0) {

			System.out.println("Origem");

		}

		else if (x == 0.0) {

			System.out.println("Eixo Y");

		}

		else if (y == 0.0) {

			System.out.println("Eixo X");

		}

		else if (x > 0.0 && y > 0.0) {

			System.out.println("QUADRANTE Q1");

		}

		else if (x < 0.0 && y > 0.0) {

			System.out.println("QUADRANTE Q2");

		}

		else if (x < 0.0 && y < 0.0) {

			System.out.println("QUADRANTE Q3");

		}

		else {

			System.out.println("QUADRANTE Q4");

		}

		
		//==========================================================================================
 		//Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele n�o existem pol�ticos corruptos 
 		//e os recursos arrecadados s�o utilizados em benef�cio da popula��o, sem qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$. 
 		//Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve 
 		//pagar de Imposto de Renda, segundo a tabela abaixo
 		//Renda de 0.00 a R$ 2000.00     -  ISENTO
 		//Renda de 2000.01 a R$ 3000.00  -  8%
 		//Renda de 3000.01 a R$ 4500.00  -  18%
 		//Renda acima de R$ 4500.00      -  28%
 		//Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, pois a faixa de sal�rio que fica de R$ 0.00 at� R$ 2000.00 
 		//� isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa � de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. 
 		//O valor deve ser impresso com duas casas decimais. 
 		
 		double imposto = 0.0;  
 		double salario = 0.0; 
 		
 		System.out.println();
		System.out.println("---->>>LER UM VALOR DE SALARIO DE UMA PESSOA E CALCULAR O IMPOSTO A SER PAGA, CFME TABELA<<----"); 
		System.out.println("Renda de 0.00 a R$ 2000.00     -  ISENTO");
 		System.out.println("Renda de 2000.01 a R$ 3000.00  -  8%");
 		System.out.println("Renda de 3000.01 a R$ 4500.00  -  18%");
 		System.out.println("Renda acima de R$ 4500.00      -  28%");
		System.out.println("Entre com o Valor do Sal�rio:"); 
		salario = sc.nextDouble();

		if (salario <= 2000.0) {

			imposto = 0.0;

		}

		else if (salario <= 3000.0) {

			imposto = (salario - 2000.0) * 0.08;

		}

		else if (salario <= 4500.0) {

			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;

		}

		else {

			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;

		}



		if (imposto == 0.0) {

			System.out.println("Isento");

		}

		else {

			System.out.printf("R$ %.2f%n", imposto);

		} 		
 				
 		
	    sc.close(); 	


	}

}
