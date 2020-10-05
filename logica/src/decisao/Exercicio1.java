package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String nome = (JOptionPane.showInputDialog("Digite o nome do cliente"));
		double investimentooriginal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor investido"));
		int fidelidade = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos serão de fidelidade"));
		String regiao = (JOptionPane.showInputDialog("Digite a região onde mora")).toUpperCase();
		double investimento=0;
		
		if (regiao.equals("SUL") || regiao.equals("SUDESTE")) {
			fidelidade = (int) (fidelidade * 1.2);
		}
		if (investimentooriginal<1000) {
		investimento = investimentooriginal * 1.015;
		}else if (investimentooriginal>=1000 && investimentooriginal<5000) {
		investimento = investimentooriginal * 1.02;
		}else if (investimentooriginal>=5000) {
			investimento = investimentooriginal * 1.03;
		}
		if (fidelidade>5) {
			investimento = investimento * 1.01;
		}
		System.out.println("O valor investido é: " + investimento);
		System.out.println("A diferença entre o valor investido e o valor atual é: " + (investimento-investimentooriginal));
		

	}

}
