package classes;

import java.util.Random;

import informa��es.Modificador;

public class Guerreiro {

	Modificador mod = new Modificador();
	private int vida;

	public Guerreiro() {
		Random aleatorio = new Random();
		int hp;
		hp = aleatorio.nextInt(10);
		
		while(hp == 0) 
			hp = aleatorio.nextInt(10);

		this.vida = hp + mod.getConstituicao();
	}

	public int getVida() {
		return vida;
	}

}