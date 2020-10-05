package decisao;

import javax.swing.JOptionPane;

public class Exercicio1Lista {

	public static void main(String[] args) {

		String nome = (JOptionPane.showInputDialog("Nome do cliente"));
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Quantos dias pretende se hospedar?"));
		float valorhospedagem = (diarias * 80);

		if (diarias>15) {
			valorhospedagem = (float) (valorhospedagem + (diarias * 5.5));
		}else if (diarias==15) {
			valorhospedagem = (float) (valorhospedagem + (diarias * 6));
		}else if (diarias<15) {
			valorhospedagem = (float) (valorhospedagem + (diarias * 8));
		}
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Número de diárias: " + diarias);
		System.out.println("Valor da hospedagem: " + valorhospedagem);
		
	}

}
