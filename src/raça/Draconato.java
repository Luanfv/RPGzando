package ra�a;

public class Draconato {
	
	private int hp, forca, destreza, inteligencia, sabedoria, constituicao, carisma;
	private String nome = "Draconato";
	
	public Draconato() {
	
		this.hp = 0;
		this.forca = 2;
		this.destreza = 0;
		this.inteligencia = 0;
		this.sabedoria = 0;
		this.constituicao = 0;
		this.carisma = 1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		return "Draconato%nFOR: +" + getForca() + "%nCAR: +" + getCarisma();
	}

}
