package br.com.ecommerce.modelo;

public class Cliente {

	private int id;
	private String nome;
	private Endereco endereco;
	
	public Cliente (int i, String n, Endereco e) {
		id=i;
		nome=n;
		endereco=e;
	}
	public Cliente () {}
	
	public String getAll() {
		return
				"ID.......: " + id + "\n" +
				"Nome.....: " + nome + "\n" +
				"Endere�o.:" + "\n" + endereco.getAll();
	}

	public void setAll(int p1, String p2, Endereco p3) {
		id=p1;
		nome=p2;
		endereco=p3;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
