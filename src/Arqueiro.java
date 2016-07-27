
public class Arqueiro extends Classe {	
	//AGIL,FORCA,INTEL
	public Arqueiro(/*Personagem p*/){
		
		//ANOTAÇÕES IMPORTANTES**********************************
		//ORDEM DE PREENCHIMENTO /AGILIDADE,FORCA,INTELIGENCIA
		//ALVO | TRUE = ALVO UNICO | FALSE = TOOS OS ALVOS
		//HABILIDADES DO ARQUEIRO
		//FALTA FAZER A PASSAGEM DOS PONTOS DE MAGIA
			
			agil = 3;
			forca = 1;
			intel = 2;
			//habilidades = new Habilidade[3];
/*			
//			habilidades[0] = new Habilidade("Flecha Encantada",0.4,0.8,0,5,true,0,0,0);		
			habilidades[1] = new Habilidade("Atirar Flecha",0.5,0.3,0,4,true,0,0,0,p);
			habilidades[2] = new Habilidade("Socar",0.1,0.3,0,4,true,0,0,0,p);
			*/
				
		}
	public void setHabilidades(Personagem p){
        habilidades = new Habilidade[3]; //ALVO | TRUE = ALVO UNICO | FALSE = TOOS OS ALVOS
	    
		habilidades[0] = new Habilidade("Flecha Encantada",0.4,0.8,0,5,true,0,0,0,p);		
		habilidades[1] = new Habilidade("Atirar Flecha",0.5,0.3,0,4,true,0,0,0,p);
		habilidades[2] = new Habilidade("Socar",0.1,0.3,0,4,true,0,0,0,p);	
	}
	public int getTipo(){
		return 2;
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
