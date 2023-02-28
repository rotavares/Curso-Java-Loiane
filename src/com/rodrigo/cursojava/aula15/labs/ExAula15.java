package com.rodrigo.cursojava.aula15.labs;

import java.util.Scanner;

public class ExAula15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	/* 1.
	 
		System.out.print("Digite o primeiro número ");
		int primeiroNumero = scan.nextInt();
		
		System.out.print("Digite o segundo número ");
		int segundoNumero = scan.nextInt();
		
		if (primeiroNumero > segundoNumero) {
			System.out.println("Maior número: "+primeiroNumero);
		} else if (segundoNumero > primeiroNumero) {
			System.out.println("Maior número: "+segundoNumero);
		} else {
			System.out.println("Os dois números possui o mesmo valor, Empate!");
		} */
	
		
	/* 2.	
		
		System.out.println("Digite um valor");
		int valor = scan.nextInt();
	
		if (valor < 0) {
			System.out.println("Negativo");
		} else if (valor > 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Por favor, digite um valor!");
		} */
		
		/* System.out.println("Informe seu sexo");
		char coletaSexo = scan.next().charAt(0);
		
		switch(coletaSexo) {
		case 'm': System.out.println("Masculino"); break;
		case 'f': System.out.println("Feminino"); break;
		case 'M': System.out.println("Masculino"); break;
		case 'F': System.out.println("Feminino"); break;
		default: System.out.println("Sexo Inválido");
		} */
		
		 /* System.out.println("Digite o primeiro número: ");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNumero = scan.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int terceiroNumero = scan.nextInt();
		
		
		if (primeiroNumero > segundoNumero && segundoNumero > terceiroNumero) {
			if (segundoNumero > terceiroNumero) {
				System.out.println(primeiroNumero+" "+segundoNumero+" "+terceiroNumero);
			} else {
				System.out.println(primeiroNumero+" "+terceiroNumero+" "+segundoNumero);
			}
		} else if (segundoNumero > primeiroNumero && primeiroNumero > terceiroNumero) {
			if (primeiroNumero > terceiroNumero) {
				System.out.println(segundoNumero+" "+primeiroNumero+" "+terceiroNumero);
			} else {
				System.out.println(segundoNumero+" "+terceiroNumero+" "+primeiroNumero);
			}
		} else {
			if (terceiroNumero > primeiroNumero && primeiroNumero > segundoNumero) {
				System.out.println(terceiroNumero+" "+primeiroNumero+" "+segundoNumero);
			} else {
				System.out.println(terceiroNumero+" "+segundoNumero+" "+terceiroNumero);
			}
		} */
		
		/* System.out.println("Em que turno você estuda? (M-matutino, V-vespertino ou N-noturno)");
		
		char perguntaHorario = scan.next().charAt(0);
		switch(perguntaHorario) {
		case 'M','m': System.out.println("Bom dia!"); break;
		case 'V','v': System.out.println("Boa tarde!"); break;
		case 'N','n': System.out.println("Boa noite!"); break;
		default: System.out.println("Valor Inválido");
		} */
		
		/* System.out.print("Digite o salário para o reajuste: R$");
		double ajuste, salarioInformado;
		salarioInformado = scan.nextDouble();
		System.out.println("Salário antes do reajuste: R$"+salarioInformado);
		if (salarioInformado > 280 && salarioInformado < 700) {
			 ajuste = salarioInformado * 1.15;
			 System.out.println("Percentual de aumento de 15%");
		} else if (salarioInformado >=700 && salarioInformado < 1500){
			 ajuste = salarioInformado * 1.10;
			 System.out.println("Percentual de aumento de 10%");
		} else if (salarioInformado >= 1500) {
			ajuste = salarioInformado * 1.05;
			System.out.println("Percentual de aumento de 5%");
		} else {
			ajuste = salarioInformado * 1.20;
			System.out.println("Percentual de aumento de 20%");
		}
		double valorAumento = ajuste - salarioInformado;
		System.out.println("Valor do aumento: R$"+ valorAumento);
		System.out.println("Salário ajustado: R$"+ajuste); */
		
		/*System.out.println("Quanto você ganha por hora?");
		int hora = scan.nextInt();
		System.out.println("Quantas horas trabalhadas no mês?");
		int horas = scan.nextInt();
		double bruto = hora * horas;
		System.out.println("Salário Bruto:("+hora+" * "+horas+")");
		double ir = 0;
		double inss = (10 * bruto)/100;
		double fgts = (11 * bruto)/100;
		if (bruto > 900 && bruto < 1500) {
			ir = (5*bruto)/100;
			System.out.println("(-) IR (5%)               : R$ "+ir);
			System.out.println("(-) INSS (10%)            : R$ "+inss);
			System.out.println("FGTS (11%)                : R$ "+fgts);
			double liquido = bruto - ir - inss;
			double descontos = ir + inss;
			System.out.println("Total de descontos        : R$ "+descontos);
			System.out.println("Salário Liquido           : R$ "+liquido);
		} else if (bruto < 2500) {
			ir = (10*bruto)/100;
			System.out.println("(-) IR (10%)              : R$ "+ir);
			System.out.println("(-) INSS (10%)            : R$ "+inss);
			System.out.println("FGTS (11%)                : R$ "+fgts);
			double liquido = bruto - ir - inss;
			double descontos = ir + inss;
			System.out.println("Total de descontos        : R$ "+descontos);
			System.out.println("Salário Liquido        	  : R$ "+liquido);
		} else if (bruto > 2500) {
			ir = (20*bruto)/100;
			System.out.println("(-) IR (20%)              : R$ "+ir);
			System.out.println("(-) INSS (10%)            : R$ "+inss);
			System.out.println("FGTS (11%)                : R$ "+fgts);
			double liquido = bruto - ir - inss;
			double descontos = ir + inss;
			System.out.println("Total de descontos        : R$ "+descontos);
			System.out.println("Salário Liquido           : R$ "+liquido);
		} */
		
		/*System.out.print("Digite o número ");
		int numero = scan.nextInt();
		
		switch (numero) {
		case 1 : System.out.println("Domingo"); break;
		case 2 : System.out.println("Segunda"); break;
		case 3 : System.out.println("Terça"); break;
		case 4 : System.out.println("Quarta"); break;
		case 5 : System.out.println("Quinta"); break;
		case 6 : System.out.println("Sexta"); break;
		case 7 : System.out.println("Sábado"); break;
		default: System.out.println("Valor inválido");
		}*/
		
		/*System.out.print("Primeira nota ");
		double primeiraNota = scan.nextDouble();
		System.out.print("Segunda nota ");
		double segundaNota = scan.nextDouble();
		double media = (primeiraNota+segundaNota)/2;
		System.out.println("Primeira nota: "+primeiraNota+"\nSegunda nota: "+segundaNota+"\nMédia: "+media);
		if (media > 9.0 && media < 10.00) {
			System.out.println("Conceito: A");
		} else if (media > 7.5 && media < 9.0) {
			System.out.println("Conceito: B");
		} else if (media > 6.0 && media < 7.5) {
			System.out.println("Conceito: C");
		} else if (media > 4.0 && media < 6.0) {
			System.out.println("Conceito: D");
		} else if (media > 0 && media < 4.0) {
			System.out.println("Conceito: E");
		} else {
		} if (media > 9.0 && media < 10.00) {
			System.out.println("APROVADO");
		} else if (media > 7.5 && media < 9.0) {
			System.out.println("APROVADO");
		} else if (media > 6.0 && media < 7.5) {
			System.out.println("APROVADO");
		} else if (media > 4.0 && media < 6.0) {
			System.out.println("REPROVADO");
		} else if (media > 0 && media < 4.0) {
			System.out.println("REPROVADO");
		} else {
			
		} */
		
		/*System.out.print("Primeiro lado: ");
		double primeiroLado = scan.nextDouble();
		
		System.out.print("Segundo lado: ");
		double segundoLado = scan.nextDouble();
		
		System.out.print("Terceiro lado: ");
		double terceiroLado = scan.nextDouble();
		
		if (primeiroLado == segundoLado && segundoLado == terceiroLado) {
			System.out.println("Triângulo Equilátero");
		} else if (primeiroLado == segundoLado && terceiroLado != primeiroLado) {
				System.out.println("Triângulo Isósceles");
		} else if (terceiroLado == primeiroLado && segundoLado != terceiroLado) {
				System.out.println("Triângulo Isósceles");
		} else if (segundoLado == terceiroLado && terceiroLado != primeiroLado){
				System.out.println("Triângulo Isósceles");
		} else {
			System.out.println("Triângulo Escaleno"); 
		} */
		
		/* System.out.println("Valor de A: ");
		double valorA = scan.nextDouble();
		
		if (valorA == 0) {
			
			System.out.println("A equação não é de segundo grau, programa encerrado.");
			
		}
		
		System.out.println("Valor de B: ");
		double valorB = scan.nextDouble();
		
		System.out.println("Valor de C: ");
		double valorC = scan.nextDouble();
		
		double delta = ((valorB*valorB)-(4*valorA*valorC));
		
		if (delta < 0) {
			System.out.println("O delta é negativo, a equação não possui raizes reais, programa encerrado.");
		} else if (delta == 0) {
			System.out.println("A equação possui apenas uma raiz real.");
		} else {
			System.out.println("A equação possuis duas raizes reais.");
		} */
		
		/* System.out.print("Digite o ano: ");
		int ano = scan.nextInt();
		
		if (ano % 4 == 0 && (ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O ano de "+ano+" é bissexto");
		} else {
			System.out.println("O ano de "+ano+" não é bissexto");
		} */
		
		/* System.out.println("Digite uma data no formato dd/mm/aaaa");
		int dia = scan.nextInt();
		if(dia > 31) {
			System.out.println("Formato inválido");
		} else if (dia > 0) {
			int mes = scan.nextInt();
				if (mes > 12) {
					System.out.println("Formato inválido");
				} else if (mes > 0) {
					int ano = scan.nextInt();
				if (ano > 9999) {
					System.out.println("Formato inválido");
				} else {
					System.out.println(dia+"/"+mes+"/"+ano);
				}
				}
		} */
	
	/* System.out.print("Digite um número menor que 1000: ");
	int numero = scan.nextInt();
	if (numero < 1000) {
			int centenas = numero / 100;
			int dezenas = (numero % 100) / 10;
			int unidades = (numero % 10) % 10;
			
			if (centenas == 1) {
				System.out.print(centenas+" centena, ");
			} else if (centenas > 1) {
				System.out.print(centenas+" centenas, ");
			}
			
			if (dezenas == 1) {
				System.out.print(dezenas+" dezena e ");
			} else if (dezenas > 1) {
				System.out.print(dezenas+" dezenas e ");
			}
			
			if (unidades == 1) {
				System.out.print(unidades+" unidade ");
			} else if (unidades > 1) {
				System.out.print(unidades+" unidades ");
			}
		
		} else {
			System.out.println("Digite um valor menor que 1000!");
		} */
		
	
		/* System.out.print("Primeira nota ");
		double primeiraNota = scan.nextDouble();
		System.out.print("Segunda nota ");
		double segundaNota = scan.nextDouble();
		System.out.print("Segunda nota ");
		double terceiraNota = scan.nextDouble();
		double media = (primeiraNota+segundaNota+terceiraNota)/3;
		System.out.println("Primeira nota: "+primeiraNota+"\nSegunda nota: "+segundaNota+"\nTerceira nota: "+terceiraNota+"\nMédia: "+media);
		if (media == 10) {
			System.out.println("Aprovado com Distição");
		} else if (media >=7.0) {
			System.out.println("Aprovado");
		} else if (media < 7.0) {
			System.out.println("Reprovado");
		} */
		
		
		/* System.out.println("As notas disponíveis serão de 1, 5, 10, 50, 100 reais. \nQual o valor do saque? ");
		int valorSaque = scan.nextInt();
		if (valorSaque >= 10 || valorSaque <= 600) {
			
			int nota100 = valorSaque / 100;
			valorSaque = valorSaque % 100;
			
			int nota50 = valorSaque / 50;
			valorSaque = valorSaque % 50;
			
			int nota10 = valorSaque / 10;
			valorSaque = valorSaque % 10;
			
			int nota5 = valorSaque / 5;
			valorSaque = valorSaque % 5;
			
			int nota1 = valorSaque / 1;
			valorSaque = valorSaque % 1;
			
			int notas = valorSaque;
			System.out.println(nota100+" notas de 100 reais");
			System.out.println(nota50+" notas de 50 reais");
			System.out.println(nota10+" notas de 10 reais");
			System.out.println(nota5+" notas de 5 reais");
			System.out.println(nota1+" notas de 1 reais");
		} else {
			System.out.println("Valor inválido para saque.");
		} */
		
		/* System.out.print("Digite um número inteiro: ");
		int ninteiro = scan.nextInt();
		if (ninteiro % 2 == 0) {
			System.out.println("O número "+ninteiro+" é Par");
		} else {
			System.out.println("O número "+ninteiro+" é Impar");
		} */
		
		/* System.out.print("Digite um número: ");
		double numero = scan.nextDouble();
		
		if (numero % 1 == 0) {
			System.out.println(numero+" é um número inteiro");
		} else {
			System.out.println(numero+" é um número decimal");
		} */
		
		
		/* System.out.print("Digite um número: ");
		double numero = scan.nextDouble();
		
		if (numero % 2 == 0) {
			System.out.println(numero+" é um número par");
		} else {
			System.out.println(numero+" é um número impar");
		}
		
		if (numero < 0) {
			System.out.println(numero+" é um número negativo");
		} else {
			System.out.println(numero+" é um número positivo");
		}
		
		
		if (numero % 1 == 0) {
			System.out.println(numero+" é um número inteiro");
		} else {
			System.out.println(numero+" é um número decimal");
		} */
		
		
		/* System.out.println("Telefonou para a vítima?");
		String primeiraPergunta = scan.nextLine();
		
		System.out.println("Esteve no local do crime?");
		String segundaPergunta = scan.nextLine();
		
		System.out.println("Mora perto da vítima?");
		String terceiraPergunta = scan.nextLine();
		
		System.out.println("Devia para a vítima?");
		String quartaPergunta = scan.nextLine();
		
		System.out.println("Já trabalhou com a vítima?");
		String quintaPergunta = scan.nextLine();
		
		int respostas = 0;
		
		if (primeiraPergunta.equals("s")) {
			respostas += 1;
		}
		
		if (segundaPergunta.equals("s")) {
			respostas += 1;
		}
		
		if (terceiraPergunta.equals("s")) {
			respostas += 1;
		}
		
		if (quartaPergunta.equals("s")) {
			respostas += 1;
		}
		
		if (quintaPergunta.equals("s")) {
			respostas += 1;
		}
		if (respostas == 2) {
			System.out.println("Suspeita");
		} else if (respostas >= 3 && respostas <= 4) {
			System.out.println("Cúmplice");
		} else if (respostas == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		} */
		
		/* System.out.println("Quantos litros?");
		double litros = scan.nextDouble();
		double A = litros*1.90;
		double G = litros*2.50;
		//Desconto de 4%
		if (litros <= 20) {
			
			double descontoA = A * 0.04;
			double descontoG = G * 0.04;
			
		double valorComDescontoA = A - descontoA;
		double valorComDescontoG = G - descontoG;
		System.out.println("A-álcool: "+valorComDescontoA+"\n"+"G-gasolina "+valorComDescontoG);
		//Desconto de 6%
		} else {
			double descontoA = A * 0.06;
			double descontoG = G * 0.06;
			
		double valorComDescontoA = A - descontoA;
		double valorComDescontoG = G - descontoG;
		System.out.println("A-álcool: "+valorComDescontoA+"\n"+"G-gasolina "+valorComDescontoG);
		} */
		
		/* System.out.print("Pesagem morango: ");
		double pesagemMorango = scan.nextDouble();
		
		System.out.print("Pesagem maças: ");
		double pesagemMaca = scan.nextDouble();
		
		double precoMorango = 0;
		double precoMaca = 0;
		
		if (pesagemMorango <= 5) {
			 precoMorango = 2.50 * pesagemMorango;
			
		} else {
			 precoMorango = 2.20 * pesagemMorango;
		} 
		
		if (pesagemMaca <= 5) {
			 precoMaca = 1.80 * pesagemMaca;
			
		} else {
			 precoMaca = 1.50 * pesagemMaca;
		}
		
		double valorTotal = precoMorango + precoMaca;
		
		System.out.println("Valor total sem desconto de 10%, R$"+valorTotal);
		
		if (pesagemMorango + pesagemMaca > 8 || valorTotal > 25.00) {
			double desconto = valorTotal * 0.10;
			double valorComDesconto = valorTotal - desconto;
			System.out.println("Valor total com desconto de 10%, R$"+valorComDesconto);
		} */
		
		scan.close();
		
	} 
}
