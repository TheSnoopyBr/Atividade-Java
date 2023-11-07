package Exercicio;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.println("Valor de A");
		a = sc.nextInt();
		System.out.println("Valor de B");
		b = sc.nextInt();

		c = a;
		a = b;
		b = c;

		System.out.println("O valor de A é " + a);
		System.out.println("O valor de B é " + b);

	}
}