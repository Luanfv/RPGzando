package informa��es;


public final class Personagem extends Proficiencia{
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString(){
		return "Nome: "
				+ getNome()
				+ "%nNivel: "
				+ getNivel()
				+ "%nRa�a: "
				+ getRacaNome()
				+ "%nClasse: "
				+ getClasseNome()
				+ "%nHP: "
				+ getHp()
				+ "%nFor�a: "
				+ getForca()
				+ " +"
				+ getMforca()
				+ "%nDestreza: "
				+ getDestreza()
				+ " +"
				+ getMdestreza()
				+ "%nConstitui��o: "
				+ getConstituicao()
				+ " +"
				+ getMconstituicao()
				+ "%nInteligencia: "
				+ getInteligencia()
				+ " +"
				+ getMinteligencia()
				+ "%nSabedoria: "
				+ getSabedoria()
				+ " +"
				+ getMsabedoria()
				+ "%nCarisma: "
				+ getCarisma()
				+ " +"
				+ getMcarisma();
	}
	
	

	

}