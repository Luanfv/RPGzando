package ra�a;

public class ElfoAlto {
	
	Elfo elfo = new Elfo();
	private int hp, forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	
	
	public ElfoAlto() {

		this.hp = 0 + elfo.getHp();
		this.forca = 0 + elfo.getForca();
		this.destreza = 0 + elfo.getDestreza();
		this.inteligencia = 1 + elfo.getInteligencia();
		this.sabedoria = 0 + elfo.getSabedoria();
		this.constituicao = 0 + elfo.getConstituicao();
		this.carisma = 0 + elfo.getCarisma();
	}

	public int getHp() {
		return hp;
	}

	private void setHp(int hp) {
		this.hp = hp;
	}

	public int getForca() {
		return forca;
	}

	private void setForca(int forca) {
		this.forca = forca;
	}

	public int getDestreza() {
		return destreza;
	}

	private void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	private void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getSabedoria() {
		return sabedoria;
	}

	private void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}

	public int getConstituicao() {
		return constituicao;
	}

	private void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}

	public int getCarisma() {
		return carisma;
	}

	private void setCarisma(int carisma) {
		this.carisma = carisma;
	}
	
	public String toString() {
		return "%nElfo Alto%nINT: +" + getInteligencia();
	}

}
