package Atividades;

import java.util.Scanner;

public class atividadeNumeroII {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int termo1 = 0;
		int termo2 = 1;
		int termo3 = 0;
		int valorArmazenado;
		
		
		System.out.println("---------------------------------");
		System.out.println("Consulta da Sequência de Fibonacc");
		System.out.println("---------------------------------");
		
		System.out.println("DIGITE UM VALOR: ");
		valorArmazenado = sc.nextInt();
		
		while(valorArmazenado > 3) {
			termo3 = termo1 + termo2;
			termo1 = termo2;
			termo2 = termo3;
			System.out.println("print ('O número faz parte da sequência de Fibonacci.'"); 
			valorArmazenado = sc.nextInt();
		}
		
		if(valorArmazenado == 0 && valorArmazenado == 1) {
			System.out.println("O número faz parte da sequência de Fibonacci.");
		}else if(valorArmazenado == termo3) {
			System.out.println("O número faz parte da sequência de Fibonacci.");

		} else {
			System.out.println("O número digitado não faz parte da sequência de Fibonacci.");
		}
		
		sc.close();
		
	}

}
