package exercicioSImples2;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		int x;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um valor para verificar se este é positivo ou  negativo:");
		x=sc.nextInt();
		
		if(x>0) {
			
			System.out.println("O valor informado " + "(" +x+ ")"+ " é Positivo" );
			
		}else if(x==0) {
			System.out.println("O valor informado " + "(" +x+ ")"+ " não é negativo nem positivo" );
		}else {
			System.out.println("O valor informado " + "(" +x+ ")"+ " é negativo" );
		}
		
		sc.close();
	}

}
