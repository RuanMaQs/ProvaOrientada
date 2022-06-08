import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;




public class Cadastro {
	public static Usuarios usuarioLogado;
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		ArrayList<Usuarios> usuarios = new ArrayList();
		boolean rodando = true;
		
		
		while (rodando) {
			System.out.println("[1]fazer cadastro");
			System.out.println("[2] Fazer Login");
			System.out.println("[3] sair");
			System.out.print( "Digite uma opção: ");
			String opcao =scanner.nextLine();
			
			switch(opcao) {
			case"1":{
				System.out.println("======Cadastro=======");
				System.out.print("Digite o nome: ");
				String nome = scanner.nextLine();
				System.out.print("Digite a Senha: ");
				String senha = scanner.nextLine();
				
				Usuarios u = new Usuarios();
				u.setNome(nome);
				u.setSenha(senha);
				usuarios.add(u);
				System.out.println("Usuario cadastrado com sucesso");
				break;
				
				}
			case "2":{
				System.out.println("===========Login========");
				System.out.println("Digite o nome: ");
				String nome = scanner.nextLine();
				System.out.println("Digite a senha: ");
				String senha = scanner.nextLine();
				boolean loginSucesso = false;
				for(Usuarios u : usuarios) {
					String uNome = u.getNome();
					String uSenha = u.getSenha();
				boolean nomeConfere = nome.equals(uNome);
				boolean senhaConfere = senha.equals(uSenha);
					
					if(nomeConfere && senhaConfere) {
						System.out.println("Login feito com sucesso");
						loginSucesso = true;
						usuarioLogado = u;
						break;
					}
						
					
				}
				if(!loginSucesso) {
					System.out.println("Nome/Senha incorretos");
				}else {
					System.out.println("Login feito com seucesso");
					Menu();
				}
				break;
			}
			case"3":{
				rodando = false;
			System.out.println("Encerrando");
			break;
			}
			default:{
				break;
			}
			}
			
		}
		
		
	}
	public static void Menu() {
		ArrayList<Passagem> passagem = new ArrayList<Passagem>();
		
		Pais pais = new Pais();
		Compania compania = new Compania();
		Cidade cidade = new Cidade();
		boolean rodando = true;
		while(rodando) {
			System.out.println("[1] Digite a data do voou :");
			System.out.println("[2] Digite o nome do Pais :");
			System.out.println("[3] Digite a Compania aérea :");
			System.out.println("[4] Digite o nome da Cidade :");
			System.out.println("[5] Mostrar dados cadastrados :");
			String opcao = scanner.nextLine();
			
			switch(opcao) {
			
			case"1":
				Passagem passa = new Passagem();
				System.out.println("Digite a data");
				String upassagem = scanner.nextLine();
				break;
				
			case"2":
				
				System.out.println("Digite o nome do Pais");
				String upais = scanner.nextLine();
				pais.setNome(upais);
				//pais.setNome(JOptionPane.showInputDialog(null, "Digite o nome do País"));
				break;
				
			case "3":
				System.out.println("Digite a Compania");
				String ucompania = scanner.nextLine();
				compania.setNome(ucompania);
				//compania.setNome(JOptionPane.showInputDialog(null, "Digite o nome do Estado"));
				break;
				
			case"4":	
				System.out.println("Digite a Cidade");
				String ucidade = scanner.nextLine();
				cidade.setNome(ucidade);
				//cidade.setNome(JOptionPane.showInputDialog(null, "Digite o nome do Estado"));
			case"5":
				 JOptionPane.showMessageDialog(null,passagem.toString());
			break;
				
			
			
			
			
			
			}
			
		}
	}

}
