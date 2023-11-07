package Exercicio1;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		String nome;
		
		System.out.println("Digite seu nome");
		nome = sc.next();

		System.out.println("quantidade de vezes");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(nome);

		}
	}
}