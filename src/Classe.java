

public abstract class Classe {
	protected String nome;
	protected int agil,forca,intel;
	Habilidade[] habilidades;

	public abstract int getAgilidade();
	public abstract int getForca();
	public abstract int getInteligencia();
	
	/*public abstract int getInteligencia();
	public abstract int getAgilidade();
	public abstract int getForca();
	public abstract String getDescClasse();*/
	public Classe(){
		this.setNome(nome);
	}
	
	public void setNome(String nome){
		if(!nome.trim().isEmpty()){
			this.nome = nome;
		}else{
			this.nome = "Guerreiro";
		}
	}
	
	public String getNome(){
		return this.nome;
	}
	
	
}
