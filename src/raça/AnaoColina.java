package ra�a;

public class AnaoColina {
	
	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "An�o da Colina";
	Anao anao = new Anao();

	public AnaoColina() {

		this.forca += 0 + anao.getForca();
		this.destreza += 0 + anao.getDestreza();
		this.inteligencia += 0 + anao.getInteligencia();
		this.sabedoria += 1 + anao.getSabedoria();
		this.constituicao += 0 + anao.getConstituicao();
		this.carisma += 0 + anao.getCarisma();
	}
	
	public String getNome(){
		return nome;
	}

	public int getForca() {
		return forca;
	}

	public int getDestreza() {
		return destreza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public int getSabedoria() {
		return sabedoria;
	}

	public int getConstituicao() {
		return constituicao;
	}

	public int getCarisma() {
		return carisma;
	}

	
	public String toString() {
		return "%nAn�o da Colina%nSAB: +" + getSabedoria();
	}

}
