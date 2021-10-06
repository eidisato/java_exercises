package aula01_10;

import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia,mes,ano;
		int dias_ano=365;
		int dias_mes=30;
		int resolucao;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("\nInforme quantos anos voce tem. Em anos, meses e dias: ");
		System.out.println("\nAnos: ");
		ano = scan.nextInt();
		System.out.println("\nMeses: ");
		mes = scan.nextInt();
		System.out.println("\nDias: ");
		dia= scan.nextInt();
		
		resolucao=((ano*365)+(mes*30)+dia);
		
		System.out.printf("\n\t\tA sua idade em dias é de: %d", resolucao);
		}
	
}


