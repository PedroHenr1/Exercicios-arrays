import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Integer[] valores = new Integer[10];
		Scanner pegar = new Scanner(System.in);
		
		
		for(int i=0;i < valores.length;i++){
			System.out.println("valor " + (i+1));
			valores[i] = pegar.nextInt();
		}
		Arrays.sort(valores);
		System.out.println(Arrays.asList(valores));
	}
}
