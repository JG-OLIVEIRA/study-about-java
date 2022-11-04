package br.com.alura;

public class Aluno {
	
	private String nome;
	private int numeroDeMatricula;
	
	public Aluno(String nome, int numeroDeMatricula) {
		if(nome == null) {
			throw new NullPointerException("O nome não pode ser nulo.");
		}
		this.nome = nome;
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroDeMatricula + "]";
	}
}
