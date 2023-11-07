package Exercicio;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, notafinal;
		String nome;
		System.out.println("Nome do aluno");
		nome = sc.next();
		System.out.println("Nota 1");
		n1 = sc.nextInt();
		System.out.println("Nota 2");
		n2 = sc.nextInt();
		System.out.println("Nota 3");
		n3 = sc.nextInt();

		notafinal = (int) (n1 + n2 + n3) / 3;
		System.out.println("O Aluno " + nome + "a media é " + notafinal);
	}
}