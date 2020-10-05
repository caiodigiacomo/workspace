package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Pos extends Formacao implements PadraoFormacao{

	private String nivel;
	private boolean planoEstendido;
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"N�vel..........: " + nivel + "\n" +
				"Plano Estendido: " + planoEstendido;
	}

	public void setAll(float p1, String p2, int p3, String p4, boolean p5) {
		super.setAll(p1, p2, p3);
		nivel=p4;
		planoEstendido=p5;
	}
	
	public Pos() {
		super();
	}
	
	public Pos(float valor, String descricao, int duracao, String nivel, boolean planoEstendido) {
		super(valor, descricao, duracao);
		this.nivel = nivel;
		this.planoEstendido = planoEstendido;
	}

	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}
	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}

	@Override
	public double calcularMensalidade(float fator) {
		return getValor()/18*fator;
	}

	@Override
	public void definirDuracao() {
		setDuracao(18);
		
	}
	
	
}