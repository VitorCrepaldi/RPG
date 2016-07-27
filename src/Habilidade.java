
public class Habilidade {
	 float pontosMagia;
	 String nomeHabilidade;
	 float tempoDescanso;
	 float dano;
	 boolean alvo;
	 Personagem p;
	 float valorAgilM;
	 float valorForcaM;
	float valorIntelM;
	float valorIntel;
	float valorForca;
	float valorAgil;
	 
	//--------------------------CONSTRUTOR--------------------------------------------------
	public Habilidade(String nomeHabilidade,double valorAgil,double valorForca,double valorIntel,int tempoDescanso,
			boolean alvo,int valorAgilM,int valorForcaM, int valorIntelM, Personagem personagem){
		this.setNomeHabilidade(nomeHabilidade);
		this.setTempoDescanso(tempoDescanso);
	}
	//-----------------------FIM--------------------------------------------------------

	//-----------------------NOME DA HABILIDADE--------------------------
	private void setNomeHabilidade(String nomeHabilidade ){	
		this.nomeHabilidade = nomeHabilidade;
	}
	
	public String getNomeHabilidade(){
		return this.nomeHabilidade;
	}
	//--------------------------------FIM---------------------------------
	
	//--------------------------------DANO--------------------------------
	public int getDano(){
		int dano = (int)(p.getNivel()*Math.ceil(p.getAgil()*valorAgil+p.getForca()*valorForca+p.getIntel()*valorIntel));
		int skillEspada = (int) (p.getNivel()*Math.ceil(p.getAgil()*0.3+p.getForca()*0.7)); //FAZ O CALCULO DA ESPADA NORMAL
		int skillArco = (int) (p.getNivel()*Math.ceil(p.getAgil()*0.5+p.getForca()*0.3)); //FAZ O CALCULO DO ARCO NORMAL
		
		if(nomeHabilidade=="Espada Flamejante"){ //CONFERE SE O NOME DE HABILIDADE = ESPADA FLAMEJANTE
			dano=(int) (skillEspada+Math.ceil(p.getIntel()*0.4)); //DANO DA ESPADA NORMAL + CALCULO ESPADA FLAMEJANTE
			return dano;
		}else if(nomeHabilidade=="Atirar Flecha"){
			dano=(int) (skillArco+Math.ceil(p.getIntel()*0.4));//DANO DO ARCO NORMAL + CALCULO ATIRAR FLECHA
			return dano;
		}
		return dano;
		
	}
	//--------------------------------FIM---------------------------------
	
	//--------------------------------ALVO--------------------------------
	
	public boolean getAlvo(){
		return this.alvo;
	}
	//--------------------------------FIM---------------------------------
	
	//--------------------------------ALVO--------------------------------
	public int getPontosMagia(){
		int pontosMagia = (int)(p.getNivel()*Math.ceil(p.getAgil()*valorAgilM+p.getForca()*valorForcaM+p.getIntel()*valorIntelM));
		return pontosMagia;
	}
	//--------------------------------FIM---------------------------------
	
	//--------------------------------TEMPO DE DESCANSO--------------------------------
	private void setTempoDescanso(float tempoDescanso ){	
		this.tempoDescanso = tempoDescanso;
	}
	
	public float getTempoDescanso(){
		return this.tempoDescanso;
	}
	//--------------------------------FIM----------------------------------------------
}
