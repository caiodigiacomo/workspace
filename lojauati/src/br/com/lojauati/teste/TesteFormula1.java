package br.com.lojauati.teste;

import javax.swing.JOptionPane;

import br.com.lojauati.modelo.Formula1;

public class TesteFormula1 {

	public static void main(String[] args) {
		Formula1 objeto; //criando um objeto
		
		Formula1 carro = new Formula1(); //instanciando um objeto
		carro.preencherEscuderia(JOptionPane.showInputDialog("Digite a escuderia"));
		System.out.println("Escuderia: " + carro.exibirEscuderia());
		carro.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor")));
		System.out.println("Valor: " + carro.exibirrValor());
		carro.preencherRpm(Integer.parseInt(JOptionPane.showInputDialog("Digite RPM")));
		System.out.println("RPM: " + carro.exibirRpm());
		

	}

}
