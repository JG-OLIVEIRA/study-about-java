package br.com.alura;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
	
		javaColecoes.adiciona(new Aula("Trabalhando com arrays", 20));
		javaColecoes.adiciona(new Aula("Criando um curso", 21));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		System.out.println(javaColecoes.getAulas());
	}
}
