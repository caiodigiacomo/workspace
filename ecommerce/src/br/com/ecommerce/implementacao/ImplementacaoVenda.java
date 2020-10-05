package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;

public class ImplementacaoVenda {

	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente();
		Venda venda = new Venda();
		
		produto.setAll(
				i(s("ID")),
				(s("Descrição")), 
				i(s("Quantidade")), 
				f(s("Valor da Compra")), 
				f(s("Valor da Venda"))
				);
	
		endereco.setAll(
				(s("Logradouro")),
				(s("Bairro")), 
				(s("Cidade")), 
				(s("Estado")), 
				(s("CEP")), 
				(s("Número")), 
				(s("Complemento"))
				);
		
		cliente.setAll(
				i(s("ID")),
				(s("Nome")), 
				endereco
				);

		venda.setAll(
				i(s("Nota Fiscal")),
				s("Data"),
				f(s("Total")),
				produto,
				cliente
				); 

		System.out.println(venda.getAll());

	}

}
