package exercicioSImples2;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		int x;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um valor para verificar se este � positivo ou  negativo:");
		x=sc.nextInt();
		
		if(x>0) {
			
			System.out.println("O valor informado " + "(" +x+ ")"+ " � Positivo" );
			
		}else if(x==0) {
			System.out.println("O valor informado " + "(" +x+ ")"+ " n�o � negativo nem positivo" );
		}else {
			System.out.println("O valor informado " + "(" +x+ ")"+ " � negativo" );
		}
		
		sc.close();
	}

}
