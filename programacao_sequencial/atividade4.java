package aula01_10;

import java.util.Scanner;

public class atividade4 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double a,b,c,d,s,r;
		System.out.println("Entre com os valores de A, B e C, respectivamente: ");
		a=scan.nextFloat();
		b=scan.nextFloat();
		c=scan.nextFloat();
		
		r=Math.pow((a+b),2);
		s=Math.pow((b+c),2);
		d=(r+s)/2;
		
		System.out.printf("O valor calculado é: %.2f", d);
		
		
	}

}