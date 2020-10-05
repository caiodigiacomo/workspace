package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao{

	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Projeto Conclus�o.......: " + projetoConclusao + "\n" +
				"Carga Hor�ria de Est�gio: " + cargaHorariaEstagio;
	}

	public void setAll(float p1, String p2, int p3, String p4, int p5) {
		super.setAll(p1, p2, p3);
		projetoConclusao=p4;
		cargaHorariaEstagio=p5;
	}
	
	public Bacharelado() {
		super();
	}
	
	
	public Bacharelado(float valor, String descricao, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
		super(valor, descricao, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	@Override
	public double calcularMensalidade(float fator) {
		return getValor()/48*fator;
	}

	@Override
	public void definirDuracao() {
		setDuracao(48);
		
	}
	
	
}
