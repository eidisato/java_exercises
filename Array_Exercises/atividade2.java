package aula06_10;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;
//UTILIZA��O DA LISTAGEM DA VARIAVEL
public class atividade2 {
	//Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	//� Os n�meros pares digitados;  
	//� A soma dos n�meros pares digitados; 
	//� Os n�meros �mpares digitados; 
	//� A quantidade de n�meros �mpares digitados.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		List<Integer> numerosImpares = new ArrayList<>(); //LISTA DE VETORES IMPARES
		List<Integer> numerosPares = new ArrayList<>(); //LISTA DE VETORES PARES

	       int numero, somaPar = 0;//DECLARA��O DE VARIAVEIS
	       
	    //LA�O PARA INCREMENTAR VALORES PARA O VETOR   
	    System.out.println("Digite 6 numero para analise");
	       for (int i = 0; i < 6; i++) {
	    System.out.printf("Digite: ");
	           numero = scan.nextInt();  

	           
	           //TESTE PARA SE O NUMERO DIGITADO � PAR
	           if (numero % 2 == 0){
	        	   //ADICIONANDO O NUMERO PAR � VARIAVEL PAR, E LISTANDO
	               numerosPares.add(numero);
	               //SOMA DOS NUMEROS PARES
	               somaPar += numero;

	           }else{//TESTE PARA SE O NUMERO DIGITADO � IMPAR
	        	 //ADICIONANDO O NUMERO IMPAR � VARIAVEL IMPAR, E LISTANDO
	               numerosImpares.add(numero);

	           }

	       }
//SAIDA DAS VARIAVEIS E VETORES
	       System.out.println("N�meros pares digitados: " + numerosPares);

	       System.out.println("Soma dos n�meros pares: " + somaPar);

	       System.out.println("N�meros �mpares digitados: " + numerosImpares);

	       System.out.println("Quantidade de �mpares digitados: " + numerosImpares.size());        

}
}

