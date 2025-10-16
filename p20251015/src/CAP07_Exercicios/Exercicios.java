package CAP07_Exercicios;

import java.util.Iterator;

public class Exercicios {
	public int exercicio1(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result;
	}
	
	
	public void exercicio2(int[] array) {
		int maior = array[0];
		int menor = array[0];
		
		for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
            if (array[i] < menor) {
                menor = array[i];
            }
        }
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}
	
	
	public void exercicio3(int[] array) {
		int pares = 0;
		int impares = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				pares ++;
			} else {
				impares ++;
			}
		}
		
		
		System.out.println("Qtd pares: "+ pares);
		System.out.println("Qtd impares: "+ impares);
	}
	
	public int[] exercicio4(int[] array) {
		int[] invertido = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			invertido[array.length -i - 1] = array[i];
		}
		
		return invertido;
	}
	
	
	public int[] exercicio5(int[] array) {
		int[] ordenados = new int[array.length];
		
		return ordenados;
	}
	
	
	public boolean exercicio6(String nome, String[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i].equals(nome)) {
				return true;
			}
		}
		return false;
	}
	
	public int[] exercicio7(int[] array) {
		int[] retorno = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			retorno[i] = array[i];
		}
		
		return retorno;
	}

	public int[] exercicio8(int[] array) {
		int[] retorno = new int[0];
		boolean aux = false;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < retorno.length; j++) {
				if(array[i] == retorno[j]) {
					aux = true;
				} else {
					aux = aux ? aux : false;
				}
			}
			
			if(!aux) {
				retorno[retorno.length - 1] = array[i];
			}
		}
		
		
		return retorno;
	}

	public void exercicio9() {
	
	}

	public void exercicio10() {
	
	}
}
