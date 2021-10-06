package aula01_10;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		double x1,y1,x2,y2,a,b,c;
		System.out.println("Entre com a primeira coordenada: ");
		System.out.println("X1: ");
		x1=scan.nextFloat();
		System.out.println("Y1: ");
		y1=scan.nextFloat();
		
		System.out.println("Entre com a segunda coordenadaa: ");
		System.out.println("X2: ");
		x2=scan.nextFloat();
		System.out.println("Y2: ");
		y2=scan.nextFloat();
		
		a=(x2-x1);
		b=(y2-y1);
		
		c=(Math.sqrt((Math.pow(a,2))+(Math.pow(b,2))));
		
		
		System.out.printf("A distante entre as duas coordenadas é de: %.2f",c);
		
		
		
		
		
	}

}
