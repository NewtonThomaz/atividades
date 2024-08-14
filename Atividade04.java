package exemplos2407;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String [] alfabeto = {"a","b", "c", "d", "e", "f","g", "h", "i", "j", "k", "l", "m" , "n" , "o", "p" , "q", "r", "s" , "t", "u", "v", "w", "x", "y", "z"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(alfabeto));
		ArrayList<Integer> dicas = new ArrayList<Integer>();
		ArrayList<String> palavraCrip = new ArrayList<String>();
		ArrayList<String> palavraTeste = new ArrayList<String>();
		String palavra;		
		int dica = 0;

		System.out.println("O que deseja cifrar(utilize letras minusculas)?");
		System.out.println("Digite 0 quando terminar0");
		do{
			System.out.print("");
			palavra = ler.nextLine();			
			palavraTeste.add(palavra);						
		}while (palavra.equals("0")== false );
		System.out.println("Qual é a dica da Cifra(numeros)?");
		dica = ler.nextInt();

		for(int i=0; i<26; i++) {
			for (String p: palavraTeste)
			if (p.equals(novaLista.get(i))) {
				dicas.add(i+dica);
			}
		}
		for (int d : dicas) {
			palavraCrip.add(alfabeto[d]);		
		}
		System.out.print("sua fraze cifrad ficou: ");
		for (String p : palavraCrip) {
			System.out.print(p);
		}
		ler.close();
	}
}