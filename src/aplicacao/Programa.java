package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.CalculadoraDeservico;
import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Conta> list = new ArrayList<>();
		try {
		System.out.print("Quantos Contas serão registrados? ");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
            System.out.println();
			System.out.println("Conta #" + i + ": ");
			System.out.print("Numero da Conta: ");
			int numero = sc.nextInt();
			System.out.print("Nome do Titular: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Saldo Atual: ");
			double saldo = sc.nextDouble();
			list.add(new Conta(numero, nome, saldo));

		}
		
		System.out.println();
		System.out.println("Lista de Contas:");
		System.out.println();
		Collections.sort(list);
		for (Conta obj : list) {
			System.out.println(obj);
		}
		Conta x = CalculadoraDeservico.max(list);
		System.out.println();
		System.out.println("Conto Com Maior Saldo -> ");
		System.out.println(x);
	
		}catch(RuntimeException e){
			System.out.println("Erro Inesperado!");
			System.out.println("Reinicie o Programa e verifique se esta fazendo correto!");
		}
		sc.close();
	}

}
