package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao{

	private int tipo;

	public String getAll() {
		return
				super.getAll() + "\n" +
				"Tipo: " + tipo;
	}

	public void setAll(float p1, String p2, int p3, int p4) {
		super.setAll(p1, p2, p3);
		tipo=p4;
	}
	
	public Medio() {
		super();
	}

	public Medio(float valor, String descricao, int duracao, int tipo) {
		super(valor, descricao, duracao);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public double calcularMensalidade(float fator) {
		return getValor()/36*fator;
	}

	@Override
	public void definirDuracao() {
		setDuracao(36);
		
	}
	
	
}
