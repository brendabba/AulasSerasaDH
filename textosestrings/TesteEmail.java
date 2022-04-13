package textosestrigs;

public class TesteEmail {
	
	public static void main(String[] args) {
		
		ExpressoesRegulares emailValido = new ExpressoesRegulares("teste@teste.com.br");
		System.out.println("Email: " + emailValido.getEmail());
		
		ExpressoesRegulares emailInvalido = new ExpressoesRegulares("testeteste.com;br");
	
		
		ExpressoesRegulares2 telefoneValido = new ExpressoesRegulares2("73", "123456789");
		System.out.println(telefoneValido.toStrig());


		ExpressoesRegulares2 telefoneInvalido = new ExpressoesRegulares2("073", "9876543");
		
	
	}

}
