

public class Guerreiro extends Classe {
	//AGIL,FORCA,INTEL
	public Guerreiro(/*Personagem p*/){
		
		//ANOTAÇÕES IMPORTANTES **************************************
			//ORDEM DE PREENCHIMENTO /AGILIDADE,FORCA,INTELIGENCIA
			//ALVO | TRUE = ALVO UNICO | FALSE = TOOS OS ALVOS
			//HABILIDADES DO GUERREIRO
			//FALTA FAZER A PASSAGEM DOS PONTOS DE MAGIA
		
		agil = 1;
		forca = 4;
		intel = 1;
		/*habilidades = new Habilidade[3]; //ALVO | TRUE = ALVO UNICO | FALSE = TOOS OS ALVOS
	    
		habilidades[0] = new Habilidade("Golpe de Espada",0.3,0.7,0,5,true,0,0,0, p);
		habilidades[1] = new Habilidade("Socar",0.1,0.3,0,5,true,0,0,0,p);
		habilidades[2] = new Habilidade("Espada Flamejante",0.1,0.3,0.4,7,true,0,0,0,p);*/
		
		//habilidades[2] = new Habilidade("Espada Flamejante",0.3,0.7,0.4,4,true,0,0,p);
			
	}
      //Batalha quem Chama
	    public void setHabilidades(Personagem p){
        habilidades = new Habilidade[3]; //ALVO | TRUE = ALVO UNICO | FALSE = TOOS OS ALVOS
	    
		habilidades[0] = new Habilidade("Golpe de Espada",0.3,0.7,0,5,true,0,0,0, p);
		habilidades[1] = new Habilidade("Socar",0.1,0.3,0,5,true,0,0,0,p);
		habilidades[2] = new Habilidade("Espada Flamejante",0.1,0.3,0.4,7,true,0,0,0,p);
		
		//habilidades[2] = new Habilidade("Espada Flamejante",0.3,0.7,0.4,4,true,0,0,p);
	}
	public int getTipo(){
		return 1;
	}
}
