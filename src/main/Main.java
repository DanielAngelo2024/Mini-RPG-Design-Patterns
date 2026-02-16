package main;

import java.util.Scanner;

import facade.GameFacade;
import strategy.BowAttack;
import strategy.MagicAttack;
import strategy.SwordAttack;

public class Main {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		GameFacade jogo = new GameFacade();

		while (true) {
			System.out.println("1-Espada, 2-Magia, 3-Arco, 4-Status, 0-Sair");
			System.out.print("Escolha: ");
			int op = entrada.nextInt();

			switch (op) {
			case 1 -> jogo.mudarAtaque(new SwordAttack());
			case 2 -> jogo.mudarAtaque(new MagicAttack());
			case 3 -> jogo.mudarAtaque(new BowAttack());
			case 4 -> jogo.mostrarStatus();
			case 0 -> {
				System.out.println("Fim de jogo");
				return;
			}
			default -> System.out.println("Opção inválida!");
			}

			if (op >= 1 && op <= 3) {
				jogo.ataqueJogador();
				jogo.ataqueInimigo();
				jogo.mostrarStatus();
			}
		}
	}
}
