package br.edu.up;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.up.model.Aluno;


public class Programa {

	static EntityManagerFactory emf;
	static EntityManager em;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("prj-jpa-sqlite");
		em = emf.createEntityManager();
		
		menu();
		
	}

	private static void menu() {		
		cadastrar();
		consultar();
		editar();
		deletar();
	}
		
	private static void deletar() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o ID para deletar:");
		int idDeletar = leitor.nextInt();
	
		
		deletarId(idDeletar);
		
		System.out.println("ID deletado!");
		
	}

	private static void deletarId(Integer idDeletar) {
		Aluno excluirAluno = em.find(Aluno.class, idDeletar);
		em.getTransaction().begin();
		em.remove(excluirAluno);
		em.getTransaction().commit();
		
		
	}

	private static void editar() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a ID para editar: ");
		int idPesquisar = leitor.nextInt();
		pesquisar(idPesquisar);
		
		Aluno alterarAluno = procurar(idPesquisar);
		
		System.out.println("Digite um novo nome para alterar: ");
		String novoNome = leitor.next();
		System.out.println("Digite um novo cpf para alterar: ");
		String novoCpf = leitor.next();
		System.out.println("Digite a nova idade para alterar: ");
		int novaIdade = leitor.nextInt();
		
		alterarAluno.setNome(novoNome);
		alterarAluno.setCpf(novoCpf);
		alterarAluno.setIdade(novaIdade);
		
		editarnovo(alterarAluno);
		
		
	}

	private static void editarnovo(Aluno alterarAluno) {
		em.getTransaction().begin();
		em.merge(alterarAluno);
		em.getTransaction().commit();
		
	}

	private static void consultar() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor do ID para consulta: ");
		int id_Usuario_Pesquisa = leitor.nextInt();
		
		pesquisar(id_Usuario_Pesquisa);
		
	}

	private static void pesquisar(int idpesquisa) {
		
		Aluno consultaAluno = procurar(idpesquisa);
		
		int id = consultaAluno.getId();
		String nome = consultaAluno.getNome();
		String cpf = consultaAluno.getCpf();
		int idade = consultaAluno.getIdade();
		
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Idade:" + idade);
		
		
	}

	private static Aluno procurar(int idpesquisa) {
		Aluno idAluno = em.find(Aluno.class, idpesquisa);
		
		return idAluno;
	}

	private static void cadastrar()	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nome = leitor.nextLine();	
		System.out.println("Digite o cpf: ");
		String cpf = leitor.nextLine();	
		System.out.println("Digite a sua idade: ");
		int idade = leitor.nextInt();	
		
		Aluno cadastrarAluno = new Aluno();
		cadastrarAluno.setNome(nome);
		cadastrarAluno.setCpf(cpf);
		cadastrarAluno.setIdade(idade);
		
		salvar(cadastrarAluno);
		
		

	}

	private static Integer salvar(Aluno Aluno) {
		em.getTransaction().begin();
		em.persist(Aluno);
		em.getTransaction().commit();
		
		return Aluno.getId();
		
	}


		
		
	}
