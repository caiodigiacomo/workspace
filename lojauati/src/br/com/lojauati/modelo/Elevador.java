package br.com.lojauati.modelo;

public class Elevador {

	private int qtdePessoas;
	private int capacidadePessoas;
	private int andarAtual;
	private int maiorAndar;
	private int menorAndar;

	public Elevador () {}
	
	public Elevador(int cp, int ma) {
		capacidadePessoas=cp;
		maiorAndar=ma;
	}
	
	
	// <modificador> <tipo do retorno> <nome> (<tipo do parametro> <nome do parametro>)

	public void preencherMaiorAndar(int pAndar) {
		if (pAndar>menorAndar) {
			maiorAndar=pAndar;
		}
	}
	public void preencherMenorAndar(int pAndar) {
		if (pAndar<maiorAndar) {
			menorAndar=pAndar;
		}
	}
	public void preencherCapacidadePessoas (int pessoas) {
		if (pessoas>0) {
			capacidadePessoas=pessoas;
		}
	}
	public void subir() {
		if (andarAtual<maiorAndar) {
			andarAtual++;
		}
	}
	public void descer() {
		if (andarAtual>menorAndar) {
			andarAtual--;
		}
	}
	public void entrar(int pessoas) {
		if ((qtdePessoas+pessoas)<=capacidadePessoas) {
			qtdePessoas+=pessoas;
		}
	}
	public void sair (int pessoas) {
		if (pessoas<=qtdePessoas) {
			qtdePessoas-=pessoas;
		}
	}
	public String exibirTudo() {
		return 
				"Capacidade m�xima..........: " + capacidadePessoas + "\n" + 
				"Quantidade de pessoas atual:  " + qtdePessoas + "\n" + 
				"Andar atual................: " + andarAtual + "\n" + 
				"Maior andar................: " + maiorAndar + "\n" + 
				"Menor andar................: " + menorAndar;
	}
}

