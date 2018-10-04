package num8;

import java.util.Scanner;

public class Numero8 {
	public static void main(String[] args) {
		Scanner pegar = new Scanner(System.in);
		
		String repetir="";
		int dias=0,arrecadou=0;
		
		
		while(!repetir.equalsIgnoreCase("nao")){
			float precoTotal=0;
			int svDiario=0;
			System.out.println("Informe quantos dias o cliente passou na pousada: ");
			dias = pegar.nextInt();
			
			int contador=0;
			if(dias < 10) {
				while(contador < dias) {
					precoTotal += 15;
					precoTotal += 40;
					contador++;
				}
			}else{
				while(contador < dias) {
					precoTotal += 8;
					precoTotal += 40;
					contador++;
				}
			}
			
			arrecadou += precoTotal;
			
			System.out.println("O gasto do cliente foi de: R$" + precoTotal);
			
			System.out.println("Deseja verificar outro cliente?(sim/nao): ");
			repetir = pegar.next();			
		}
		
		System.out.println("A pousada arrecadou: R$" + arrecadou);
		
	}
}
