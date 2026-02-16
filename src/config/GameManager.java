package config;

import entity.Inimigo;
import entity.Jogador;

/**
 * Gerenciador do jogo, usando design pattern Lazy Singleton, aqui controla o
 * estado, fases, pontuação do jogo.
 */

public class GameManager {
	private static GameManager instancia;

	private Jogador jogador;
	private Inimigo inimigo;

	private GameManager() {
		this.jogador = new Jogador("Herói");
		this.inimigo = new Inimigo("Goblin", 80, 25);
	}

	public static GameManager getInstancia() {
		if (instancia == null) {
			instancia = new GameManager();
		}
		return instancia;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public Inimigo getInimigo() {
		return inimigo;
	}

}
