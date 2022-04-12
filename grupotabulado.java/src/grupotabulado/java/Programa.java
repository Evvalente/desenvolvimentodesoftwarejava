package grupotabulado.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\10162149956\\Downloads\\grupos-tabulados\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		int grupoA = 0;
		int grupoB = 0;
		int grupoC = 0;
		int grupoD = 0;
		int grupoE = 0;
		int grupoF = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			//System.out.println(linha);
			
			String[] dadosLinha = linha.split("\t");
//			System.out.println("Grupo: " + dadosLinha[0]);
//			System.out.println("Valor: " + dadosLinha[1]);
//			System.out.println("----------------------");
			
			
			if (dadosLinha[0].equals("A")) {
//				System.out.println("A");
				int valor = Integer.parseInt(dadosLinha[1]);
				grupoA = grupoA + valor;
			}
			
			if (dadosLinha[0].equals("B")) {
//				System.out.println("B");
				int valor = Integer.parseInt(dadosLinha[1]);
				grupoB = grupoB + valor;
			}
			if (dadosLinha[0].equals("C")) {
//				System.out.println("C");
				int valor = Integer.parseInt(dadosLinha[1]);
				grupoC = grupoC + valor;
			}
			if (dadosLinha[0].equals("D")) {
//				System.out.println("D");
				int valor = Integer.parseInt(dadosLinha[1]);
				grupoD = grupoD + valor;
			}
			if (dadosLinha[0].equals("E")) {
//				System.out.println("E");
				int valor = Integer.parseInt(dadosLinha[1]);
				grupoE = grupoE + valor;
			}
			if (dadosLinha[0].equals("F")) {
//				System.out.println("F");
				int valor = Integer.parseInt(dadosLinha[1]);
				grupoF = grupoF + valor;
			}
			
			
					 		
		}	
		
		System.out.println("O Valor total do grupo A: " + grupoA);
		System.out.println("O Valor total do grupo B: " + grupoB);
		System.out.println("O Valor total do grupo C: " + grupoC);
		System.out.println("O Valor total do grupo D: " + grupoD);
		System.out.println("O Valor total do grupo E: " + grupoE);
		System.out.println("O Valor total do grupo F: " + grupoF);
		
		System.out.println("O valor total de todos os grupos é:" + (grupoA + grupoB + grupoC + grupoD + grupoE + grupoF));
		leitor.close();
		
		
	

	
		}
	}


