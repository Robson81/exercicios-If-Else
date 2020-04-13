package exercicioSImples2;

import java.util.Scanner;

public class IfElse03Multiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Informe dois valores distintos para sebaer se são multiplos: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		double w,z;
		
		w=x;
		z=y;
		
		if (x>y){
		
			if(x%y==0) {
			
			System.out.printf("Os valores digitados (%d e %d) são multiplos\n", x, y);
		}else {
			
			System.out.printf("Os valores digitados (%d e %d) não são multiplos\n", x, y);
		}
		
		System.out.println("Sua divisão é: "+w/z);
		
		}else {
			if(y%x==0) {
				
				System.out.printf("Os valores digitados (%d e %d) são multiplos\n", x, y);
			}else {
				
				System.out.printf("Os valores digitados (%d e %d) não são multiplos\n", x, y);
			}
			System.out.println("Sua divisão é: " +z/w);
		}
		
		
		
		sc.close();
}
}
