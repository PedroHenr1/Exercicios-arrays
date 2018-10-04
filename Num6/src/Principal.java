import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int chave;
		String continuar="s",nome;
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Scanner pegar = new Scanner(System.in);
		
		while(continuar.equalsIgnoreCase("s")){
			
				Usuario u = new Usuario();
				
				System.out.println("Digite o nome do usuario: ");
				nome = pegar.nextLine();
				System.out.println("Digite a chave unica do usuario: ");
				chave = Integer.parseInt(pegar.nextLine());

				u.setNome(nome);
				u.setChave(chave);
				
				
				if(lista.size() == 0) {
					System.out.println("pass1");
					lista.add(u);
				} else {
					for(int i=0;i< lista.size();i++){
						if(lista.get(i).getChave() == chave) {
							System.out.println("Essa chave ja esta sendo usada por outro usuario.");
							break;
						}else {
							lista.add(u);
							System.out.println("pass2");
							break;
						}
					}
				}
				
				
				System.out.println(lista.size());
				System.out.println("Deseja adicionar outro usuario?(s/n): ");
				continuar = pegar.nextLine();
			
				
			
		}
		for(int i=0; i<lista.size(); i++){   
            System.out.println("\nUsuario " + (i+1) + ": " + "\nNome: " + lista.get(i).getNome() + "\nChave:" + lista.get(i).getChave());   
        }   
	}
}
