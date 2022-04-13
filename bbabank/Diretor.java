package bbabank;

import java.time.LocalDate;

public class Diretor extends Funcionario {

	private String nome;
	private String cpf;
	private String ctps;
	private double salario;
	private LocalDate dataDeAdmissao;
	
	
	public Diretor() {
	
	}


	public Diretor(String nome, String cpf, String ctps, double salario, LocalDate dataDeAdmissao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.salario = salario;
		this.dataDeAdmissao = dataDeAdmissao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCtps() {
		return ctps;
	}


	public void setCtps(String ctps) {
		this.ctps = ctps;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public LocalDate getDataDeAdmissao() {
		return dataDeAdmissao;
	}


	public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	
}
