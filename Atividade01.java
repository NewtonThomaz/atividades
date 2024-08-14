package exemplos2407;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int soma = 0, n;
		
		System.out.println("Digite 0 para finalizar");
		do {
			System.out.println("Qual número você deseja adicionar a lista: ");
			n = ler.nextInt();
			numeros.add(n);			
		}while(n != 0);
		
		for(int z : numeros) {
			soma += z;
		}
		System.out.println("A soma dos intens da lista é "+soma);
		ler.close();
	}
}