package manipTextos;
import java.util.Scanner;

public class Principal_String {

	public static void main(String[] args) {
		Scanner obj_in = new Scanner(System.in);
		String msgTitulo;
		
		msgTitulo = "Capitulo 05 - Trabalhando com Strings em java";
		System.out.println(msgTitulo);
		
		Textos T = new Textos();
		
		/* -------- DESAFIO 3 --------
		System.out.println("Palavra para verificar tamanho: ");
		String texto = obj_in.next();
		int tamTexto = T.verifComprimento(texto);
		System.out.println("O tamanho do texto é: " + tamTexto);
		*/
		
		
		/* --------- DESAFIO 4 -------
		System.out.println("Palavra 1: ");
		String texto1 = obj_in.next();
		System.out.println("Palavra 2: ");
		String texto2 = obj_in.next();
		boolean igual = T.compararStrings1(texto1, texto2);
		System.out.println(igual ? "Os nomes são iguais" : "Os nomes são diferentes"); 
		*/
		
		/* --------- DESAFIO 5 -------
		System.out.println("Palavra 1: ");
		String texto1 = obj_in.next();
		System.out.println("Palavra 2: ");
		String texto2 = obj_in.next();
		boolean igual = T.compararStrings2(texto1, texto2);
		System.out.println(igual ? "Os nomes são iguais" : "Os nomes são diferentes"); 
		*/
		
		
		/* --------- DESAFIO 6 -------
		System.out.println("Nome: ");
		String texto1 = obj_in.next();
		System.out.println("Sobrenome: ");
		String texto2 = obj_in.next();
		String concat = T.concatenarStrings1(texto1, texto2);
		System.out.println(concat); */
		
		
		
		/* --------- DESAFIO 7 ------- 
		System.out.println("Nome: ");
		String texto1 = obj_in.next();
		System.out.println("Sobrenome: ");
		String texto2 = obj_in.next();
		String concat = T.concatenarStrings2(texto1, texto2);
		System.out.println(concat); */
		
		
		
		/* --------- DESAFIO 8 ------- 
		System.out.println("Digite uma frase: ");
		String texto = obj_in.next();
		System.out.println("Qual letra deseja verificar na frase? ");
		String a = obj_in.next();
		char letra = a.charAt(0);
		int num = T.contandoLetras(texto, letra);
		System.out.println("Foram encontradas " + num + " letras");*/
		
		
		
		/* --------- DESAFIO 9 ------- 
		System.out.println("Digite uma frase: ");
		String texto = obj_in.nextLine();
		System.out.println("Qual palavra deseja verificar na frase? ");
		String palavra = obj_in.nextLine();
		int num = T.contaPalavras(texto, palavra);
		
		if(num == 0) {
			System.out.println("Texto não possui do termo, palavra ou nome digitado");
		} else {
			System.out.println("O texto possui " + num + " ocorrências do termo, palavra ou nome digitado");
		}*/
		
		
		
		
		/* --------- DESAFIO 10 ------- 
		System.out.println("Digite uma frase: ");
		String texto = obj_in.nextLine();
		System.out.println("Palavra para substituir: ");
		String from = obj_in.nextLine();
		System.out.println("Substituir por: ");
		String to = obj_in.nextLine();
		String resultado = T.alterarTexto(texto, from, to);
		System.out.println("Frase modificada: " + resultado);*/
		
		
		
		
		/* --------- DESAFIO 11 ------- 
		System.out.println("Digite uma frase: ");
		String texto = obj_in.nextLine();
		String resultado = T.ZenitPolar(texto);
		System.out.println("Frase criptografado: " + resultado);*/
		
		
		
		/* --------- DESAFIO 12 ------- 
		System.out.println("Digite uma frase: ");
		String texto = obj_in.nextLine();
		String resultado = T.Pernanbuco(texto);
		System.out.println("Frase criptografado: " + resultado);*/
		
		obj_in.close();
		
		
		
	}

}
