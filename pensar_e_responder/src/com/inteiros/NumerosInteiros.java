package com.inteiros;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class NumerosInteiros {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> inteiros = new ArrayList<>();
		
		boolean loop = true;
		while (loop == true){
			System.out.println("Digite um número inteiro: ");
			inteiros.add(input.nextInt());
			System.out.println("Deseja adicionar mais um valor à lista? 1-Sim 2-Não");
			int op = input.nextInt();
			switch(op) {
			case 1: 
				System.out.println("Opção escolhida: 1-Sim");
				break;
			case 2:
				System.out.println("Opção escolhida: 2-Não");
				input.close();
				loop = false;
			}
		}
		
		int soma = 0;
		Iterator<Integer> it = inteiros.iterator();
		while (it.hasNext()){
			soma += it.next();
		}

		System.out.println("Números armazenados na lista: ");
		System.out.println(inteiros);
		System.out.println("Valor total da soma dos números armazenados na lista: ");
		System.out.println(soma);
	}

}
