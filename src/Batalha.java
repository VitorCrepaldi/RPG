import java.util.Scanner;

public class Batalha {
	Scanner ler = new Scanner(System.in);
	
	int x;
	String nome;
	int tipo;
	float nota1,nota2;
	
	Personagem [] grupo = new Personagem[4];
	
	for(x=0;x<2;x++){
	//PEDE PARA DIGITAR O NOME DO PERSONAGEM
	System.out.printf("\nDigite o nome do Personagem : ");
	    nome = ler.next();
	
	//PEDE PARA DIGITAR A CLASSE DESEJADA DO PERSONAGEM    
	System.out.printf("\nDigite a classe do seu Personagem:\n ");
	System.out.printf("\n[1] - GUERREIRO\n ");
	System.out.printf("\n[2] - ARQUEIRO\n ");
	System.out.printf("\n[3] - MAGO\n ");
	System.out.printf("\n[4] - MONSTRO\n ");
	tipo = ler.nextInt();
	System.out.print("\n\n");
	
		
	Personagem p = new Personagem(nome,tipo);
	p.setNome(nome);
	p.setClasse(tipo);
	
			}
	}
	

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
