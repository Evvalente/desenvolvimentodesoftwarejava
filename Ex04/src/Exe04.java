import java.util.Scanner;

public class Exe04 {




	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a matrícula: ");
		String matricula = leitor.nextLine();
		
		System.out.println("Informe o nome: ");
		String nome = leitor.nextLine();
		double[] notas = new double[5];
		
		double [] pesonotas = new double [5];
		pesonotas[0] = 0.05;
		pesonotas[1] = 0.05;
		pesonotas[2] = 0.2;
		pesonotas[3] = 0.2;
		pesonotas[4] = 0.5;
		
		
		int contador = 0;
		do {
			System.out.println("Informe uma nota entre 0 e 10.");
			System.out.println("Digite a " + (contador + 1) + "a nota:");
			double temp = leitor.nextDouble();
			
			if (temp < 0 || temp > 10) {
				System.out.println("A nota " + temp + "é inválida!");
			} else {
				notas [contador] = temp;
				contador++;
			}
		  

		} while (contador < 5);
		
		System.out.println();
		System.out.println("-----RELATÓRIO-----");
		System.out.println("Matrícula :" + matricula);
		System.out.println("Nome:" + nome);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ":" + notas[i]);
		}
		
		double [] calculo = new double [5];
		calculo[0] = (notas[0] * pesonotas[0]);
		calculo[1] = (notas[1] * pesonotas[1]);
		calculo[2] = (notas[2] * pesonotas[2]);
		calculo[3] = (notas[3] * pesonotas[3]);
		calculo[4] = (notas[4] * pesonotas[4]);
		
		double notafinal = (calculo[0] + calculo[1] + calculo[2] + calculo[3] + calculo[4]);
		System.out.println("Sua nota final é: " + notafinal);
		
		if (notafinal >= 6)		{
			
			System.out.println("Aprovado: ( x ) Sim (   ) Não");
			
		
			} else {
			System.out.println("Aprovado: (  ) Sim ( x  ) Não");
			}
		leitor.close();
	
	
	}

}
	