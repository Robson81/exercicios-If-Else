package exercicioSImples2;

import java.util.Scanner;

public class IfElse07EixosCartesianos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float x, y;
		
		System.out.println("INforme um par de valores (x,y) do tipo x,x ou y,y");
		x=sc.nextFloat();
		y=sc.nextFloat();
		
		if(x==0&&y==0) {
			System.out.println("O Ponto informado passa pela origem do plano.");
		}
		else if(x>0&&y>0) {
			System.out.printf("O Ponto informado (%.2f; %.2f) está no Quadrandte 1", x, y);
		}
		else if(x>0&&y<0) {
			System.out.printf("O Ponto informado (%.2f; %.2f) está no Quadrandte 4", x, y);
		}
		else if(x<0&&y<0) {
			System.out.printf("O Ponto informado (%.2f; %.2f) está no Quadrandte 3", x, y);
		}
		else if(x<0&&y>0) {
			System.out.printf("O Ponto informado (%.2f; %.2f) está no Quadrandte 2", x, y);
		}
		else if((x==0&&y>0)||(x==0&&y<0)) {
			System.out.printf("O Ponto informado (%.2f; %.2f) passa no Eixo das Ordenadas ", x, y);
		}
		else if((x>0&&y==0)||(x<0&&y==0)) {
			System.out.printf("O Ponto informado (%.2f; %.2f) está no Eixo das Abscissas", x, y);
		}	sc.close();
	}

}
