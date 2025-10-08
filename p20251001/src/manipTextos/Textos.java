package manipTextos;

public class Textos {
	String Texto;
	
	public int verifComprimento(String texto) {
		int comprTexto;
		this.Texto = texto;
		comprTexto = this.Texto.length();
		return comprTexto;
	}
	
	
	public boolean compararStrings1(String texto1, String texto2) {
		return texto1.equals(texto2);
	}
	
	public boolean compararStrings2(String texto1, String texto2) {
		return texto1.equalsIgnoreCase(texto2);
	}
	
	public String concatenarStrings1(String texto1, String texto2) {
		return texto1 + " " +texto2;
	}
	
	public String concatenarStrings2(String texto1, String texto2) {
		return texto1.concat(" ").concat(texto2);
	}

	
	public int contandoLetras(String texto, char letra) {
		int count = 0;
		for (int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) == letra) {
				count ++;
			}
		}
		
		return count;
	}
	
	
	public int contaPalavras(String texto,String palavra) {
		int count = 0;
		int tamanhoPalavra = palavra.length();
		for (int i =0; i<= texto.length() - tamanhoPalavra; i++) {
			if(texto.substring(i, tamanhoPalavra + i).equals(palavra))
				count++;
		}
		
		return count;
	}
	
	
	public String alterarTexto(String text, String from, String to) {
		return text.replace(from, to);
	}
	
	public String ZenitPolar(String text) {
		String zenit = "zenit";
		String polar = "polar";
		
		String result = "";
		
		for (int i = 0; i< text.length(); i++) {			
			char a = text.charAt(i);
			
			if(zenit.indexOf(a) != -1) {
				result += polar.charAt(zenit.indexOf(a));
			} else if(polar.indexOf(a) != -1) {
				result += zenit.charAt(polar.indexOf(a));
			} else {
				result += a;
			}	
		}
		
		return result;
	}
	
	
	public String Pernanbuco(String text) {
		String palavraBase = "pernambuco";
		String code = "3764109852";
		
		String result = "";
		
		for (int i = 0; i< text.length(); i++) {			
			char a = text.charAt(i);
			
			if(palavraBase.indexOf(a) != -1) {
				result += code.charAt(palavraBase.indexOf(a));
			} else {
				result += a;
			}	
		}
		
		return result;
	}
}
