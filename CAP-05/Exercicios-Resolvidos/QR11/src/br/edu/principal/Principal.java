package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i, num, qtde;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		qtde = 0;
		
		for(i = 1; i <= num; i++)
		{
			if(num % i == 0) {
				qtde = qtde + 1;
		}
		
		}
		if(qtde > 2) {
			System.out.println("Número não primo");
		}else {
			System.out.println("Número primo");
		}
				

	}

}