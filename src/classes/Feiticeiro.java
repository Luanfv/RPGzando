package classes;

import java.util.Random;

import informa��es.Modificador;

public class Feiticeiro {

	Modificador mod = new Modificador();
	private int vida;
	
	public Feiticeiro() {
		Random aleatorio = new Random();
		int hp;
		hp = aleatorio.nextInt(6);
		
		while(hp == 0) 
			hp = aleatorio.nextInt(6);

		this.vida = hp + mod.getConstituicao();
	}

	public int getVida() {
		return vida;
	}
	
}
