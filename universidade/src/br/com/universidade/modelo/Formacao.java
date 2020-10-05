package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

/*
 *Polimorfismo:  métodos com o mesmo nome e ações diferentes
 *Overload: quando os métodos estão na mesma classe
 *Override: quando os métodos estão em classes diferentes
 */

public abstract class Formacao implements PadraoFormacao{

	private float valor;
	private String descricao;
	private int duracao;
	
	public String getAll() {
		return
				"Valor......: " + valor + "\n" +
				"Descrição..: " + descricao + "\n" +
				"Duração....: " + duracao;
	}

	public void setAll(float p1, String p2, int p3) {
		valor=p1;
		descricao=p2;
		duracao=p3;
	}
	
	public Formacao() {
		super();
	}
	public Formacao(float valor, String descricao, int duracao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
		this.duracao = duracao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public double calcularMensalidade(float fator) {
		return 0;
	}

	@Override
	public void definirDuracao() {
		
	}
	
	
}
