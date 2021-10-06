package aula05_10;

import java.util.Scanner;

public class atividade5 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num,soma=0;
		System.out.printf("Entre com um numero do teclado: ");
		
		do {
			num=scan.nextInt();
			soma+=num;
		}while(num!=0);
		System.out.printf("A soma dos valores é de: %d",soma);
	}

}
