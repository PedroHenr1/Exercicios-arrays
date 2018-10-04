import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int[] array = new int[10];
		int indice,valor;
		Scanner pegar = new Scanner(System.in);
		
		for(int i=0;i < array.length;i++) {
			System.out.println("Inserir valor " + (i+1) + ":");
			array[i] = pegar.nextInt();
		}
		Arrays.sort(array);
		
		System.out.println("Qual valor voce deseja pesquisar no array?: ");
		valor = pegar.nextInt();
		
		indice = bin(array,valor);
	
		if(indice == -1)
			System.out.println("O valor informado nao se encontra no vetor.");
		else
			System.out.println("O valor " + valor + " esta na posição " + indice + " do vetor.");
	
	}
	private static int bin(int[] array,int pos){
		int inicio=0,meio=0,fim=0;
		
		fim = array.length-1;
		
		while(inicio <= fim) {
			meio = (inicio+fim) / 2;
			if(array[meio] == pos)
				return meio;
			else if(array[meio] < pos)
				inicio = meio+1;
			else
				fim = meio-1;
		}
			
		return -1;
	}
}
