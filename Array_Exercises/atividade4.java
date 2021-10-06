package aula06_10;

import java.util.Scanner;

/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/

public class atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		float matriz1[][]=new float[2][2];
		float matriz2[][]=new float[2][2];
		float matriz3[][]=new float[2][2];
		int op, x, y, num;
		
		for(x=0;x<2;x++) {
			for(y=0;y<2;y++) {
				System.out.printf("Informe o valor da matriz 1: ");
				matriz1[x][y]=scan.nextFloat();
			}
		}
		for(x=0;x<2;x++) {
			for(y=0;y<2;y++) {
				System.out.printf("Informe o valor da matriz 2: ");
				matriz2[x][y]=scan.nextFloat();
			}
		}
		System.out.printf("\n\t\tENTRE COM UMA OPÇÃO: ");
		System.out.printf("\n1- SOMAR AS DUAS MATRIZES ");
		System.out.printf("\n2- SUBTRAIR A PRIMEIRA MATRIZ DA SEGUNDA ");
		System.out.printf("\n3- ADICIONAR UMA CONSTANTE NAS DUAS MATRIZES ");
		System.out.printf("\n4- IMPRIMIR AS DUAS MATRIZES");
		System.out.printf("\n\n\t\tDIGITE SUA OPÇÃO: ");
		op=scan.nextInt();
		
		while(op<1 || op>4) {
			System.out.printf("\n\t\tENTRE COM UMA OPÇÃO: ");
			System.out.printf("\n1- SOMAR AS DUAS MATRIZES ");
			System.out.printf("\n2- SUBTRAIR A PRIMEIRA MATRIZ DA SEGUNDA ");
			System.out.printf("\n3- ADICIONAR UMA CONSTANTE NAS DUAS MATRIZES ");
			System.out.printf("\n4- IMPRIMIR AS DUAS MATRIZES");
			System.out.printf("\n\n\t\tDIGITE SUA OPÇÃO NOVAMENTE: ");
			op=scan.nextInt();
		}	
		do {
			switch(op)
			{
			case 1:
				for(x=0;x<2;x++) {
					for(y=0;y<2;y++) {
						matriz3[x][y]= matriz1[x][y] + matriz2[x][y];
						System.out.printf("\n\t(OPÇÃO 1) SOMATORIA = %f ", matriz3[x][y]);
						}
						}
			break;
			case 2:
				for(x=0;x<2;x++) {
					for(y=0;y<2;y++) {
					matriz3[x][y]= matriz2[x][y] - matriz1[x][y];
					System.out.printf("\n\t(OPÇÃO 2) SUBATRAÇÃO = %f ", matriz3[x][y]);
					}
					}
			break;
			case 3:
				System.out.printf("Entre com um numero para substituir: ");
				num=scan.nextInt();
				for(x=0;x<2;x++) {
					for(y=0;y<2;y++) {
						matriz1[x][y]+=num;
						System.out.printf("\n\t(OPÇÃO 3) MATRIZ 1: %f ", matriz1[x][y]);
						}
						}
				System.out.printf("\n");
				for(x=0;x<2;x++) {
					for(y=0;y<2;y++) {
						matriz2[x][y]+=num;
						System.out.printf("\n\t(OPÇÃO 3) MATRIZ 2: %f ", matriz2[x][y]);
					}
				}
			break;
			case 4:
				for(x=0;x<2;x++) {
					for(y=0;y<2;y++) {
						System.out.printf("\n\t(OPÇÃO 4) MATRIZ 1: %f ", matriz1[x][y]);
						}
						}
				System.out.printf("\n");
				for(x=0;x<2;x++) {
					for(y=0;y<2;y++) {
						System.out.printf("\n\t(OPÇÃO 4) MATRIZ 2: %f ", matriz2[x][y]);
					}
					}
			break;
			default: System.out.printf("\n\tOPÇÃO INVALIDA");
			}
			System.out.printf("\n\n\n\t\tENTRE COM UMA OPÇÃO: ");
			System.out.printf("\n1- SOMAR AS DUAS MATRIZES ");
			System.out.printf("\n2- SUBTRAIR A PRIMEIRA MATRIZ DA SEGUNDA ");
			System.out.printf("\n3- ADICIONAR UMA CONSTANTE NAS DUAS MATRIZES ");
			System.out.printf("\n4- IMPRIMIR AS DUAS MATRIZES");
			System.out.printf("\n0- SAIR DO PROGRAMA... ");
			System.out.printf("\n\t\tDIGITE SUA OPÇÃO: ");
			op=scan.nextInt();
			
		}while(op!=0);
		
	}

}
