package com.rodrigo.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[][] agendaPessoal = new String[31][24];
		
		for (; ;) {
		
			System.out.println("Agenda Pessoal\n"
					+ "Digite '1' para adicionar um novo compromisso na agenda\n"
					+ "Digite '2 para editar um compromisso na agenda\n"
					+ "Digite '3' para consultar compromissos agendados ");
			
			int escolha = entrada.nextInt();
			
			switch (escolha) {
			case 1: 
				System.out.println("Digite o número do dia (1 - 31) e hora (0 - 23) para adicionar o compromisso");
			
				System.out.print("Dia: ");
				int dia = entrada.nextInt();
				
				System.out.print("Hora: ");
				int hora = entrada.nextInt();
				
				while (dia < 1 && dia > 31 && hora < 0 && hora > 23) {
					
					System.out.println("Não foi possível acessar o dia e hora, digite o dia e hora corretamente");
					
					System.out.print("Dia: ");
					dia = entrada.nextInt();
					
					System.out.print("Hora: ");
					hora = entrada.nextInt();
				}
				
				dia -= 1;
				
				if (agendaPessoal[dia][hora] != null) {
					
					System.out.println("Esse dia e horário já tem um compromisso agendado\n"
							+ "Deseja editar esse compromisso? y/n");
					
					char yesorno = entrada.next().charAt(0);
					
					if (yesorno == 'y') {
						
						System.out.print("Digite o nome novo do compromisso: ");
						agendaPessoal[dia][hora] = entrada.next();
					}
					else if (yesorno == 'n') {
						
						System.out.print("Nome do compromisso: ");
						agendaPessoal[dia][hora] = entrada.next();
					
					}
				}
				
				while (agendaPessoal[dia][hora] == null) {
					
					System.out.print("Nome do compromisso: ");
					agendaPessoal[dia][hora] = entrada.next();
				}
				
				System.out.println("Compromisso adicionado!");

				System.out.println();
			break;
			
			case 2:
				System.out.println("Digite o número do dia (1 - 31) e hora (0 - 23) para editar nome do compromisso");
		
				System.out.print("Dia: ");
				dia = entrada.nextInt();
				
				System.out.print("Hora: ");
				hora = entrada.nextInt();
				
				while (dia < 1 && dia > 31 && hora < 0 && hora > 23) {
					
					System.out.println("Não foi possível acessar o dia e hora, digite o dia e hora corretamente");
				}
				
				
				dia -= 1;
				
				System.out.print("Nome novo do compromisso: ");
				agendaPessoal[dia][hora] = entrada.next();
				
				System.out.println("Compromisso alterado com sucesso!");
				
				System.out.println();
			break;
			
			case 3:
				
				for (int i = 0; i < agendaPessoal.length; i++) {
					
					for (int j = 0; j < agendaPessoal[i].length; j++) {
						
						if (agendaPessoal[i][j] != null) {
							
							System.out.print("Dia " + (i+1) + " às " + j + "h " + agendaPessoal[i][j]);
							
							if (j != agendaPessoal[i].length) {
								
								System.out.println();
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
