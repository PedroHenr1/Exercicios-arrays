import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		Integer[] array = new Integer[300];
		java.util.Arrays.fill(array, 45);
		
		
		//Primeiro metodo
		System.out.println(Arrays.toString(array));
		
		//Segundo metodo
		System.out.println(Arrays.asList(array));
		
		//Terceiro metodo
		for(int i=0;i < array.length;i++) System.out.print("Pos " + i + " = " + array[i] + " ");
	}
}
