package exercicios_simples4;

import java.util.Scanner;

public class For04Divisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		float a, b, c;
		
		
		
		for(int i=0;i<n;i++) {
			
			a=sc.nextFloat();
			b=sc.nextFloat();
			if(b!=0) {
				
				c=a/b;
				System.out.println(c);
				
			}else {
				
				System.out.println("Divisão Impossível");
			}
			
		}
		
		
		sc.close();
	}

}
