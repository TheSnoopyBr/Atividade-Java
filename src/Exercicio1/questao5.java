package Exercicio1;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		System.out.println("Digite os numeros");

		for (int i = 1; i <= 10; i++) {

			int a = sc.nextInt();

			soma += a;

		}
		System.out.println(soma);
	}
}