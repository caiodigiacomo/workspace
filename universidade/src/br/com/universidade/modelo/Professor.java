package br.com.universidade.modelo;

public class Professor {

	private int id;
	private String nome;
	private float valorHora;
	private String formacao;
	private Endereco endereco;
	
	
	public Professor() {
		super();
	}

	public Professor(int id, String nome, float valorHora, String formacao, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.valorHora = valorHora;
		this.formacao = formacao;
		this.endereco = endereco;
	}

	public String getAll() {
		return
				"ID.........: " + id + "\n" +
				"Nome.......: " + nome + "\n" +
				"Valor hora.: " + valorHora + "\n" +
				"Formação:..: " + formacao + "\n" +
				"Endereço...: " + "\n" + endereco.getAll();
	}

	public void setAll(int p1, String p2, float p3, String p4, Endereco p5) {
		id=p1;
		nome=p2;
		valorHora=p3;
		formacao=p4;
		endereco=p5;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
