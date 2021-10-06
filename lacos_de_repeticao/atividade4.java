package aula05_10;

import java.util.Scanner;

public class atividade4 {

/*
Uma empresa desenvolveu uma pesquisa para saber as características opcaológicas dos indivíduos de uma região. 
Para tanto, a cada uma das pessoas era perguntado: 
-idade, 
-sexo (1-feminino / 2-masculino / 3-Outros), 
-e as opções (1, se a pessoa era calma; 2, se a pessoa era pessoasNervosassa e 3, se a pessoa era
agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
o número de pessoas pessoasCalmas;
o número de mulheres pessoasNervosassas;
o número de homens agressivos;
o número de outros calmos;
o número de pessoas pessoasNervosassas com mais de 40 anos;
o número de pessoas pessoasCalmas com menos de 18 anos.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		//ENTRANDO COM AS VARIAVEIS
		
		int idade=0,genero=0,opcao=0,pessoasCalmas=0,mulherespessoasNervosassas=0,homensAgressivos=0,outrosCalmos=0,pessoasNervosas=0,menorcalmo=0,pessoas=0;
		
		
		System.out.println("Por favor digite sua idade.");
		idade=scan.nextInt(); //ATRIBUINDO VALOR A VARIAVEL IDADE
		
		System.out.println("Por favor escolha seu genero:"
				+ "\n1-Feminino"
				+ "\n2-Masculino"
				+ "\n3-Outros");
		
		genero=scan.nextInt();
		
		while(genero<1 || genero>3) {
			System.out.println("Genero invalido Digite novamente");
			genero=scan.nextInt();
		}
		System.out.println("Selecione a caracteristica que mais se assemelhar a voce:"
				+ "\n1-Voce é uma pessoa calma"
				+ "\n2-Voce é uma pessoa pessoas nervosas"
				+ "\n3-Voce é uma pessoa agressiva");
		
		opcao=scan.nextInt();
		
		while(opcao<1 || opcao>3) {
			System.out.println("Caracteristica invalida digite novamente");
			opcao=scan.nextInt();
		}
		
		
		
		while(pessoas!=150) {
			
			if (opcao==1) {	//numero de pessoas pessoasCalmas
				pessoasCalmas++;
			}
			if(genero==1 && opcao==2) { //numeors de mulheres pessoasNervosassas
				mulherespessoasNervosassas++;
			}
			if(genero==2 && opcao==3) { //Numero de Homens Agressivos
				homensAgressivos++;
			}
			if(genero==3 && opcao==1) { //Numeros de outros Calmos
				outrosCalmos++;
			}
			if(idade>=40 && opcao==2) {
				pessoasNervosas++;//Pessoas pessoas nervosas com mais de 40 anos
			}
			if(idade<=18 && opcao==1) {
				menorcalmo++; //Pessoas pessoasCalmas menor de 18 anos
			}
			System.out.println("Por favor digite sua idade.");
			idade=scan.nextInt();
			System.out.println("Por favor escolha seu genero:"
					+ "\n1-Feminino"
					+ "\n2-Masculino"
					+ "\n3-Outros");
			genero=scan.nextInt();
			while(genero<1 || genero>3) {
				System.out.println("Genero invalido Digite novamente");
				genero=scan.nextInt();
			}
			System.out.println("Selecione a caracteristica que mais se assemelhar a voce:"
					+ "\n1-Voce é uma pessoa calma"
					+ "\n2-Voce é uma pessoa pessoas nervosas"
					+ "\n3-Voce é uma pessoa agressiva");
			opcao=scan.nextInt();
			while(opcao<1 || opcao>3) {
				System.out.println("Caracteristica invalida digite novamente");
				opcao=scan.nextInt();
			}
			pessoas++;
		}
		
		System.out.printf("\nO numero de pessoas pessoasCalmas: %d", pessoasCalmas);
		System.out.printf("\nO numero de Mulheres pessoasNervosassas: %d", mulherespessoasNervosassas);
		System.out.printf("\nO numero de Homens Agressigos: %d", homensAgressivos);
		System.out.printf("\nO numero de pessoas de genero Outros pessoasCalmas: %d", outrosCalmos);
		System.out.printf("\nO numero de pessoas pessoas nervosas com mais de 40 anos: %d", pessoasNervosas);
		System.out.printf("\nO numero de pessoas pessoasCalmas com menos de 18 anos: %d", menorcalmo);
		
	}

}


