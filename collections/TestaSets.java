package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestaSets {

	public static void main(String[] args) {
	
		
		//Não possui índice, sem ordem específica.
		Set<Double> notas = new HashSet<>(Arrays.asList(7.5, 8.9, 10.0, 5.5, 3.1)); // adiciona valores a uma collection
		
		notas.add(7.5);
		
		System.out.println(notas);
		
		System.out.println(notas.contains(7.6)); //verifica se há o valor na lista
		System.out.println(notas.contains(7.5));
		
		for(Double doubleTemp : notas) {
			System.out.println(doubleTemp);
		}
		
		System.out.println("Maior nota: "+ Collections.max(notas));
		System.out.println("Menor nota: "+ Collections.min(notas));
		
		
		double soma = 0;
		for (Double doubleTemp : notas) {
			soma += doubleTemp;
		}
			
		System.out.println("Média: "+ (soma/notas.size()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
