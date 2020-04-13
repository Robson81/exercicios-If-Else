package exercicios_simples4;

import java.util.Scanner;

public class For03MediaPonderada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		float a, b, c;
		
		float media=0;
		for(int i=0;i<n;i++) {
			
			a=sc.nextFloat();
			b=sc.nextFloat();
			c=sc.nextFloat();
			
			media = (2*a + 3*b + 5*c)/10;
			
			System.out.println(media);
		}
		
		
		sc.close();
	}

}
