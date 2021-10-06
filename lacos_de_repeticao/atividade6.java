package aula05_10;

import java.util.Scanner;

public class atividade6 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num,soma=0;
		float cont=0,media;
		
		System.out.printf("\t\tENTRE COM UM NUMERO: ");
		System.out.printf("\nDIGITE 0 PARA SAIR!!! ");
		do {
			num=scan.nextInt();
			
			if(num %3==0 && num!=0)
			 {
			 soma=soma+num;
			 cont++;
			 }
		}while(num!=0);
		if(cont==0) {
			System.out.printf("Não posso dividir por 0");
		}
		else {
			media=soma/cont;
		System.out.printf("A media dos numeros multiplo de 3 é de: %3.2f ",media);
		}
	}

}
