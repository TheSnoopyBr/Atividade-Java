package Exercicio;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int salario, vendas, salariof;
		String nome;

		System.out.println("Digite seu nome");
		nome = sc.next();

		System.out.println("Salario");
		salario = sc.nextInt();

		System.out.println("vendas");
		vendas = sc.nextInt();
		salariof = (int) (salario + (vendas * 0.15));

		System.out.println("O salario final de " + nome + " e igual " + salariof);
	}

}


