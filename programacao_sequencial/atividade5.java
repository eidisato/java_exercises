package aula01_10;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		float n1,n2,n3,media,a,b,c,d;
		
		System.out.println("Entre com a primeira nota do aluno: ");
		n1=scan.nextFloat();
		System.out.println("Entre com a segunda nota do aluno: ");
		n2=scan.nextFloat();
		System.out.println("Entre com a terceira nota do aluno: ");
		n3=scan.nextFloat();
		
		a=(n1*2);
		b=(n2*3);
		c=(n3*5);
		d=(2+3+5);
		media=((a+b+c)/d);
		System.out.printf("A média ponderada do aluno é de: %.2f",media);
		
	}

}