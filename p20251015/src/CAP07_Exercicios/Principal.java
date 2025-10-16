package CAP07_Exercicios;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Capitulo 7 - Lista exercícios");
		Exercicios ex = new Exercicios();
		
		int[] arrayNumeros = {1,5,9,7,8,3};
		
		// EXERCICIO 1
		//int soma = ex.exercicio1(arrayNumeros);
		//System.out.println("Soma: " + soma);
		
		
		// EXERCICIO 2
		//ex.exercicio2(arrayNumeros);
		
		
		// EXERCICIO 3
		//ex.exercicio3(arrayNumeros);
		
		
		// EXERCICIO 4
		/*int[] invertido = new int[arrayNumeros.length];
		invertido = ex.exercicio4(arrayNumeros);
		for (int i = 0; i < invertido.length; i++) {
			System.out.println(invertido[i]);
		}*/
		
		
		// EXERCICIO 5
		int[] ordenados = new int[arrayNumeros.length];
		ordenados = ex.exercicio5(arrayNumeros);
		for (int i = 0; i < ordenados.length; i++) {
			System.out.println(ordenados[i]);
		}
		
		
		
		// EXERCICIO 6
			String[] nomes = {"Maite"};
			boolean retorno = ex.exercicio6("Maite", nomes);
		
		// EXERCICIO 7
			int[] duplicar = new int[arrayNumeros.length];
			duplicar = ex.exercicio7(arrayNumeros);
		
		// EXERCICIO 8
			int[] duplicados = {1,3,5,8,8,8,4,1,2};
			int[] SemDuplicados = new int[0];
			SemDuplicados = ex.exercicio8(duplicados);
		
		// EXERCICIO 9
			ex.exercicio9();
		
		// EXERCICIO 10
			ex.exercicio10();
	}

}
