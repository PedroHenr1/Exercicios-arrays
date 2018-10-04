
public class Numeros {
	public static void main(String[] args) {
		Integer[] numeros = new Integer[300];
		numeros[0] = 3;
		
		java.util.Arrays.fill(numeros,45);
		
		for(int i=0;i < numeros.length;i++) {
			System.out.println("Pos " + i + " = " + numeros[i]);
		}
		
	}
}
