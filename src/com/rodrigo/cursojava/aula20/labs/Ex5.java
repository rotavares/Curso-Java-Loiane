package com.rodrigo.cursojava.aula20.labs;

import java.util.Iterator;
import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[][][] agendaPessoal = new String[12][31][8];
		
		for (; ;) {
			
			System.out.println("Agenda Pessoal\n"
					+ "Digite '1' para adicionar um novo compromisso na agenda\n"
					+ "Digite '2 para editar um compromisso na agenda\n"
					+ "Digite '3' para consultar compromissos agendados ");
			
			int escolha = entrada.nextInt();
			
			switch (escolha) {
			case 1: 
				System.out.println("Digite o número do mês (1 - 12), dia (1 - 31) e hora (1 - 8) para adicionar o compromisso");
			
				System.out.print("Mês: ");
				int mes = entrada.nextInt();
				
				System.out.print("Dia: ");
				int dia = entrada.nextInt();
				
				System.out.print("Hora: ");
				int hora = entrada.nextInt();
				
				
				
				while (mes < 1 && mes > 12 &&dia < 1 && dia > 31 && hora < 7 && hora > 17) {
					
					System.out.println("Não foi possível acessar a data informada, digite o ano, dia e hora corretamente");
					
					System.out.print("Mês: ");
					mes = entrada.nextInt();
					
					System.out.print("Dia: ");
					dia = entrada.nextInt();
					
					System.out.print("Hora: ");
					hora = entrada.nextInt();
				}
				
				dia -= 1;
				mes -= 1;
				hora -= 1;
				
				if (agendaPessoal[mes][dia][hora] != null) {
					
					System.out.println("Esse dia e horário já tem um compromisso agendado\n"
							+ "Deseja editar esse compromisso? y/n");
					
					char yesorno = entrada.next().charAt(0);
					
					if (yesorno == 'y') {
						
						System.out.print("Digite o nome novo do compromisso: ");
						agendaPessoal[mes][dia][hora] = entrada.next();
					}
					else if (yesorno == 'n') {
						
						System.out.print("Nome do compromisso: ");
						agendaPessoal[mes][dia][hora] = entrada.next();
					
					}
				}
				
				while (agendaPessoal[mes][dia][hora] == null) {
					
					System.out.print("Nome do compromisso: ");
					agendaPessoal[mes][dia][hora] = entrada.next();
				}
				
				System.out.println("Compromisso adicionado!");

				System.out.println();
			break;
			
			case 2:
				System.out.println("Digite o número do mês (1 - 12), dia (1 - 31) e hora (1 - 8) para editar o compromisso");
		
				System.out.print("Mês: ");
				mes = entrada.nextInt();
				
				System.out.print("Dia: ");
				dia = entrada.nextInt();
				
				System.out.print("Hora: ");
				hora = entrada.nextInt();
				
				while (mes < 1 && mes > 12 &&dia < 1 && dia > 31 && hora < 7 && hora > 17) {
					
					System.out.println("Não foi possível acessar o dia e hora, digite o dia e hora corretamente");
				}
				
				
				dia -= 1;
				mes -= 1;
				hora -= 1;
				
				System.out.print("Nome novo do compromisso: ");
				agendaPessoal[mes][dia][hora] = entrada.next();
				
				System.out.println("Compromisso alterado com sucesso!");
				
				System.out.println();
			break;
			
			case 3:
				
				for (int i = 0; i < agendaPessoal.length; i++) {
					
					for (int j = 0; j < agendaPessoal[i].length; j++) {
						
						for (int k = 0; k < agendaPessoal[i][j].length; k++) {
							
							if (agendaPessoal[i][j][k] != null) {
								
								System.out.print("No mês " + (i+1) + ", Dia " + (j+1) + " às " + k + "h" + agendaPessoal[i][j][k]);
								
								if (j != agendaPessoal[i][j].length) {
									
									System.out.println();
								}
							}
						}
					}
				}
				System.out.println();
			break;
				
			default: System.out.println("Valor inválido!");
			}			
		}
	}
}
