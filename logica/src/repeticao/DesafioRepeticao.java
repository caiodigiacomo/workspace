package repeticao;

import javax.swing.JOptionPane;

public class DesafioRepeticao {

	public static void main(String[] args) {
		
		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1, digite um n�mero"));
		int jogador2 = 0;
		int tentativas = 0;
		do {
			jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2, qual n�mero o Jogador 1 digitou?"));
			if (jogador2>jogador1) {
				System.out.println("Digite um n�mero menor");
			} else if (jogador2<jogador1) {
				System.out.println("Digite um n�mero maior");
			}
			tentativas = tentativas+1;
		} while(jogador2 != jogador1);
			System.out.println("Parab�ns! Voc� acertou usando " + tentativas + " tentativas!");

	}
	}
