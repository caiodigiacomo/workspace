package br.com.lojauati.teste;

import br.com.lojauati.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador objeto = new Elevador(50, 10);
		
		Elevador outro = new Elevador();
		
		System.out.println(objeto.exibirTudo());
		//objeto.preencherCapacidadePessoas(10);
		//objeto.preencherMaiorAndar(20);
		objeto.preencherMenorAndar(0);
		System.out.println("=======================");
		System.out.println(objeto.exibirTudo());
		objeto.entrar(5);
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.sair(2);
		System.out.println("=======================");
		System.out.println(objeto.exibirTudo());
		objeto.descer();
		objeto.descer();
		objeto.descer();
		objeto.descer();
		System.out.println("=======================");
		System.out.println(objeto.exibirTudo());

	}

}
