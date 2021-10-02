package Exs;

import java.util.Scanner;

public class Exercicio3 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hr,min,seg;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEscreva quantos segundos tem o evento: ");
		seg = leia.nextInt();
		
		hr = seg / 3600;
		min = (seg % 3600) / 60;
		seg = (seg % 3600) % 60;
		
		System.out.println("\nO Evento tem "+ hr + " Horas " + min + " Minutos e " + seg + " segundos");
	}

}
