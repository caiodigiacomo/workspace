package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
		float media = (nota1 + nota2) / 2;
		short falta = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de faltas: "));
		System.out.println(nome + " sua m�dia foi " + media);
		if (falta>20) {
			System.out.println("Infelizmente voc� foi reprovado por excesso de faltas");
		}else
		if (media>=6) {
			System.out.println("Parab�ns " + nome + " voc� foi aprovado!");
			
		}else if (media<4) {
			System.out.println("Infelizmente " + nome + " voc� foi reprovado");
			
		}else {
			System.out.println(nome + " voc� ainda tem chance no exame");
			
		}
		
		
	}

}
