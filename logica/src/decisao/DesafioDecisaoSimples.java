package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		String nome = (JOptionPane.showInputDialog("Digite o nome da pessoa: "));
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade da pessoa: "));
		
		if (idade>=18 && idade<70) {
			System.out.println(nome + " � obrigado a votar");
			
		}
		if (idade==16 || idade==17 || idade>70) {
			System.out.println(nome + " o voto � facultativo");
			
		}
		if (idade<16) {
			System.out.println(nome + " n�o pode votar");
			
		}

	}

}
