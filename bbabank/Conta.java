package bbabank;

public class Conta {
	
private int agencia;
private int numeroConta;
protected double saldo;
private PessoaHeranca titular;


//Métodos

public void depositar (double valor){
	if(valor > 0) {
		saldo += valor; //saldo = saldo + valor;
	}
	
}

public boolean sacar (double valor) {
	if(valor>0 && saldo>=valor) {
		saldo -= valor;
		return true;
	}
	
	return false;
}


public boolean transferir(double valor, Conta destinatario) {
	if(valor>0 && saldo>=valor) {
		saldo -= valor;
		destinatario.depositar(valor);
		return true;
	}
	return false;
}




public Conta() {
	
}

public Conta(int agencia, int numeroConta, double saldo, PessoaHeranca titular) {
	super();
	this.agencia = agencia;
	this.numeroConta = numeroConta;
	this.saldo = 0;
	this.titular = titular;
}


public int getAgencia() {
	return agencia;
}

public void setAgencia(int agencia) {
	this.agencia = agencia;
}

public int getNumeroConta() {
	return numeroConta;
}

public void setNumeroConta(int numeroConta) {
	this.numeroConta = numeroConta;
}

public double getSaldo() {
	return saldo;
}

public PessoaHeranca getTitular() {
	return titular;
}

public void setTitular(PessoaHeranca titular) {
	this.titular = titular;
}



}
