package exercicioSImples2;

import java.util.Scanner;

public class IfElse06Intervalo {

	public static void main(String[] args) {

		double num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um intervalo qualquer: ");
		num = sc.nextDouble();
		
		if(num>0&&num<=25) {
			System.out.printf("O valor informado (%.2f) está no intervalo entre 0 e 25", num);
		}
		else if(num>25&&num<=50) {
			System.out.printf("O valor informado (%.2f) está no intervalo entre 25 e 50", num);
		}
		else if(num>50&&num<=75) {
			System.out.printf("O valor informado (%.2f) está no intervalo entre 50 e 75", num);
		}
		else if(num>75&&num<=100) {
			System.out.printf("O valor informado (%.2f) está no intervalo entre 75 e 100", num);
		}
		else {
			System.out.printf("O valor informado (%.2f) está fora do intervalo", num);
		}
		
		
		sc.close();
	}

}
