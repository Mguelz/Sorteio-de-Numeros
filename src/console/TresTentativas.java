package console;

import java.util.Random;
import java.util.Scanner;
/*
 Sortear um número pseudo-randomico 
 Pedir para o usuario tentar acertar 
 Terá 3 tentativas para acertar

 será sorteado numeros de 1 a 10
 */
public class TresTentativas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// variaveis
		int digitado = 0;
		int opcao = 0;
		int tentativa = 1;

		// o user terá tres tentativas para acertar o numero
		for (int continuar = 1; continuar <= 3; continuar++) {
			System.out.println("Tentativa " + tentativa);
			tentativa++;
			System.out.println("Digite um número entre 1 e 10: ");
			digitado = scanner.nextInt();

			int sorteio = random.nextInt(10) + 1;

			if (digitado == sorteio) {
				System.out.println("Você Acertou!, Parabéns ");
				continuar = 3;
			} else {
				System.out.println("Você Errou, o número certo era: " + sorteio);

			}
			System.out.println("------------------------------");
		}

		System.out.println("\n\nO programa terminou!! ");
		scanner.close();

	}

}
