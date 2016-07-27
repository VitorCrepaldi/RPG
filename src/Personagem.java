//TESTE

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
	
	//PONTO DE EXPERIÊNCIA----------------------------------------------------------------
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
	public void setClasse(int tipo){
		switch(tipo){
		case 1: this.classe = new Guerreiro();
				break;
		}
	}
}

