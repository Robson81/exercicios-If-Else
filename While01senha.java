package exercicios_simples3;

import java.util.Scanner;

public class While01senha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int senha = 1;
		
		while (senha!=2002) {
			senha= sc.nextInt();
			if(senha!=2002) {
				System.out.println("Senha Invalida");
				System.out.println("Tente novamente:");
			}else
				System.out.println("Acesso permitido");
		}
		
		
		sc.close();
	}

}
