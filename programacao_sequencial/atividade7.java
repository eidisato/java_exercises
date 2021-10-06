package aula01_10;

import java.util.Scanner;

public class atividade7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Entre com o valor de A: ");
		a=scan.nextDouble();
		System.out.println("Entre com o valor de B: ");
		b=scan.nextDouble();
		System.out.println("Entre com o valor de C: ");
		c=scan.nextDouble();
		System.out.println("Entre com o valor de D: ");
		d=scan.nextDouble();
		System.out.println("Entre com o valor de E: ");
		e=scan.nextDouble();
		System.out.println("Entre com o valor de F: ");
		f=scan.nextDouble();
		
		x=(((c*e)-(b*f))/((a*e) - (b*d)));
		y=(((a*f)-(c*d))/((a*e) - (b*d)));
		cls();
		
		System.out.printf("O valor de X é de: %.2f e o valor de Y é de: %.2f",x,y);
		
		
	}

	private static void cls() {
		// TODO Auto-generated method stub
		
	}
}
