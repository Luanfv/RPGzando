package ra�a;

public class ElfoFloresta {
	
	Elfo elfo = new Elfo();
	private int forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "Elfo da Floresta";
	
	public ElfoFloresta() {

		this.forca = 0 + elfo.getForca();
		this.destreza = 0 + elfo.getDestreza();
		this.inteligencia = 0 + elfo.getInteligencia();
		this.sabedoria = 1 + elfo.getSabedoria();
		this.constituicao = 0 + elfo.getConstituicao();
		this.carisma = 0 + elfo.getCarisma();
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
		return "%nElfo da Floresta%nSAB: +" + getSabedoria();
	}

}
