package br.com.universidade.modelo;

public class Aluno {

	private int rm;
	private String nome;
	private String email;
	private Endereco endereco;
	
	
	public Aluno() {
		super();
	}

	public Aluno(int rm, String nome, String email, Endereco endereco) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	public String getAll() {
		return
				"RM.......: " + rm + "\n" +
				"Nome.....: " + nome + "\n" +
				"Email....: " + email + "\n" +
				"Endere�o.:" + "\n" + endereco.getAll();
	}

	public void setAll(int p1, String p2, String p3, Endereco p4) {
		rm=p1;
		nome=p2;
		email=p3;
		endereco=p4;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

	/*
	 * Design Patterns (melhores pr�ticas para projetos com OO)
	 * DTO (Data Transfer Object) (melhores pr�ticas para os modelos) (Beans / JavaBeans / model)
	 * 1� sugest�o: todos os atributos devem ser privados
	 * 2� sugest�o: cada atributo deve ter o seu m�todo getter (output) e setter (input)
	 * 3� sugest�o: toda classe deve possuir no m�nimo dois construtores (um vazio e outro cheio - com todos os atributos)
	 */

}