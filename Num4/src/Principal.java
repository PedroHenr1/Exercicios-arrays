import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String[] nomes = new String[10];
		Scanner pegar = new Scanner(System.in);
		
		
		for(int i=0;i < nomes.length;i++){
			System.out.println("Nome " + (i+1));
			nomes[i] = pegar.nextLine();
		}
		Arrays.sort(nomes);
		System.out.println(Arrays.asList(nomes));
	}
}
