
public class Programa {
	
	public static void main(String[] args) {
		
		String [] matriculas = new String [5];
		matriculas [0] = "12345";
		matriculas [1]= "23456";
		matriculas [2]= "34567";
		matriculas [3]= "45678";
		matriculas [4]= "56789";
		
		
		String [] nomes = new String [5];
		nomes [0] = "Maria";
		nomes [1] = "João";
		nomes [2] = "Pedro";
		nomes [3] = "Paulo";
		nomes [4] = "Josevaldo";
		
		double [] notas1 = new double [5];
		notas1 [0] = 7.5;
		notas1 [1] = 1.2;
		notas1 [2] = 4.5;
		notas1 [3] = 3.2;
		notas1 [4] = 5.0;
		
		double [] notas2 = new double [5];
		notas2 [0] = 1.5;
		notas2 [1] = 1.5;
		notas2 [2] = 0.5;
		notas2 [3] = 5.2;
		notas2 [4] = 2.0;
		
		double [] notasfinais = new double [5];
		notasfinais [0] = (notas1 [0] + notas2[0]) /2;
		notasfinais [1] = (notas1 [1] + notas2[1]) /2;
		notasfinais [2] = (notas1 [2] + notas2[2]) /2;
		notasfinais [3] = (notas1 [3] + notas2[3]) /2;
		notasfinais [4] = (notas1 [4] + notas2[4]) /2;
		
		
		
		
		if (notafinal >= 6)		{
			
			System.out.println("Aprovado: ( x ) Sim (   ) Não");
			System.out.println("Nota final: " + notafinal);
			
		
			} else {
			System.out.println("Aprovado: (  ) Sim ( x  ) Não");
			System.out.println("Nota final: " + notafinal);
		
		
		
		
		
		
		
		
			}
	}
}
