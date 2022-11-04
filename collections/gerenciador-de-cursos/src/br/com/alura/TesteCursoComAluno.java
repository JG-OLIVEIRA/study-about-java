package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TesteCursoComAluno {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com arrays", 20));
		javaColecoes.adiciona(new Aula("Criando um curso", 21));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados nesse curso: ");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
//		for(Aluno a: javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}
		
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
//		System.out.println("E esse turini está matrículado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		
		System.out.println("O a1 é equals ao Turini ");
		System.out.println(a1.equals(turini));
		
		//obrigatoriamente o seguinte é true: 
		
		System.out.println(a1.hashCode() == turini.hashCode());
	}
}
