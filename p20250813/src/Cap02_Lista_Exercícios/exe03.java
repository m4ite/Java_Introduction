package Cap02_Lista_Exercícios;

public class exe03 {

	public static void main(String[] args) {
		double total = 0;
		double media = 0;
		
		double[] gastos = {220, 130, 510, 230, 500, 652, 369, 158, 269, 416, 120, 200};
		
		for (double d : gastos) {
			total = total + d;
		}
		
		media = total / gastos.length;
		
		
		System.out.println("Gasto total dos "+  gastos.length + " meses");
		System.out.println("Media dos gastos: R$"+  media);
	}

}
