
public class Personagem {
	private String nome, descricao;
	private int nivel, cash, pe, pv, pm;
	private Classe classe;
	
	public Personagem(String nome, int tipo){
		this.setNome(nome);
		this.setDescricao(descricao);
		this.nivel = 1;
		this.cash = 0;
		this.setClasse(tipo);
	}
	
	//NOME----------------------------------------------------------------
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	//---------------------------------------------------------------------
	
	//DESCRICAO----------------------------------------------------------------
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	//---------------------------------------------------------------------
	
	//NIVEL----------------------------------------------------------------
	public void setNivel(int nivel){
		this.nivel = nivel;
	}
	
	public int getNivel(){
		return this.nivel;
	}
	//---------------------------------------------------------------------
	
	//MOEDA----------------------------------------------------------------
	public void setCash(int cash){
		this.cash = cash;
	}

	public int getCash(){
		return this.cash;
	}
	//---------------------------------------------------------------------
	
	//PONTO DE EXPERIENCIA----------------------------------------------------------------
	public void setPe(int pe){
		this.pe = pe;
	}
	
	public int getPe(){
		return pe;
	}
	//---------------------------------------------------------------------
	
	//PONTO DE VIDA----------------------------------------------------------------
	public void setPv(int pv){
		this.pv = pv;
	}
	
	public int getPv(){
		return pv;
	}
	//---------------------------------------------------------------------
	
	//PONTO DE MANA----------------------------------------------------------------
	public void setPm(int pm){
		this.pm = pm;
	}
	
	public int getPm(){
		return pm;
	}
	//----------------------------------------------------------------------
	
	//DEFINE A CLASSE QUE O PERSONAGEM VAI SER.
	public void setClasse(int tipo){
		switch(tipo){
			//1 = GUERREIRO
		case 1: this.classe = new Guerreiro();
				break;
			//2 = ARQUEIRO
		case 2: this.classe = new Arqueiro();
				break;
			//3 = MAGO
		case 3: this.classe = new Mago();
				break;
			//4 = MONSTRO				
		case 4: this.classe = new Monstro();
				break;
		}
	}
	//PEGA AGILIDADE
	public int getAgil(){
		return this.getNivel() * classe.getAgilidade();
	}
	//PEGA FORCA
	public int getForca(){
		return this.getNivel() * classe.getForca();
	}
	//PEGA INTELIGENCIA
	public int getIntel(){
		return this.getNivel() * classe.getInteligencia();
	}
}

