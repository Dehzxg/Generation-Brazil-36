package Exs;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade,ano,meses,dias,calculoano,calculomeses;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com sua idade em anos: ");
		
		ano = ler.nextInt();
		
		System.out.println("\nEntre com sua idade em meses");
		
		meses = ler.nextInt();
		
		System.out.println("\nEntre com sua idade em dias: ");
		
		dias = ler.nextInt();
		
		calculoano = ano*365;
		calculomeses = meses*30;
		idade = calculoano+calculomeses+dias;
		System.out.println("\nVocê já viveu por: "+idade+" dias");
				
		
		
	}

}
