
public class Recuperador {
	
	public int aguaVida(){
		int pre�o=10,upv=0;
		upv=personagem.pv*0.2;
		return upv;
	}
	
	public int hidromelVida(){
		int pre�o=35,upv=0;
		upv=personagem.pv*0.8;
		return upv;
	}
	
	public int aguaMagica(){
		int pre�o=10,upm=0;
		upm=personagem.pm*0.3;
		return upm;
	}

	public int hidromelMagica(){
		int pre�o=35,upm=0;
		upm=personagem.pm*1;
		return upm;
	}
}
