package ListaExercicios;

public class exe04 {

	public void imprimirFatorial(int n1, int n2) {
		
		while (n1 <= n2) {
			System.out.print("O fatorial de " + n1 + " é: ");
			Fatorial(n1);
			n1 ++;
		}
	}
	
	public static void  Fatorial(int n) {
		int fat = 1;
		for(int i=1;i<=n;i++){
			fat=fat*i;
		  }
		System.out.println(fat);
	}

}
