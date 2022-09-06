package JOptionPane;

import java.util.Random;
import javax.swing.JOptionPane;
/**
 * Sortear um número pseudo-randomico Pedir para o usuario tentar acertar 
 * Caso ele erre, pedir para tentar novamente
 *
 * sortear numeros de 1 a 15
 * 
 * Utilizando JOptionPane
 */
public class Sorteio {

	public static void main(String[] args) {

		Random random = new Random(); // objeto para gerar numero aleatorio

		int digitado = 0;
		int opcao = 0;
		boolean continuar = false;

		// laço para verificar se o jogador deseja continuar
		do {
			digitado = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero entre 1 e 15 "));
			
			// se o user não inserir o numero entre 1 e 15, repetir continuamente
			if(digitado > 15 || digitado < 1) {
				do {
				digitado = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero entre 1 e 15 "));
				}while(digitado > 15 || digitado < 1);
			}

			int sorteio = random.nextInt(15) + 1; // gera um numero aleatorio entre 1 e 15

			if (digitado == sorteio) {
				JOptionPane.showMessageDialog(null, "Voce acertou, Parabéns");
			} else {
				JOptionPane.showMessageDialog(null, "Voce errou, o numero certo é: " + sorteio);
			}
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? 0-(NAO) e 1-(SIM) "));

			if (opcao == 0) {
				continuar = false;
			} else if (opcao == 1) {
				continuar = true;
			}
		} while (continuar == true);


	}

}
