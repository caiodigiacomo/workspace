package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;

public class ImplementacaoAluno {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.setAll(
				(JOptionPane.showInputDialog("Logradouro")),
				(JOptionPane.showInputDialog("Bairro")), 
				(JOptionPane.showInputDialog("Cidade")), 
				(JOptionPane.showInputDialog("Estado")), 
				(JOptionPane.showInputDialog("CEP")), 
				(JOptionPane.showInputDialog("N�mero")), 
				(JOptionPane.showInputDialog("Complemento"))
				);

		Aluno al = new Aluno();
		al.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("RM")), 
				JOptionPane.showInputDialog("Nome"), 
				JOptionPane.showInputDialog("Email"),
				endereco
				);
		System.out.println(al.getAll());

	}

}
