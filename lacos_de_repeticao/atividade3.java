package aula05_10;

import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {
		int idade, total21=0,total50=0;
		Scanner scan= new Scanner(System.in);
		
		System.out.printf("Entre com as idades dos participantes.");
		idade=scan.nextInt();
		
		while(idade!=-99) {
			
			if(idade<=21) {
				total21++;
			}
			else if(idade>=50) {
				total50++;
			}
			System.out.printf("Entre com as idades dos participantes. Para sair, digite -99 ...");
			idade=scan.nextInt();
		}
		System.out.printf("\n\n\n\n\n");
		System.out.printf("O total de pessoas de at� 21 anos � de: %d pessoas. \n",total21);
		System.out.printf("O total de pessoas com mais de 50 anos � de: %d pessoas.",total21);
	}
}
