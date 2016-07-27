import java.util.Scanner;

public class Batalha {
	public void Movimento(Personagem p){
		Scanner scan = new Scanner(System.in);
		int resp,r;
		
		System.out.printf("\n 1. Atacar |");
		System.out.printf(" "+p.getNome()+"\n "+p.getDescricao());
		System.out.printf("\n 2. Item	 |");
		 resp=scan.nextInt();
		
		switch(resp){
		case 1:
			System.out.printf("\n "+p.getHabilidade);
			 r=scan.nextInt();
			 switch(r){
			 case 1:
				 break;
			 case 2:
				 break;
			 case 3:
				 break;
			 }
			break;
		case 2:
			System.out.printf("\n "+p.getItem);
			
			break;
		}
	}
}
