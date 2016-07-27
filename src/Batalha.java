
	import java.util.Scanner;
	
	public class Batalha {
		private String nomeBatalha;
		Scanner ler = new Scanner(System.in);
			public Batalha(){
				this.setNome();
			}

		//SORTEIO DA MOEDA
		//int sorte = (int) Math.ceil((Math.random()*100))%2; //CALCULA RANDOMICAMENTE ENTRE 0 E 1
		//if(sorte==0){
		//	System.out.printf("\n CARA! VEZ DO "+p.noNome); //NOME DO ALIADO
		//}else if(sorte==1){
		//	System.out.printf("\n COROA! VEZ DO "+p.noNome); //NOME DO INIMIGO
		//}

			public void inicio(){
				int i=0;
				
				Personagem [] grupo = new Personagem[2];
				for(i=0;i<grupo.length;i++){
					grupo[i] = CriaPersonagem();
				}
			}		
			
			
			public Personagem CriaPersonagem(){
			ler = new Scanner(System.in);
			String nome = null;
			int tipo;
			Personagem retorno = null;
			
				System.out.printf("\n *-------------------------------------*");
				System.out.printf("\n |		      CLASSES               |");
				System.out.printf("\n *-------------------------------------*");
				System.out.printf("\n |   [1] - GUERREIRO		    |");
				System.out.printf("\n |   [2] - ARQUEIRO		    |");
				System.out.printf("\n |   [3] - MAGO			    |");
				System.out.printf("\n |   [4] - MONSTRO			    |");
				System.out.printf("\n *-------------------------------------*");
				System.out.printf("\n  Digite a classe do seu Personagem: ");
				tipo = ler.nextInt();
				System.out.print("\n\n");
				
				Personagem p = new Personagem(nome,tipo);
				p.setNome(nome);
				p.setClasse(tipo);
				return p;
			}


		//for(x=0;x<2;x++){
		//LIMITE DE 2 PERSONAGENS(SO PARA FAZER TESTE,DEPOIS QUERIA ADICIONAR UMA OPCAO PARA QUE O USUARIO POSSA
		//	ESCOLHER QUANTOS PERSONAGENS QUER CRIAR //VITOR)
		//PEDE PARA DIGITAR O NOME DO PERSONAGEM
		//System.out.printf("\nDigite o nome do Personagem : ");
		 //   nome = ler.next();
		
		//PEDE PARA DIGITAR A CLASSE DESEJADA DO PERSONAGEM    
		//System.out.printf("\nDigite a classe do seu Personagem:\n ");
//		System.out.printf("\n[1] - GUERREIRO\n ");
		//System.out.printf("\n[2] - ARQUEIRO\n ");
//		System.out.printf("\n[3] - MAGO\n ");
//		System.out.printf("\n[4] - MONSTRO\n ");
//		tipo = ler.nextInt();
//		System.out.print("\n\n");
		
			
//		Personagem p = new Personagem(nome,tipo);
//		p.setNome(nome);
//		p.setClasse(tipo);
//		grupo[x] = new Personagem(nome,tipo);
		
//		}
		
		/*public void Movimento(Personagem per){
			Scanner scan = new Scanner(System.in);
			int resp,r;
			
			System.out.printf("\n 1. Atacar |");
			System.out.printf(" "+p.getNome()+"\n "+p.getDescricao());
			
			//System.out.printf("\n 2. Item	 |");
			//resp=scan.nextInt();
			
			/*switch(resp){
			case 1:
				System.out.printf("\n "+p.getHabilidade);
				 r=scan.nextInt();		 
				 case 1:
					 break;
				 case 2:
					 break;
				 case 3:
					 break;
				break;
			case 2:
				System.out.printf("\n "+p.getItem);
				
				break;
				}*/
			 public void setNome(){
				 String nome;
				 System.out.println("Digite o nome da Batalha");
				 nome = ler.nextLine();
				 this.nomeBatalha = nome;
				 ler.nextLine();
			 }
			 
			}


