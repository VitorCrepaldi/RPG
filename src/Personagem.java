
public class Personagem {
	private String nome, descricao;
	private int nivel, cash, pe;
	float pv, pm;
	private Classe classe;
	
	public Personagem(String nome, int tipo){
		this.setNome(nome);
		this.setDescricao(descricao);
		this.nivel = 1;
		this.cash = 0;
		this.setClasse(tipo);
		this.setPvMax();
		this.setPmMax();
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
	
	public float getPv(){
		return pv;
	}
	//---------------------------------------------------------------------
	
	//PONTO DE MANA----------------------------------------------------------------
	public void setPm(int pm){
		this.pm = pm;
	}
	
	public float getPm(){
		return pm;
	}
	//---------------------------------------------------------------------
	
	//CLASSE----------------------------------------------------------------------
	public void setClasse(int tipo){
		switch(tipo){
		case 1: this.classe = new Guerreiro();
				break;
		case 2: this.classe = new Arqueiro();
				break;
		case 3: this.classe = new Mago();
				break;
		case 4: this.classe = new Monstro();
				break;
		}
	}
	//---------------------------------------------------------------------
	
	//AGILIDADE----------------------------------------------------------------
	public int getAgil(){
		return this.getNivel() * classe.getAgilidade();
	}
	//---------------------------------------------------------------------
	
	//FORCA----------------------------------------------------------------
	public int getForca(){
		return this.getNivel() * classe.getForca();
	}
	//---------------------------------------------------------------------
	
	//INTELIGENCIA----------------------------------------------------------------
	public int getIntel(){
		return this.getNivel() * classe.getInteligencia();
	}
	//---------------------------------------------------------------------
	
	//PONTO DE VIDA MAXIMO----------------------------------------------------------------
	public void setPvMax(){
		this.pv = this.getPvMax();
	}
	
	public float getPvMax(){
		return this.nivel * this.getForca() + (this.nivel * (this.getAgil()/2));
	}
	//---------------------------------------------------------------------
	
	//PONTO DE MAGIA MAXIMO----------------------------------------------------------------
	public void setPmMax(){
		this.pv = this.getPmMax();
	}
	
	public float getPmMax(){
		return this.nivel * this.getIntel() + (this.getForca() *(this.getAgil()/3));
	}
	//---------------------------------------------------------------------
	
	//PONTO DE VIDA SER RECUPERADO----------------------------------------------------------------
	public void setPvRec(){
		this.pv += (int) (Math.ceil((0.1*this.getForca()+this.nivel*0.1)));
		if(this.pv > this.getPvMax()){
			this.pv = this.getPvMax();
		}
	}
	//---------------------------------------------------------------------
	
	//PONTO DE MAGIA A SER RECUPERADO----------------------------------------------------------------
	public void setPmRec(){
		this.pm += (int)(Math.ceil((0.1*this.getIntel()+this.nivel*0.05)));
		if(this.pm > this.getPmMax()){
			this.pm = this.getPmMax();
		}
	}
	//---------------------------------------------------------------------
	
	//CHAMADO QUANDO UM INIMIGO MORRE---------------------------------------------------
	public void setCashAdv(Personagem nivelAdv){
		this.cash += nivelAdv.nivel * 10;
	}
	//---------------------------------------------------------------------
}

