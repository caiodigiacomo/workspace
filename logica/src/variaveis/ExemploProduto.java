package variaveis;

import javax.swing.JOptionPane;

public class ExemploProduto {

	public static void main(String[] args) {

		String produto = "";
		int quantidade=0;
		double valor=0;
		
		produto = JOptionPane.showInputDialog("Digite o nome do produto");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
		double total = quantidade*valor;
		
		System.out.println("Total: " + total + "\nNome do produto: " + produto);
		System.out.println("Total com desconto: " + (total*0.9));
		
		

	}

}