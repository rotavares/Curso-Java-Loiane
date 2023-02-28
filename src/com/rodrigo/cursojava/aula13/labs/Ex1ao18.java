package com.rodrigo.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex1ao18 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* 1. Faça um Programa que mostre a mensagem " Alo mundo" na tela.
		System.out.println("Alo mundo"); */
		
		/* 2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi{número}.
		System.out.println("Digite um número");
		int numero = scan.nextInt();
		System.out.println("O número informado foi " + numero + "."); */	
	
		/* 3. Faça um Programa que peça dois números e imprima a soma.
		System.out.println("Digite dois números para a soma");
		int n1 = scan.nextInt(), n2 = scan.nextInt();
		int soma = n1 + n2;
		System.out.println("A soma de " + n1 + " com " + n2 + " é " + soma + "."); */
		
		/* 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		System.out.println("Informe as 4 notas bimestrais para o calculo da média.");
		double nb1 = scan.nextDouble(), nb2 = scan.nextDouble(), nb3 = scan.nextDouble(), nb4 = scan.nextDouble();
		double media = (nb1 + nb2 + nb3 + nb4)/4 ;
		System.out.println("Média: " + media); */
		
		/* 5. Faça um Programa que converta metros para centímetros.
		System.out.print("Metro: ");
		int metro = scan.nextInt();
		int cm = metro * 100;
		System.out.println("Centímetro: " + cm +" cm"); */
		
		/* 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		System.out.println("Digite o raio de um círculo: ");
		double raio = scan.nextDouble();
		double area = Math.PI*Math.pow(raio, 2);
		System.out.println("Área = " + area); */
		
		/* 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
		System.out.println("Lado do quadrado: ");
		int lado = scan.nextInt();
		int area = (int) Math.pow(lado, 2);
		int dobro = area * 2;
		System.out.println("Área do quadrado é " + area + " cm²");
		System.out.println("Dobro da área do quadrado é " + dobro + " cm²"); */
		
		/* 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu Salário no referido mês.
		System.out.println("Quanto você ganha por hora?");
		double hora = scan.nextDouble();
		System.out.println("Quantas horas trabalhadas no mês?");
		int horas = scan.nextInt();
		double salario = hora * horas;
		System.out.println("Salário mensal de R$" + salario); */
		
		/* 9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
		System.out.println("Digite a temperatura em Farenheits");
		int F = scan.nextInt();
		int C = (5 * (F-32)/9);
		System.out.println("----------------");
		System.out.println(" " + F+"°F"+ "   =   " + C+"°C");
		System.out.println("----------------"); */
		
		/* 10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
		System.out.println("Digite a temperatura em Celsius");
		int C = scan.nextInt();
		int F = ((C * 9/5)+32);
		System.out.println("----------------");
		System.out.println(" " + C+"°C"+ "   =   " + F+"°F");
		System.out.println("----------------"); */
		
		/* 11. Faça um programa que peça 2 números inteiros e um número real Calcule e mostre:
			a. o produto do dobro do primeiro com metade do segundo.
			b. a soma do triplo do primeiro com o terceiro.
			c. o terceiro elevado ao cubo. 
		System.out.println("Digite 2 números inteiros e um número real");
		int inteiro1 = scan.nextInt(), inteiro2 = scan.nextInt(),;
		double real = scan.nextDouble();
		int a = (inteiro1 * 2) * (inteiro2/2);
		double b = (inteiro1 * 3) + real;
		double c = Math.pow(real, 3);
		System.out.println("Dobro do primeiro com o terceiro "+ a);
		System.out.println("Soma do triplo do primeiro com o terceiro "+ b);
		System.out.println("o terceiro elevado ao cubo "+ c); */
		
		/* 12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguintes fórmula:
		 * (72.7*altura)-58
		System.out.print("Altura: ");
		double altura = scan.nextDouble();
		double calculo= (72.7*altura)-58;
		System.out.println("Peso ideal: "+calculo); */
		
		/* 13. Tendo como dados de entrada a altura e o sexo de uma pessoa, constua um algoritmo que calcule seu peso ideal, utilizando as seguintes formulas:
		 * Para homens: (72.7*h)-58
		 * Para mulheres: (62.1*h)-44.7 (h = altura)
		 * Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
		
		System.out.print("Altura: ");
		float h = scan.nextFloat();
		System.out.print("Sexo: ");
		String sexo = scan.next();
		int homem = (int) ((72.7*h)-58);
		int mulher = (int) ((62.1*h)-44.7);
		double peso = scan.nextDouble();
		System.out.println("Altura = "+h);
		System.out.println("Sexo = "+sexo);
		boolean hdentro = (peso == homem);
		boolean hacima = (peso > homem);
		boolean habaixo = (peso < homem);
		boolean mdentro = (peso == mulher);
		boolean macima = (peso > mulher);
		boolean mabaixo = (peso < mulher);
		System.out.println("Dentro do peso homem = " + hdentro);
		System.out.println("Acima do peso homem = " + hacima);
		System.out.println("Abaixo do peso homem = " +habaixo);
		System.out.println("----------------------------");
		System.out.println("Dentro do peso mulher = " + mdentro);
		System.out.println("Acima do peso mulher = " + macima);
		System.out.println("Abaixo do peso mulher = " +mabaixo); */
		
		/* 14.João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		 * 
		int peso = scan.nextInt();
		boolean limite = (peso > 50); */
		
		/* 15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
			. salário bruto.
			
			a. quanto pagou ao INSS.
			
			b. quanto pagou ao sindicato.
			
			c. o salário líquido.
			
			d. calcule os descontos e o salário líquido.  
		
		System.out.println("Quanto você ganha por hora?");
		int hora = scan.nextInt();
		System.out.println("Quantas horas trabalhadas no mês?");
		int horas = scan.nextInt();
		double bruto = hora * horas;
		double ir = (11 * bruto)/100;
		double inss = (8 * bruto)/100;
		double sindicato = (5 * bruto)/100;
		double liquido = bruto - ir - inss - sindicato;
		System.out.println("+ Salário Bruto : R$"+bruto);
		System.out.println("- IR (11%) : R$"+ir);
		System.out.println("- INSS (8%) : R$"+inss);
		System.out.println("- Sindicato (5%) : R$"+sindicato);
		System.out.println("+ Salário Liquido : R$"+liquido); */
		
		/* 16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total. 
		System.out.print("Quantidade de metros quadrados: ");
		int metrosQuadrados = scan.nextInt();
		int litrosNecessario = metrosQuadrados/3;
		int preco = 80;
		int capacidade = 18;
		int latas = litrosNecessario/capacidade;
		int total = latas * preco;
		System.out.println("Latas necessarias "+latas);
		System.out.println("Total: R$"+total); */
		
		/* 17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
				Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
				
				comprar apenas latas de 18 litros:
				
				comprar apenas galões de 3,6 litros;
				
				misturar latas e galões, de forma que o preço seja o menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias. 
				
		System.out.print("Informe a área em metros quadrados: ");
		int areaMetrosQuadrados = scan.nextInt();
		int quantidade = areaMetrosQuadrados/6;
		int precoLata = 80;
		int precoGalao = 25;
		int lata = 18;
		double galao = 3.6;
		int galoes = (int) (quantidade/galao);
		int latas  = quantidade/lata;
		int totalLatas = latas * precoLata;
		int totalGaloes = galoes * precoGalao;
		System.out.println("Quantidade de latas "+latas);
		System.out.println("Preço total latas: R$"+totalLatas);
		System.out.println(" ");
		System.out.println("Quantidade de galões "+galoes);
		System.out.println("Preço total galões: R$"+totalGaloes); */
		
		
		
		/* 18.Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (Mbps), calcule e informe o tempo aproxiamdo de download do arquivo usando este link (em minutos).
		
		System.out.println("Informe o tamanho do arquivo para download (em MB).");
		double tamanhoArquivo = scan.nextDouble();
		System.out.println("Qual é a velocidade da internet (em Mbps).");
		double velocidadeInternet = scan.nextDouble();
		double minutos = tamanhoArquivo/velocidadeInternet;
		System.out.println("Tempo aproximado de download - "+minutos+" minutos"); */ 
		
		scan.close();
		
	}
}
