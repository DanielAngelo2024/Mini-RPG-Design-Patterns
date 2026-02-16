package facade;

import config.GameManager;
import entity.Inimigo;
import entity.Jogador;
import strategy.AttackStrategy;
import strategy.SwordAttack;

/**
 * A "Faxada" do jogo, o cliente(a classe principal "main")
 * não lida diretamente com as outras classes, 
 * escondendo toda a complexidade interna.
 */

public class GameFacade {
	private GameManager gerenciador;
	private AttackStrategy estrategiaDeAtaque;
	
	public GameFacade() {
		gerenciador = GameManager.getInstancia();
		estrategiaDeAtaque = new SwordAttack();
	}
	
	public void mudarAtaque(AttackStrategy attack) {
		this.estrategiaDeAtaque = attack;
	}
	
	public void ataqueJogador() {
		int dano = estrategiaDeAtaque.attack();
		Inimigo inimigo = gerenciador.getInimigo();
		inimigo.receberDano(dano);
		System.out.println("Você causou " + dano + " de dano no " + inimigo.getNome() + "!");
	}
	
	public void ataqueInimigo() {
		int dano = 10;
		Jogador jogador = gerenciador.getJogador();
		Inimigo inimigo = gerenciador.getInimigo();
		jogador.receberDano(dano);
		System.out.println("O " + inimigo.getNome() + " causou " + dano + " de dano!");
	}
	
	public void mostrarStatus() {
        System.out.println("Vida do jogador: " + gerenciador.getJogador().getVida());
        System.out.println("Vida do inimigo: " + gerenciador.getInimigo().getVida());
    }

}
