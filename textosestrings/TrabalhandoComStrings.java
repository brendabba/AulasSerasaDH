package textosestrigs;

public class TrabalhandoComStrings {
	
	public static void main(String[] args) {
	
		//métodos da classe Character.
		
	//verifica se o valor é um número e retorna true ou false.
	System.out.println(Character.isDigit('5'));
	System.out.println(Character.isDigit('b'));
	
	System.out.println("========================================================");
	
	//verifica se o valor é uma letra e retorna true ou false.
	System.out.println(Character.isLetter('a'));
	System.out.println(Character.isLetter('1'));
	
	System.out.println("========================================================");
	
	//verifica se é letra ou número e retorna true ou false
	System.out.println(Character.isLetterOrDigit('5'));
	System.out.println(Character.isLetterOrDigit('@'));
	System.out.println(Character.isLetterOrDigit('a'));
	
	System.out.println("========================================================");
	
	//Verifica se o caracter está escrito em maiúsculo.
	System.out.println(Character.isUpperCase('u'));
	System.out.println(Character.isUpperCase('H'));
	
    System.out.println("========================================================");
	
	//Verifica se o caracter está escrito em minúsculo.
	System.out.println(Character.isLowerCase('i'));
	System.out.println(Character.isLowerCase('K'));
	
	
    System.out.println("========================================================");
	
	//Verifica se é um espaço em branco..
	System.out.println(Character.isWhitespace('i'));
	System.out.println(Character.isWhitespace(' '));
	
    System.out.println("========================================================");
	
	//Verifica se o caracter está escrito em minúsculo.
	System.out.println(Character.isLowerCase('i'));
	System.out.println(Character.isLowerCase('K'));
	
	
	
	System.out.println("========================================================");
	
	
	//Strings
	
	
	String arquivo = "escola.java";
	//verifica valor antigo e substitui pelo valor novo.
	arquivo = arquivo.replace("java", "class");
	System.out.println(arquivo);
	
	
	System.out.println("========================================================");
	
	//Compare dois valores
	String nome1 = "brenda";
	String nome2 = "Brenda";
	
	//Compara conteúdo e caracteres maiúsculo/minúsculo.
	System.out.println(nome1.equals(nome2));
	
	System.out.println("========================================================");
	
	//Compara apenas o conteúdo.
	System.out.println(nome1.equalsIgnoreCase(nome2));
	
	System.out.println("========================================================");

	//Verifica se inicia com a mesma sequência.
	System.out.println(nome1.startsWith("bre"));
	System.out.println(nome1.startsWith("Bre"));
	
	System.out.println("========================================================");
	
	//Verifica se finaliza xom a mesma sequência.
	System.out.println(nome1.endsWith("nda"));
	System.out.println(nome1.endsWith("ren"));
	
	System.out.println("========================================================");
	
	//Compara as letras uma a uma.
	//muito usado para colocar em ordem alfabética.
	//colections.
	
	System.out.println(nome1.compareTo(nome2));
	
	System.out.println("========================================================");
	
	//Verifica o tamanho da String
	System.out.println(nome1.length());

	System.out.println("========================================================");
	
	//Mostra o valor armazenado em derterminado índice.
	System.out.println(nome1.charAt(3));
	
	System.out.println("========================================================");
	
	//retorna parte de uma strig(informar início e fim)
	System.out.println(nome1.substring(2, 6));
	
	System.out.println("========================================================");
	
	//retorna a posição da primeira ocorrência de uma letra
	System.out.println(nome1.indexOf("a"));
	
	System.out.println("========================================================");
	
	//retorna a posição da ultima ocorrencia de uma letra
	System.out.println(nome1.lastIndexOf("d"));
	
	
	
	
	
	
	}
}
