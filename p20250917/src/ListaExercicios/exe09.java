package ListaExercicios;

public class exe09 {
	public void MaiorMenor(int n1, int n2, int n3) {
		
		int maior = n1;
        int menor = n1;

        if (n2 > maior) {
        	maior = n2;
        }
        
        if (n3 > maior) {
        	maior = n3;
       }

        
        
        
        if (n2 < menor){
        	menor = n2;}
        
        if (n3 < menor){
        	menor = n3;}

       
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
	}
	
}
