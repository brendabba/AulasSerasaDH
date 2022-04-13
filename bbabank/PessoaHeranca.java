package bbabank; //Pacote

public class PessoaHeranca { //Classe
	
private String nome; //Atributos
private String email;
private String telefone;

//M�todos//

public PessoaHeranca() { //Construtor padr�o
	//construtor default = preenchimento dos atributos � opcional.
}

public PessoaHeranca(String nome, String email, String telefone) {
	super();
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
}


//Getters and Setters
public String getNome() {//exibe os objetos
	return nome;
}
public void setNome(String nome) {//grava os objetos no atributos
	this.nome = nome;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}





}