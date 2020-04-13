package exercicios_simples3;

import java.util.Scanner;

public class While03Combustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int code = 0, alc = 0, gas = 0, diesel = 0;

		System.out.println("Informe o combustivel utilizado, conforme tabela a baixo:");
		System.out.println("Alcool = 1\nGasolina = 2\nDiesel = 3\nFinalizar = 4.");

		while (code != 4) {
			System.out.print("Código: ");
			code = sc.nextInt();
			if (code == 1) {
				alc++;

			} else if (code == 2) {
				gas++;
			} else if (code == 3) {
				diesel++;
			} else if (code == 4) {
				System.out.println("Obrigado!!");
			} else {
				System.out.println("Código digitado inválido. Digite um código válido ou 4 para finalizar.");
			}
		}
		
		
		System.out.println("Alcool: "+alc);
		System.out.println("Gasolina: "+gas);
		System.out.println("Diesel: "+diesel);

		sc.close();
	}

}
