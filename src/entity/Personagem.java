package entity;

public abstract class Personagem {
	protected String nome;
	protected int vida;
	protected int vidaMaxima;
	
	public Personagem(String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
		this.vidaMaxima = vida;
	}
	
	public boolean tahVivo() {
		return vida > 0;
	}
	
	public void receberDano(int dano) {
		vida -= dano;
		if (vida < 0) vida = 0;
	}

	public String getNome() {
		return nome;
	}

	public int getVida() {
		return vida;
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}
	
	

}
