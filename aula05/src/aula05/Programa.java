package aula05;

public class Programa {
	
	public static void main(String[] args) {
		
		
		//tipos primitivos
		//int numero = 100;
		
		
		//classe -> vari?vel ? um objeto.
		String texto = "S? sei que nada sei. (S?crates)";
		int comprimento = texto.length();
		
		System.out.println("Comprimento: " + comprimento);
		String subTexto = texto.substring(5,31);
		System.out.println("Sub:" + subTexto);
		
		char caractere = texto.charAt(9);
		System.out.println("Char:" + caractere);
		
		//for (int i = 0; i < texto.length; i++) {
			//System.out.println(texto.charAt(i));
			
		//}
		
		String[] palavras = texto.split(" ");
		for (String palavra : palavras) {
			System.out.println(palavra);
			
		}
		
			
		String textoHifen = texto.replace(" ", "-");
		System.out.println(textoHifen);
		
		String textoTab = texto.replace(" ", "   ");
		System.out.println(textoTab);
		String[] palavrasTab = textoTab.split("\t");
		for (String palavra : palavrasTab) {
			System.out.println(palavra);
		}
		
		
		
		
	}

}
