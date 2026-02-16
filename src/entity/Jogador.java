package entity;

public class Jogador extends Personagem {
	private int nivel;
	
	public Jogador(String nome) {
		super(nome, 100);
		this.setNivel(1);
		
	}
	
	public void subirDeNivel() {
		nivel++;
		vidaMaxima += 20;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	
	

}
