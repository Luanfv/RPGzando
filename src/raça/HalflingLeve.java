package ra�a;

public class HalflingLeve extends Halfling {

	private String nome = "Halfling P�s Leves";

	public String getNome(){
		return nome;
	}
	
	public void addHalflingLeve() {
		addHalfling();
		setCarisma(getCarisma() + 1);
	}

	public String toString() {
		return getNome() + "%nCAR: +" + (getCarisma() + 1);
	}
}
