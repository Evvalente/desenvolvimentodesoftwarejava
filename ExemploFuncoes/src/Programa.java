
public class Programa {

	public static void main(String[] args) {
		double valor1 = 100;
		double valor2 = 50;
		//double resultado = valor1 + valor2;
		//System.out.println(valor);
		double resultado = somar(valor1, valor2);
		
		String texto = String.valueOf(resultado);
		imprimir(texto);
		
	}
	
	
	public static double somar(double a, double b) {
		double vlr = a + b;
		return vlr;
	}
	public static void imprimir (String txt) {
		System.out.println(txt);
	}

}


