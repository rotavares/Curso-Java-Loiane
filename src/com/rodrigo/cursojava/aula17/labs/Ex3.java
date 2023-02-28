package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String name;
		// valida se tem mais de três caracteres.
		do	{
			System.out.print("Nome:");
			name = input.nextLine();
		} while (name.length() < 3);
		
		int age;
		// valida se não é menor que zero ou maior que cento e cinqueta.
		do {
			System.out.print("Idade: ");
			age = input.nextInt();
		} while(age > 150 || age < 0);
		
		// valida se é maior que zero
		double salary;
		do {
			System.out.print("Salário: ");
			salary = input.nextDouble();
		} while(salary < 0);
		
		System.out.print("Sexo ('F' ou 'M'): ");
		char character = input.next().charAt(0);
		// valida se o usuario está digitando apenas os caracteres solicitado.
		while(character != 'F' && character !='f' && character !='M' && character !='m') {
			switch (character) {
			case 'f', 'F' : break;
			case 'm', 'M' : break;
			default : System.out.println("Sexo inválido, digite novamente.");
			character = input.next().charAt(0);
			}
		}
		
		System.out.print("'S'-Solteiro(a), 'C'-Casado(a), 'V'-Viúvo(a), 'D'-Divorciado(a)\nEstado Civil: ");
		char maritalStatus = input.next().charAt(0);
		// valida se o usuario está digitando apenas os caracteres solicitado.	
		while(maritalStatus != 'S' && maritalStatus !='C' 
				&& maritalStatus!='V' && maritalStatus!='D') {
			switch(maritalStatus) {
			case 's', 'S' : break;
			case 'c', 'C' : break;
			case 'v', 'V' : break;
			case 'd', 'D' : break;
			default : System.out.println("Estado Civil inválido, digite novamente.");
			maritalStatus = input.next().charAt(0);
			}
		}
		input.close();
	}
}
