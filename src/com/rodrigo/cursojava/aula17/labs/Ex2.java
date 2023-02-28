package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o nome de usuário: ");
		String userName = input.nextLine();
		
		System.out.print("Senha: ");
		String password = input.next();
		
		while(userName.equals(password)) {
			System.out.println("A senha não pode ser igual ao nome do usuário, digite a senha novamente");
			System.out.print("Senha: ");
			password = input.next();
		}
		input.close();
	System.out.println("Login bem sucedido!\nBem vindo "+userName+" :)");
	}
}
