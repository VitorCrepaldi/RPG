
public class Mago extends Classe {

	public Mago(Personagem p){
		//ANOTA��ES IMPORTANTES**********************************
		//ORDEM DE PREENCHIMENTO /AGILIDADE,FORCA,INTELIGENCIA
		//ALVO | TRUE = ALVO UNICO | FALSE = TOOS OS ALVOS
		//HABILIDADES DO MAGO
		//FALTA FAZER A PASSAGEM DOS PONTOS DE MAGIA
		agil = 2;
		forca = 1;
		intel = 3;
		habilidades = new Habilidade[3]; 
		
//		habilidades[0] = new Habilidade("Flecha Encantada",0.4,0.8,0,5,true,0,0,0);		
		habilidades[1] = new Habilidade("Atirar Flecha",0.5,0.3,0,4,true,0,0,0,p);
		habilidades[2] = new Habilidade("Socar",0.1,0.3,0,4,true,0,0,0,p);			
	}		
}
