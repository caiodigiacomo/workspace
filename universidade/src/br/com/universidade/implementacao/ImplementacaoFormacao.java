package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Bacharelado;
import br.com.universidade.modelo.Formacao;
import br.com.universidade.modelo.Medio;
import br.com.universidade.modelo.Pos;

public class ImplementacaoFormacao {

	public static void main(String[] args) {
		Formacao formacao = null;
		char resp = JOptionPane.showInputDialog("Digite: \n<1> Medio\n<2> Bacharelado\n<3> Pos").charAt(0);
		if (resp=='1') {
			formacao=new Medio(
					Float.parseFloat(JOptionPane.showInputDialog("Valor")),
					JOptionPane.showInputDialog("Descri��o"),
					Integer.parseInt(JOptionPane.showInputDialog("Dura��o")),
					Integer.parseInt(JOptionPane.showInputDialog("Tipo"))
					);
		}else if (resp=='2') {
			formacao=new Bacharelado(
					Float.parseFloat(JOptionPane.showInputDialog("Valor")),
					JOptionPane.showInputDialog("Descri��o"),
					Integer.parseInt(JOptionPane.showInputDialog("Dura��o")),
					JOptionPane.showInputDialog("TCC"),
					Integer.parseInt(JOptionPane.showInputDialog("Carga Hor�ria Est�gio"))
					);
		}else if (resp=='3') {
			formacao=new Pos(
					Float.parseFloat(JOptionPane.showInputDialog("Valor")),
					JOptionPane.showInputDialog("Descri��o"),
					Integer.parseInt(JOptionPane.showInputDialog("Dura��o")),
					JOptionPane.showInputDialog("N�vel"),
					Boolean.parseBoolean(JOptionPane.showInputDialog("Estendido?"))
					);
		}else {
			System.out.println("Op��o inv�lida");
		}
		System.out.println(formacao.getAll());
	}

}
