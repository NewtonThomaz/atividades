package exemplos2407;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		int n;
		
		System.out.println("Digite 0 para finalizar");
		do {
			System.out.println("Qual número você deseja adicionar a lista: ");
			n = ler.nextInt();
			numeros.add(n);			
		}while(n != 0);
		
		System.out.println("Dos números digitados, os seguintes são positivos: ");
		for (int y : numeros) {
			if(y>0) {
				System.out.print(y+", ");
			}
		}
		ler.close();
	}
}