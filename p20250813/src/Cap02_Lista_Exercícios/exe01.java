package Cap02_Lista_Exercícios;

public class exe01 {

	public static void main(String[] args) {
		double celsius, Kelvin, Reaumur, Rankine, Fahrenheit;
		
		celsius = 25;
		Kelvin =  celsius + 273.15;
		Reaumur =  celsius * 0.8;
		Rankine = celsius * 1.8 + 32 + 459.67;
		Fahrenheit = celsius * 1.8 + 32; 
		
		System.out.println("Kelvin: " + Kelvin);
		System.out.println("Reaumur: " + Reaumur);
		System.out.println("Rankine: " + Rankine);
		System.out.println("Fahrenheit: " + Fahrenheit);
	}

}
