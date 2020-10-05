package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		while (email.indexOf("@")<2) {
			email = JOptionPane.showInputDialog("Email novamente").toLowerCase();
		}
		System.out.println("Email: " + email);
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		while (nome.length()<5 || nome.length()>15) {
			nome = JOptionPane.showInputDialog("Nome novamente");
			
		}
		System.out.println("Nome: " + nome);

	}

}
