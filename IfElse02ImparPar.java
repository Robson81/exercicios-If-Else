package exercicioSImples2;

import java.util.Scanner;

public class IfElse02ImparPar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um valor para verifica se ele é impar ou par: ");
		x= sc.nextInt();
		
		if(x%2==0) {
			System.out.println("O Valor digitado é Par");
		}else {
			System.out.println("O Valor digitado é Impar");
		}
		
		sc.close();

	}

}
