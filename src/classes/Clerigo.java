package classes;

import java.util.Random;

import informa��es.Modificador;

public class Clerigo {

	Modificador mod = new Modificador();
	private int vida;

	public Clerigo() {
		Random aleatorio = new Random();
		int hp;
		hp = aleatorio.nextInt(8);

		while (hp == 0)
			hp = aleatorio.nextInt(8);

		this.vida = hp + mod.getConstituicao();
	}

	public int getVida() {
		return vida;
	}

}