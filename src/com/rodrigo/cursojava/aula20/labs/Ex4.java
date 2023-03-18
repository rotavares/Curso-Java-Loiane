package com.rodrigo.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[][] agendaPessoal = new String[24][31];
		
		for (; ;) {
		
			System.out.println("Agenda Pessoal\n"
					+ "Digite '1' para adicionar um novo compromisso na agenda\n"
					+ "Digite '2 para editar um compromisso na agenda\n"
					+ "Digite '3' para consultar a agenda ");
			
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
				}
				
				dia -= 1;
				
				if (agendaPessoal[dia][hora] != null) {
					
					System.out.println("Esse dia e horário já tem um compromisso agendado\n"
							+ "Deseja editar esse compromisso? y/n");
					
					char yesorno = entrada.next().charAt(0);
					
					if (yesorno == 'y') {
						
						System.out.print("Digite o nome novo do compromisso: ");
						agendaPessoal[dia][hora] = entrada.nextLine();
					}
					else {
						
						System.out.print("Nome do compromisso: ");
						agendaPessoal[dia][hora] = entrada.nextLine();
					
					}
				}
				
				System.out.print("Nome do compromisso: ");
				agendaPessoal[dia][hora] = entrada.next();
				
				System.out.println("Compromisso adicionado!");
				
			break;
			
			case 2:
				System.out.println("Digite o número do dia (1 - 31) e hora (0 - 23) para editar nome do compromisso");
			
				dia = entrada.nextInt();
				hora = entrada.nextInt();
				
				while (dia < 1 && dia > 31 && hora < 0 && hora > 23) {
					
					System.out.println("Não foi possível acessar o dia e hora, digite o dia e hora corretamente");
				}
				
				dia -= 1;
				
				System.out.print("Nome novo do compromisso: ");
				agendaPessoal[dia][hora] = entrada.next();			
			break;
			
			case 3:
				
				for (int i = 0; i < agendaPessoal.length; i++) {
					
					System.out.print(" Dia " + (i+1) + " ");
					
					for (int j = 0; j < agendaPessoal[i].length; j++) {
						
						if (agendaPessoal[i][j] != null) {
							
							System.out.print(agendaPessoal[i][j]);
						}
					}
					
					System.out.println();
				}
			break;
				
			default: System.out.println("Valor inválido!");
			}			
		}
	}
}
