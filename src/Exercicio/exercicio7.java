package Exercicio;

import java.util.Scanner;

public class exercicio7 {

	// ini
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c, f;

		System.out.println("Valor de Celsius");
		c = sc.nextInt();

		f = (9 * c + 160) / 5;
		
		System.out.println("A temperatura em Fahrenheit " +f);
	}

}