package aula01_10;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int hora,minuto,segundo,segundos;
		
		System.out.println("Digite a duração do evento em segundos: ");
		segundos=scan.nextInt();
		
		hora=(segundos/3600);
		minuto=((segundos%3600)/60);
		segundo=((segundos%3600)%60);
	
		System.out.printf("O evento durou %d horas, %d minutos, e %d segundos",hora,minuto,segundo);
		
	}

}

