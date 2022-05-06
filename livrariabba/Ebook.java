package livrariabba;

public class Ebook extends Livro{

	private String waterMark;
	
	public Ebook (Autor autor) {
		super(autor);
	}
	
	public Ebook() {
	}
	
	public Ebook(String nome, String descricao, double valor, String isbn, Autor autor, String waterMark) {
		super(nome, descricao, valor, isbn, autor);
		this.waterMark = waterMark;
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		return super.aplicaDescontoDe(porcentagem);
	}
	
	
	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	

}
