package exercicios_simples4;

import java.util.Scanner;

public class For05Fatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int aux = 1;

		for (int i = n; i > 1; i--) {

			aux *= i;

		}

		System.out.println(aux);

		sc.close();

	}

}
