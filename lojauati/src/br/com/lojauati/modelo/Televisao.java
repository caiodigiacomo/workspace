package br.com.lojauati.modelo;

public class Televisao {

	private int canal;
	private boolean status;
	private int volume;

	public void aumentarVolume() {
		if (status==true) {	
		volume++;
		}
		}
	public void diminuirVolume() {
		if (volume>0 && status==true) {
		volume--;
		}
	}
	public void mudarCanal(int can) {
		if (status==true) {	
		canal=can;
		}
	}
	public void ligar() {
		status=true;
	}
	public void desligar() {
		status=false;
	}
	public boolean exibirStatus() {
		return status;
	}
	public String exibirTudo() {
		String resposta="DESLIGADA";
		if (status==true) {
			resposta="LIGADA";
		}
		return
				"Canal..: " + canal + "\n" +
				"Status.: " + resposta + "\n" +
				"Volume.:" + volume;
}
}
