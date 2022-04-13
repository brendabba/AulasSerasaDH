package textosestrigs;

public class ExpressoesRegulares2 {

	
	private String ddd;
	private String numero;
	
	public ExpressoesRegulares2(String ddd, String numero) {
		if(ddd == null ||numero == null) {
			System.out.println("Telefone inválido");
		}
		
		if(!ddd.matches("\\d{2}")) {
			System.out.println("DDD inválido");
		}
		
		if(!numero.matches("\\d{8}|\\d{9}")) {
			System.out.println("Número inválido");
		}
		
		this.ddd = ddd;
		this.numero = numero;
		
	}

	
	public String toStrig() {
		return "("+this.ddd+")"+this.numero;

	}
	
}
