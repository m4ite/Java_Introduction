package ListaExercicios;
import java.util.Arrays;


public class exe10 {
	public void ordenar(int[] numeros) {
		 Arrays.sort(numeros);
		 
		 System.out.println("Números ordenados: ");
		 
		 for (int i = 0; i<numeros.length; i++) {
			System.out.print(numeros[i] + "  ");
		}
	}
}
