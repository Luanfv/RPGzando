package classes;

import java.util.Random;

import informa��es.Modificador;

public class Mago {

	private int vida;
	private String nome = "Mago";
	
	public Mago() {
		Random aleatorio = new Random();
		int hp;
		hp = aleatorio.nextInt(7);
		
		while(hp < 1)  
			hp = aleatorio.nextInt(7);

		this.vida = hp;
	}

	public int getVida() {
		return vida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Classe: "
				+ getNome()
				+ "%nHP: 1D6%n";
	}
}
