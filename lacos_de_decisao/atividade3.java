package aula04_10;
import java.util.*;
public class atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner scan=new Scanner(System.in);
		//CATEGORIA
		System.out.println("Informe a idade do competidor: ");
		idade=scan.nextInt();
		
		if(idade<10) {
			System.out.println("Competidor sem categoria, possui menos de 10 anos... ");
		}
		
		if(idade>=10 && idade<=14) {
			System.out.println("CATEGORIA INFANTIL... ");
		}
		if(idade>=15 && idade<=17) {
			System.out.println("CATEGORIA JUVENIL... ");
		}
		if(idade>=18 && idade<=25) {
			System.out.println("CATEGORIA ADULTO... ");
		}
		if(idade>25) {
			System.out.println("Competidor sem categoria, possui mais de 25... ");
		}
	}

}
