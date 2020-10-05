package br.com.lojauati.modelo;

public class Formula1 {
	private String escuderia;
	private float valor;
	private int rpm;

	public String exibirEscuderia() {
		return escuderia;
	}
	public void preencherEscuderia(String parametro) {
		escuderia = parametro.toUpperCase();
	}
	public float exibirrValor() {
		return valor;
	}
	public void preencherValor(float parametro) {
		if (parametro>0 ) {
			valor = parametro;
		}
	}
	public int exibirRpm() {
		return rpm;
	}
	public void preencherRpm(int parametro) {
		rpm = parametro;
	}	

	public void preencherTudo(String parametro1, float parametro2, int parametro3) {
		escuderia = parametro1;
		valor = parametro2;
		rpm = parametro3;

	}
	public String exibirTudo() {
		return escuderia + "\n" + valor + "\n" + rpm;

	}
	public float exibirPromocao() {
		return (float) (valor * 0.9);
	}
	public float exibirPromocao(float porc) {
		return valor - valor * (porc/100);
	}
}

/*
 * Sintaxe para criação de método no Java
 * <modificador> <tipo do retorno> <nome do metodo> (tipo do parametro)
 */