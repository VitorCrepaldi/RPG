
public class Mago extends Classe {

	public Mago(/*Personagem p*/){
		//ANOTAÇÕES IMPORTANTES**********************************
		//ORDEM DE PREENCHIMENTO /AGILIDADE,FORCA,INTELIGENCIA
		//ALVO | TRUE = ALVO UNICO | FALSE = TOOS OS ALVOS
		//HABILIDADES DO MAGO
		//FALTA FAZER A PASSAGEM DOS PONTOS DE MAGIA
		agil = 2;
		forca = 1;
		intel = 3;
		//habilidades = new Habilidade[3]; 
		
/*
		//		habilidades[0] = new Habilidade("Flecha Encantada",0.4,0.8,0,5,true,0,0,0);		
		habilidades[1] = new Habilidade("Atirar Flecha",0.5,0.3,0,4,true,0,0,0,p);
		habilidades[2] = new Habilidade("Socar",0.1,0.3,0,4,true,0,0,0,p);	
*/		
	}		
	public void setHabilidades(Personagem p){
        habilidades = new Habilidade[3]; //ALVO | TRUE = ALVO UNICO | FALSE = TOOS OS ALVOS
	    
		habilidades[0] = new Habilidade("Enfraquecer",0.2,0.3,0,5,true,0,0,0,p);		
		habilidades[1] = new Habilidade("Cura amigo",0,0,0.8*-1,4,true,0,0,0,p);
		habilidades[2] = new Habilidade("Socar",0.1,0.1,0,2,true,0,0,0,p);	
	}
	public int getTipo(){
		return 3;
	}
	public int getAgilidade(){
		return this.agil;
	}
	public  int getForca(){
		return this.forca;
	}
	public  int getInteligencia(){
		return this.intel;
	}
}
