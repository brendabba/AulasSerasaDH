package textosestrings;

public class ExpressoesRegulares2 {

	
	private String ddd;
	private String numero;
	
	public ExpressoesRegulares2(String ddd, String numero) {
		if(ddd == null ||numero == null) {
	        throw new IllegalArgumentException("Telefone inválido");
		}
		
		if(!ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD inválido");
		}
		
		if(!numero.matches("\\d{8}|\\d{9}")) {
			throw new IllegalArgumentException("Número inválido");
		}
		
		this.ddd = ddd;
		this.numero = numero;
		
	}

	
	public String toStrig() {
		return "("+this.ddd+")"+this.numero;

	}
	
}
