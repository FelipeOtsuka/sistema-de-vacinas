package vacina;

import java.util.Scanner;
import vacina.vac1;
import vacina.U1;

public class vacina {

		public static void main(String[] args) {
		    System.out.println("Sistema UNICSUL - COVID 19");

		    int opt = 0;
		    vac1 vac1 = new vac1(); 
			U1 U1= new U1();
		    String nome,nome1;
		    int lote,idade;
		    int quantidade,cpf;
		    Scanner ler = new Scanner(System.in);

		    System.out.println("Controle de vacinas COVID-19!");
		    System.out.println("Liderado por Juliana Melo e Felipe Otsuka");
		    System.out.println("Alunos participantes: Juliana Melo de Assis, RGM: 25815474 | Felipe Sim�es Otsuka, RGM: 25461354 | Rafael Silva Vieira, RGM: 27891135 | Ricardo da Silva Alves, RGM:28200284");
		    System.out.println("\n\n\n");

		    do{
		        System.out.println("Escolha a op��o desejada");
		        System.out.println("1-Cadastro de vacinas");
		        System.out.println("2-Consulta ao cadastro de vacina");
		        System.out.println("3-Altera��es ao cadastro de vacina");
				System.out.println("4-Cadastro de usuário");
				System.out.println("5-consulta e modificação ao cadastro de usuário");
		        System.out.println("9-sair");
		        opt = ler.nextInt();

		        switch(opt){
		        case 1: //cadastro vac
		            System.out.println("Controle de vacinas COVID-19!");   
		            System.out.println("Insira o nome da vacina");
		            nome =  ler.next();
		            vac1.setNome(nome);

		            System.out.println("Insira o lote");
		            lote =  ler.nextInt();
		            vac1.setLote(lote);

		            System.out.println("Insira sua quantidade");
		            quantidade = ler.nextInt();
		            vac1.setQuantidade(quantidade);

		            System.out.println("Cadatro efetuado!");
		            System.out.println("Voltando ao menu anterior \n\n");
		        break;

		        
		        case 2: //consulta ao cadastro

		            System.out.println("Cadastro de vacina");
						    System.out.println("Informe seu lote:");
						    lote = ler.nextInt();
						    System.out.println("Informe sua quantidade:");
						    quantidade = ler.nextInt(); 
		            System.out.println("Informe seu nome :");
		            nome = ler.next();

		           if(lote== vac1.getLote() && nome.equals(vac1.getNome())){
							    System.out.println("Acesso liberado!");
							   do{
		                System.out.println("Selecione a op��o desejada");
		                System.out.println("1-Modifica��o de uma dose");
		                System.out.println("2-Exclus�o de cadastro uma dose");
		                System.out.println("3-Exibir vacina registrada");
		                System.out.println("0-Voltar ao menu anterior");

		                opt = ler.nextInt();

		                switch(opt){
		                case 1: //modificar cadastro                 
		                  System.out.println("Exclusao de dados da vacina");
		                  System.out.println("Informe seu lote:");
		                  lote = ler.nextInt();
		                  System.out.println("Informe sua quantidade:");
		                  quantidade = ler.nextInt(); 
		                  System.out.println("Informe seu nome :");
		                  nome = ler.next();
		                  System.out.println("Insira 1 para sair");
		                  opt = ler.nextInt();
		    
		                  if(lote== vac1.getLote() && nome.equals(vac1.getNome())){
		                   do{
		                    System.out.println("Insira o nome da vacina");
		                     nome =  ler.next();
		                     vac1.setNome(nome);
		    
		                     System.out.println("Insira o lote");
		                     lote =  ler.nextInt();
		                     vac1.setLote(lote);
		    
		                     System.out.println("Insira sua quantidade");
		                     quantidade = ler.nextInt();
		                     vac1.setQuantidade(quantidade);
		                     }while (opt != 1);
		                    }
		                break; 

		                case 2: //exclusao de itens
		                  System.out.println("Informe seu lote:");
		                  lote = ler.nextInt();
		                  System.out.println("Informe sua quantidade:");
		                  quantidade = ler.nextInt(); 
		                  System.out.println("Informe seu nome :");
		                  nome = ler.next();

		                  if(lote == vac1.getLote() && nome.equals(vac1.getNome())){
		                    do{
		                      System.out.println("1-Exclus�o do nome da vacina");
		                      System.out.println("2-Exclus�o do lote da vacina");
		                      System.out.println("3-Exclus�o da quantidade da vacina");
		                      System.out.println("4-N�o excluir nada");
		                    opt = ler.nextInt();

		                       switch(opt){
		                         case 1:
		                           nome = "";
		                           vac1.setNome(nome);
		                         break;
		                         case 2:
		                           lote = 0;
		                            vac1.setLote(lote);
		                         break;
		                         case 3:
		                            quantidade = 0;
		                            vac1.setQuantidade(quantidade);
		                         break;
		                        }
		                      }while (opt != 4);
		                    }
		                 break;

		                 case 3: //consulta ao cadastro

		                  System.out.println("Cadastro de vacina");
						          System.out.println("Informe seu lote:");
						          lote = ler.nextInt();
						          System.out.println("Informe sua quantidade:");
						          quantidade = ler.nextInt(); 
		                  System.out.println("Informe seu nome :");
		                  nome = ler.next();
		                    if(lote == vac1.getLote() && nome.equals(vac1.getNome())){
							            System.out.println("Acesso liberado!");
							            do{
		                          System.out.println("A vacina:" + vac1.getNome());
		                          System.out.println("do lote:" + vac1.getLote());
		                          System.out.println("E possu�:" + vac1.getQuantidade());
		                          System.out.println("0-para sair");
		                          opt = ler.nextInt();

		                        }while (opt != 0);
		                    }
		                 break;

				case 4: //cadastro vac
					System.out.println("Controle de vacinas COVID-19!");   
					System.out.println("Insira o nome do usuário");
					nome1 =  ler.next();
					U1.setNome1(nome1);
	 
					System.out.println("Insira o cpf");
					cpf =  ler.nextInt();
					U1.setCpf(cpf);
	 
					System.out.println("Insira sua idade");
					idade = ler.nextInt();
					U1.setIdade(idade);
	 
					System.out.println("Cadatro efetuado!");
					System.out.println("Voltando ao menu anterior \n\n");
				break;

				case 5: //consulta ao cadastro

		            System.out.println("Cadastro de usuário");
						    System.out.println("Informe seu cpf:");
						    cpf = ler.nextInt();
						    System.out.println("Informe sua idade:");
						    idade = ler.nextInt(); 
		            System.out.println("Informe seu nome :");
		            nome1 = ler.next();

		           if(cpf == U1.getCpf() && nome1.equals(U1.getNome1())){
							    System.out.println("Acesso liberado!");
							   do{
		                System.out.println("Selecione a op��o desejada");
		                System.out.println("1-Modifica��o de um usuário");
		                System.out.println("2-Exclus�o de cadastro um usuário");
		                System.out.println("3-Exibir usuário registrado");
		                System.out.println("0-Voltar ao menu anterior");

		                opt = ler.nextInt();

		                switch(opt){
		                case 1: //modificar cadastro                 
		                  System.out.println("Modificação de dados do usuário");
		                  System.out.println("Informe seu cpf:");
		                  cpf = ler.nextInt();
		                  System.out.println("Informe sua idade:");
		                  idade = ler.nextInt(); 
		                  System.out.println("Informe seu nome :");
		                  nome1 = ler.next();
		                  System.out.println("Insira 1 para sair");
		                  opt = ler.nextInt();
		    
		                  if(cpf== U1.getCpf() && nome1.equals(U1.getNome1())){
		                   do{
		                    System.out.println("Insira o nome do usuario");
		                     nome1 =  ler.next();
		                     U1.setNome1(nome1);
		    
		                     System.out.println("Insira o cpf");
		                     cpf =  ler.nextInt();
		                     U1.setLote(cpf);
		    
		                     System.out.println("Insira sua idade");
		                     idade = ler.nextInt();
		                     U1.setIdade(idade);
		                     }while (opt != 1);
		                    }
		                break; 

		                case 2: //exclusao de itens
		                  System.out.println("Informe seu cpf:");
		                  cpf = ler.nextInt();
		                  System.out.println("Informe sua idade:");
		                  idade = ler.nextInt(); 
		                  System.out.println("Informe seu nome :");
		                  nome1 = ler.next();

		                  if(cpf == U1.getCpf() && nome1.equals(U1.getNome1())){
		                    do{
		                      System.out.println("1-Exclus�o do nome do usuario");
		                      System.out.println("2-Exclus�o do cpf do usuario");
		                      System.out.println("3-Exclus�o da idade do usuario");
		                      System.out.println("4-N�o excluir nada");
		                    opt = ler.nextInt();

		                       switch(opt){
		                         case 1:
		                           nome1 = "";
		                           U1.setNome1(nome1);
		                         break;
		                         case 2:
		                           cpf = 0;
		                            U1.setCpf(cpf);
		                         break;
		                         case 3:
		                            idade = 0;
		                            U1.setIdade(idade);
		                         break;
		                        }
		                      }while (opt != 4);
		                    }
		                 break;

		                 case 3: //consulta ao cadastro

		                  System.out.println("Cadastro de usuario");
						          System.out.println("Informe seu cpf:");
						          cpf = ler.nextInt();
						          System.out.println("Informe sua idade:");
						          idade = ler.nextInt(); 
		                  System.out.println("Informe seu nome :");
		                  nome1 = ler.next();
		                    if(cpf == U1.getCpf() && nome1.equals(U1.getNome1())){
							            System.out.println("Acesso liberado!");
							            do{
		                          System.out.println("O(A) usuario:" + U1.getNome1());
		                          System.out.println("do cpf:" + U1.getCpf());
		                          System.out.println("E possu�:" + util.getIdade(), "anos de vida");
		                          System.out.println("0-para sair");
		                          opt = ler.nextInt();

		                        }while (opt != 0);
		                    }
		                 break;

		                 case 0://voltar
									    System.out.println("Voltando ao menu anterior");
								     break;
								     default: System.out.println("Op��o invalida!");
								     }
				
		              }while(opt!=0);
							}
							break;
					
					case 9://finaliza
						System.out.println("Finalizando o programa");
					break;
					
					default: System.out.println("Op��o invalida!");
					}
						}
						}while(opt!=0);
	}
}while(opt!=9);
		}
	}


