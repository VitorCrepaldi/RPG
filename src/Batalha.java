import java.util.Scanner;

public class Batalha {
	Scanner ler = new Scanner(System.in);
	
	int x,i;
	String nome;
	int tipo;
	
	//Personagem [] grupo = new Personagem[2];
	
		//grupo[0] = this.CriaPersonagem(); 
	
		public Batalha(){
			int i=0;
			
			Personagem [] grupo = new Personagem[2];
			for(i=0;i<grupo.length;i++){
				grupo[i] = CriaPersonagem();
				//ImprimeFigura(f[i]);
			}
			
			for(i=0;i<grupo.length;i++){
				System.out.printf("Nome: " + grupo[i].getNome() + " | Classe: " + grupo[i].getClasse());
				System.out.printf("\n *-----------------------------------------------------------------------* ");
				System.out.printf(" | Nível: " + grupo[i].getNivel() + " | Cash: " + grupo[i].getCash());
				System.out.printf(" | Vida: " + grupo[i].getPv() + " | Mana: " + grupo[i].getPm() + "\n");
				System.out.printf(" | Agilidade: " + grupo[i].getAgil() + " | Força: " + grupo[i].getForca());
				System.out.printf(" | Inteligência: " + grupo[i].getIntel() + "\n");
				System.out.printf("\n *-----------------------------------------------------------------------* ");
			}
			Personagem[] ini = new Personagem[2];
			//CRIA OS INIMIGOS
			System.out.printf("\nInimigos:\n");
			ini[0] = new Personagem("Sua Mãe",4);
			ini[1] = new Personagem("Regina Casé",4);
			for(i=0;i<ini.length;i++){
				System.out.printf("\n\n Nome: " + ini[i].getNome() + " | Classe: " + ini[i].getClasse());
				System.out.printf("\n *-----------------------------------------------------------------------* ");
				System.out.printf(" | \nNível: " + ini[i].getNivel() + " | Cash: " + ini[i].getCash());
				System.out.printf(" | \nVida: " + ini[i].getPv() + " | Mana: " + ini[i].getPm() + "\n");
				System.out.printf(" | \nAgilidade: " + ini[i].getAgil() + " | Força: " + ini[i].getForca());
				System.out.printf(" | \nInteligência: " + ini[i].getIntel() + "\n");
				System.out.printf("\n *-----------------------------------------------------------------------* ");
			}
			this.treta(grupo, ini);
		}
	
		
		//CRIA PERSONAGEM
		//LIMITE DE 2 PERSONAGENS(APENAS PARA TESTE)
		public Personagem CriaPersonagem(){
		ler = new Scanner(System.in);
		String nome = null;
		int tipo;
		//Personagem retorno = null;
			System.out.printf("Digite o nome do Personagem:");
			nome = ler.nextLine();
			System.out.printf("\n *---------------------------------------* ");
			System.out.printf("\n |                CLASSES                | ");
			System.out.printf("\n *---------------------------------------* ");
			System.out.printf("\n |    [1]. GUERREIRO                     | ");
			System.out.printf("\n |    [2]. ARQUEIRO                      | ");
			System.out.printf("\n |    [3]. MAGO                          | ");
			System.out.printf("\n |    [4]. MONSTRO                       | ");
			System.out.printf("\n *---------------------------------------* ");
			System.out.printf("\n  Digite a classe do seu Personagem: ");
			tipo = ler.nextInt();
			System.out.print("\n\n");
			Personagem p = new Personagem(nome,tipo);
			p.setNome(nome);
			p.setClasse(tipo);
		//	grupo[x]= new Personagem(nome,tipo);
			return p;
		}
		
		//ESCOLHE QUEM VAI ATACAR PRIMEIRO
		public Personagem escolheAtacante(Personagem[] grupo, Personagem[] ini){
			Personagem ax = null;
			for(Personagem p: grupo){
				if(p.getTempoDescanso() == 0 && ax == null){
					ax = p;
				}else if(p.getTempoDescanso() == 0){
					int sorte = (int)(Math.ceil(Math.random()*100)%2);
					if(sorte == 0){
						ax = p;
					}
				}
			}
			for(Personagem p: ini){
				if(p.getTempoDescanso() == 0 && ax == null){
					ax = p;
				}else if(p.getTempoDescanso() == 0){
					int sorte = (int)(Math.ceil(Math.random()*100)%2);
					if(sorte == 0){
						ax = p;
					}
				}
			}
			return ax;
		}
		
		//MODULO DE BATALHA
		public void treta(Personagem[] grupo, Personagem[] ini){
			Personagem[] atacados;
			Personagem atacante;
			System.out.printf("Treta iniciada!");
			while(verificaPV(grupo) > 0 && verificaPV(ini) > 0){
				atacante = this.escolheAtacante(grupo, ini);
				if(atacante != null){
					System.out.printf("O atacante é " + atacante.getNome());
					if(verificaAtacante(grupo, atacante) == true){
						atacados = ini;
					}else{
						atacados = grupo;
					}
					ler.nextInt();
					
				}
			}
		}
		
		//PEGA OS PONTOS DE VIDA DO PERSONAGEM
		public int verificaPV(Personagem[] grupo){
			int i =0;
			for(Personagem p: grupo){
				i += p.getPv();
			}
			return i;
		}
		
		//PEGA OS PONTOS DE MAGIA DO PERSONAGEM
		public int verificaPM(Personagem[] grupo){
			int j =0;
			for(Personagem p: grupo){
				j += p.getPm();
			}
			return j;
		}

		
		
		public boolean verificaAtacante(Personagem[] grupo,Personagem atacante){
			boolean retorno = false;
			for(Personagem p: grupo){
				if(p == atacante){
					retorno = true;
				}
			}
			return retorno;
		}
		

	//for(x=0;x<2;x++){
	//LIMITE DE 2 PERSONAGENS(SO PARA FAZER TESTE,DEPOIS QUERIA ADICIONAR UMA OPCAO PARA QUE O USUARIO POSSA
	//	ESCOLHER QUANTOS PERSONAGENS QUER CRIAR //VITOR)
	//PEDE PARA DIGITAR O NOME DO PERSONAGEM
	//System.out.printf("\nDigite o nome do Personagem : ");
	 //   nome = ler.next();
	
	//PEDE PARA DIGITAR A CLASSE DESEJADA DO PERSONAGEM    
	//System.out.printf("\nDigite a classe do seu Personagem:\n ");
//	System.out.printf("\n[1] - GUERREIRO\n ");
	//System.out.printf("\n[2] - ARQUEIRO\n ");
//	System.out.printf("\n[3] - MAGO\n ");
//	System.out.printf("\n[4] - MONSTRO\n ");
//	tipo = ler.nextInt();
//	System.out.print("\n\n");
	
		
//	Personagem p = new Personagem(nome,tipo);
//	p.setNome(nome);
//	p.setClasse(tipo);
//	grupo[x] = new Personagem(nome,tipo);
	
//	}
	
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
		 
		}
