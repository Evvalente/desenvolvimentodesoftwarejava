
/**
 * Exercício de fixação 1
▪ Criar um programa para processar as seguintes informações de um aluno: 
matrícula, nome , nota1, nota2 e se ele está aprovado ou reprovado;
▪ Durante a execução calcular a nota final do aluno utilizando a seguinte 
regra: notaFinal = (nota1 + nota2) / 2. Se a nota final for igual ou superior a 
6 o aluno está aprovado, caso contrário estará reprovado;
▪ O programa deverá imprimir o seguinte relatório:
Matrícula: xxxxx
Nome: xxxxx xxxxx
Aprovado: ( x ) Sim (   ) Não
Nota final: xxxxx

*/

import java.util.Scanner;

public class Programa { //Início
	
	
	public static void main(String[] args) {
		
//		String matricula = "12345";
//		String nome = "Maria Fernanda";
//		double nota1 = 7.5;
//		double nota2 = 6.7;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a matrícula: ");
		String matricula = leitor.nextLine();
		System.out.println("Digite o nome: ");
		String nome = leitor.nextLine();
		System.out.println("Digite a nota 1: ");
		double nota1 = leitor.nextDouble();
		leitor.nextLine();
		
		System.out.println("Digite a nota 2:");
		double nota2 = leitor.nextDouble();
		leitor.nextLine();
		
		
		double notafinal = (nota1 + nota2) / 2;
		
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome: " + nome);
				
		if (notafinal >= 6)		{
			
			System.out.println("Aprovado: ( x ) Sim (   ) Não");
			System.out.println("Nota final: " + notafinal);
			
		
			} else {
			System.out.println("Aprovado: (  ) Sim ( x  ) Não");
			System.out.println("Nota final: " + notafinal);
			
		
		}
		
	leitor.close();
	
	}
	
	
} // Fim
