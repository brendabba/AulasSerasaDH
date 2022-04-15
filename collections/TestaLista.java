package collections;

import java.util.ArrayList;
import java.util.List;

public class TestaLista {

	public static void main(String[] args) {
		
		
		List<Carro> meusCarros = new ArrayList<>();
		
		Carro carro1 = new Carro("Audi X1", 2022, "prata", "2.2");
		meusCarros.add(carro1);//Inserir informação
		
		meusCarros.add(new Carro("Renegade", 2018, "preto", "2.0"));
		meusCarros.add(new Carro("Etios Sedan", 2019, "vermelho", "1.6"));
		
		for (Carro carro : meusCarros) {
			System.out.println(carro.toString());
		}
		
		System.out.println("=================================================");
		
		for (int i = 0; i < meusCarros.size(); i++) {
			Carro carroTemp = meusCarros.get(i);
			System.out.println(carroTemp.toString());
		}
		
		System.out.println("=================================================");

		System.out.println(meusCarros.get(1).toString());
		
		System.out.println("=================================================");
		
		
		//meusCarros.remove(2); //retirar dados
		for (Carro carro : meusCarros) {
			System.out.println(carro.toString());
			
		}
		
		System.out.println("=================================================");
		
//		boolean resp = meusCarros.contains(carro1);
		boolean resp = meusCarros.contains(new Carro("Etios Sedan", 2019, "vermelho", "1.6"));
		System.out.println(resp);
		
		System.out.println("=================================================");
		
		//sort() >> Compareble
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
