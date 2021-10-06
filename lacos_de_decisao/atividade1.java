package aula04_10;
import java.util.*;
public class atividade1 {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n1,n2,n3, maior;
			//decisão
			System.out.println("Digite 3 valores: ");
			n1=scan.nextInt();
			n2=scan.nextInt();
			n3=scan.nextInt();
			
			if(n1>n2) {
				if(n1>n3) 
					maior=n1;
					else 
						maior=n3;
			}
				
			else {
				if(n2>n3)
					maior=n2;
					else
						maior=n3;
				}
			
		System.out.printf("O maior valor digitado é de: %d",maior );
	}
}
			
