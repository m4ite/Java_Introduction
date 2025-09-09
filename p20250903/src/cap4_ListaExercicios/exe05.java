package cap4_ListaExercicios;

public class exe05 {

	public static void main(String[] args) {
		int a = 0, b = 1;
		
		while (b <= 100) {
            System.out.print(b + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

	}

}
