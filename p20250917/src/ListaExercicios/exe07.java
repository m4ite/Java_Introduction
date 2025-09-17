package ListaExercicios;

public class exe07 {
	public void imprimirSalario(float ValorHora, int QtdHoras) {
		double salario = ValorHora * QtdHoras;
		double desconto;
		
		if(salario <= 900) {
			desconto = 0;
		} else if (salario > 900 && salario <= 1500) {
			desconto = salario * 0.05;
		} else if (salario > 1500 && salario <= 2500) {
			desconto = salario * 0.1;
		} else {
			desconto = salario * 0.2;
		}
		
		System.out.println(salario - desconto);
	}
}
