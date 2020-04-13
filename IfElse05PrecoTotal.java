package exercicioSImples2;

import java.util.Scanner;

public class IfElse05PrecoTotal {

	public static void main(String[] args) {

		double preco1=4.00, preco2=4.50, preco3=5.00, preco4=2.00, preco5=1.50;
		
		int cod1=1, cod2=2, cod3=3, cod4=4, cod5=5;
		
		int qtd, cod;
		
		String a="Cachorro Quente", b="X-lasada", c="X-Bacon", d="Torrada Simples", e="Refrigerante";
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o Código e a quantidade dos produtos que deseja (ver tabela abaixo): ");
		System.out.printf(" %d - %s - %.2f\n %d - %s - %.2f\n %d - %s - %.2f\n %d - %s - %.2f\n %d - %s - %.2f\n\n", cod1, a, preco1,cod2, b,preco2,cod3, c,preco3,cod4, d,preco4,cod5, e,preco5);
		
		System.out.print("Código: ");
		cod = sc.nextInt();
		System.out.print("Quatidade: ");
		qtd = sc.nextInt();
		
		
		if(cod==1) {
			
		
		//System.out.print("O Seu pedido é: ");
		System.out.printf("O Seu pedido é: %s - Quatidade: %d - Valor Total: %.2f ", a, qtd, qtd*preco1 );
		}
		else if(cod==2) {
			
			
			//System.out.print("O Seu pedido é: ");
			System.out.printf("O Seu pedido é: %s - Quatidade: %d - Valor Total: %.2f ", b, qtd, qtd*preco2 );
		}
		else if(cod==3) {
			
			
			//System.out.print("O Seu pedido é: ");
			System.out.printf("O Seu pedido é: %s - Quatidade: %d - Valor Total: %.2f ", c, qtd, qtd*preco3 );
		}
		else if(cod==4) {
			
			
			//System.out.print("O Seu pedido é: ");
			System.out.printf("O Seu pedido é: %s - Quatidade: %d - Valor Total: %.2f ", d, qtd, qtd*preco4 );
		}
		else {
			
			
			//System.out.print("O Seu pedido é: ");
			System.out.printf("O Seu pedido é: %s - Quatidade: %d - Valor Total: %.2f ", e, qtd, qtd*preco5 );
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
