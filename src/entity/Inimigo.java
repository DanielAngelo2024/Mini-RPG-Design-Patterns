package entity;

public class Inimigo extends Personagem {
	private int poderDeAtaque;

	public Inimigo(String nome, int vida, int poderDeAtaque) {
		super(nome, vida);
		this.poderDeAtaque = poderDeAtaque;
	}
	
	public int atacar() {
		return poderDeAtaque;
	}

}
