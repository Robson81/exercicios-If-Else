package exercicios_simples3;

import java.util.Scanner;

public class While02PlanoCartesiano {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x=1, y=2; 
		
		while(x!=0&&y!=0) {
			System.out.println("Informe os parametros x, y do ponto");
			x=sc.nextInt();
			y=sc.nextInt();
			
			
			 if(x>0&&y>0) {
				System.out.printf("O Ponto informado (%d , %d) está no Quadrandte 1\n", x, y);
			}
			else if(x>0&&y<0) {
				System.out.printf("O Ponto informado (%d , %d) está no Quadrandte 4\n", x, y);
			}
			else if(x<0&&y<0) {
				System.out.printf("O Ponto informado (%d , %d) está no Quadrandte 3\n", x, y);
			}
			else if(x<0&&y>0) {
				System.out.printf("O Ponto informado (%d , %d) está no Quadrandte 2\n", x, y);
			}
			else {
				
			}
					}
		
		sc.close();
	}

}
