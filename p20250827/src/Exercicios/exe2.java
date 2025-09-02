package Exercicios;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		Scanner Obj_in = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = Obj_in.next();
		
		System.out.println("Digite sua idade: ");
		int idade = Obj_in.nextInt();
		
		if(idade >= 18) {
			System.out.println("Possui CNH (s/n): ");
			String cnh = Obj_in.next();
			if(cnh.equals("s")) {
				System.out.println("Pode dirigir!");
			} else {
				System.out.println("Não pode dirigir!");
			}
		} else {
			System.out.println("Não pode dirigir");
		}

		Obj_in.close();

	}

}
