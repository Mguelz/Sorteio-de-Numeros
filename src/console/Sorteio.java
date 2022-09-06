package console;

import java.util.Random;
import java.util.Scanner;
/**
 * Sortear um número pseudo-randomico Pedir para o usuario tentar acertar 
 * Caso ele erre, pedir para tentar novamente
 *
 * sortear numeros de 1 a 15
 */
public class Sorteio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // objeto para guardar o que for digitado
		Random random = new Random(); // objeto para gerar numero aleatorio

		int digitado = 0;
		int opcao = 0;
		boolean continuar = false;

		// laço para verificar se o jogador deseja continuar
		do {
			System.out.println("\nDigite um número entre 1 e 15: ");
			digitado = scanner.nextInt();

			int sorteio = random.nextInt(15) + 1;

			if (digitado == sorteio) {
				System.out.println("Você Acertou!, Parabéns ");
			} else {
				System.out.println("Você Errou, o número certo era: " + sorteio);
			}

			System.out.println("\nDeseja continuar? Digite 0-(não) e 1-(sim)");
			opcao = scanner.nextInt();

			if (opcao == 0) {
				continuar = false;
			} else if (opcao == 1) {
				continuar = true;
			}
		} while (continuar == true);

		scanner.close();
	}

}
