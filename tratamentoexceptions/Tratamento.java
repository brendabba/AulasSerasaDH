package tratamentoexceptions;

public class Tratamento {

    public static void metodo1() {
	System.out.println("In�cio do teste m�todo 1");
	metodo2();
	System.out.println("Fim do teste m�todo 1");
}

    public static void metodo2() {
	System.out.println("In�cio do teste m�todo 2");
	int array[]= new int[10];
	
	try {
		
	for (int i = 0; i < 20; i++) {
		array[i]= i;
		System.out.println(i);
		
	}
	
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Erro pego no catch" + e);
	}	finally {
		System.out.println("Uma execu��o que vai sempre aparecer na finaliza��o");
	}
	
	System.out.println("Fim do teste m�todo 2");
	
	}

}

