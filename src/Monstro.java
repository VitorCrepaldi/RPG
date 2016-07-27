
public class Monstro extends Classe {
	//AGIL,FORCA,INTEL
	public Monstro(Personagem p){

		//ORDEM DE PREENCHIMENTO /AGILIDADE,FORCA,INTELIGENCIA
		//ALVO | TRUE = ALVO UNICO | FALSE = TOOS OS ALVOS
		//HABILIDADES DO MONSTRO
		//FALTA FAZER A PASSAGEM DOS PONTOS DE MAGIA
		
		agil = 2;
		forca = 6;
		intel = 0;
		habilidades = new Habilidade[3]; 
	}	
	
	public void setHabilidades(Personagem p){
		habilidades[0] = new Habilidade("Socar",0.4,0.8,0,5,true,0,0,0,p);
		habilidades[1] = new Habilidade("Chutar",0.5,1,0,8,true,0,0,0,p);
		habilidades[2] = new Habilidade("Grito Atordoante",0.2,0.4,0,6,true,0,0,0,p);
		
		//habilidades[2] = new Habilidade("Espada Flamejante",0.3,0.7,0.4,5,true,0,0,0);		
	}
	
	public int getTipo(){
		return 4;
	}
	
	public int getAgilidade(){
		return this.agil;
	}
	
	public int getForca(){
		return this.forca;
	}
	
	public int getInteligencia(){
		return this.intel;
	}
}
