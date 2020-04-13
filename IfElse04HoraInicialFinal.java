package exercicioSImples2;

import java.util.Scanner;

public class IfElse04HoraInicialFinal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hora1, hora2, var, duracao;

		System.out.print("Ionforme a hora de início e fim do jogo (formato 24 horas, sem minutos:)");
		System.out.print("\nInicio:");
		hora1 = sc.nextInt();
		System.out.print("\nFim:");
		hora2 = sc.nextInt();

		if (hora1 >= hora2) {

			var = 24 - hora1;

			duracao = (var + hora2);

			System.out.println("A Duração do jogo foi de " + duracao + " horas");
		} else {
			
			var =0;

			duracao = (hora2 - hora1);

			System.out.println("A Duração do jogo foi de " + duracao + " horas");
		}

		sc.close();
	}

}
