package ra�a;

public class AnaoColina extends Anao {
	
	private String nome = "An�o da Colina";
	
	public String getNome() {
		return nome;
	}

	public void addAnaoColina() {
		addAnao();
		setSabedoria(getSabedoria() + 1);
	}

	public String toString() {
		return getNome() + "%nSAB: +" + (getSabedoria() + 1);
	}

}
