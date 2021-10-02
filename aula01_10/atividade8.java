package aula01_10;

import java.util.Scanner;

public class atividade8 {
	public static void main(String[] args) {
		float porcdistribuidor=28;
		float porcimposto=45;
		float custofab, valordistribuidor, valorimposto, custocons;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("INFORME O VALOR DE CUSTO DE FABRICA: ");
		custofab=scan.nextFloat();
//calculos
		valordistribuidor=(custofab+(custofab*porcdistribuidor/100));
		valorimposto=(custofab+(custofab*porcimposto/100));
		
		custocons=(custofab+valordistribuidor+valorimposto);
		
		System.out.printf("O custo de fábrica é de: %.2f e o custo do consumidor é de: %.2f",custofab,custocons);
		
		
		
	}
}
