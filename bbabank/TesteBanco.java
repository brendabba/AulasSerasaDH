package bbabank;

import java.time.LocalDate;
import java.util.Locale;

public class TesteBanco{
	
	public static void main (String[]args) {
		
//		Pessoa pessoaNova = new Pessoa(); //instaciar a classe Pessoa (default)
//		pessoaNova.setNome("José das Couves");
//		System.out.println("Nome: " + pessoaNova.getNome());
//		
//		
//		Pessoa pessoaComConstrutor1 = new Pessoa("João dos Tomates", "897.972.415-21", "123.456-78"); //(sobrecarga)
//		
//		System.out.println("Nome: "+pessoaComConstrutor1.getNome());
//		System.out.println("CPF: "+pessoaComConstrutor1.getCpf());
//		System.out.println("RG: "+pessoaComConstrutor1.getRg());
		
		
//		PessoaFisica pfBrenda = new PessoaFisica();
//		pfBrenda.setNome("Brenda Alcântara");
//		pfBrenda.setEmail("bren123@hotmail.com");
//		pfBrenda.setTelefone("29381928");
//		pfBrenda.setCpf("652.486.505-77");
//		pfBrenda.setProfissao("Programadora");
//		pfBrenda.setRg("123456789");
//		
//		
//		Conta conta1 = new Conta();
//		conta1.setAgencia(1234);
//		conta1.setNumeroConta(5678);
//		conta1.setSaldo(100000.50); > não se deve alterar essa informação. Deve apenas ser exibida.
//		conta1.setTitular(pfBrenda);
		
//		conta1.depositar(1000000);
				
//		System.out.println("Agencia: "+conta1.getAgencia());
//		System.out.println("Conta: "+conta1.getNumeroConta());
//		System.out.println("Saldo: "+conta1.getSaldo());
//		System.out.println("Titular: "+conta1.getTitular().getNome());
//		
//		if (conta1.sacar(500000)) {
//			System.out.println("Saque efetuado com sucesso!");
//		}else {
//			System.out.println("Verifique o valor do saque!");
//		}
//		
//		System.out.println("Saldo: "+conta1.getSaldo());
//		
//		
//		Conta conta2 = new Conta();
//		conta2.setAgencia(9876);
//		conta2.setNumeroConta(6543);
//		
//		conta1.transferir(300000.0, conta2);
//		
//		System.out.println("Saldo atual Brenda: R$"+conta1.getSaldo());
//		System.out.println("Saldo atual Ayô: R$"+conta2.getSaldo());
//		
		
//		ContaCorrente cc1 = new ContaCorrente();
//		cc1.depositar(100);
//    	System.out.println("Saldo: " + cc1.getSaldo());
//		System.out.println("Limite: " + cc1.getLimite());
//		System.out.println("Saldo com Limite :" + cc1.getSaldoComLimite());
//		cc1.sacar(1500);
//		System.out.println("Saldo: " + cc1.getSaldo());
//		System.out.println("Saldo com limite: " + cc1.getSaldoComLimite());
		
//		ContaCorrente cc2 = new ContaCorrente();
//		cc2.depositar(500);
//		
//		System.out.println("Saldo com Limite Brenda: " + cc1.getSaldoComLimite());
//		System.out.println("Salso com Limite Ayô: " + cc2.getSaldoComLimite());
//		
//		cc1.transferir(0, cc2);
//		
//		System.out.println("Saldo Brenda: " + cc1.getSaldo());
//		System.out.println("Saldo Ayô: " + cc2.getSaldo());
//		
//		System.out.println("Saldo com Limite Brenda: " + cc1.getSaldoComLimite());
//		System.out.println("Salso com Limite Ayô: " + cc2.getSaldoComLimite());
//		
//		System.out.println("Limite Brenda: " + cc1.getLimite());
//		System.out.println("Limite Ayô: " + cc2.getLimite());
	
		
		Locale.setDefault(new Locale("pt", "BR"));
		Gerente funcionario = new Gerente("Brenda Alcântara", "496.514.845-27", "645281", 2500.0, LocalDate.now());
		
		System.out.println(funcionario.toString());
		
		
		boolean resposta = funcionario.autenticarSistema("usuariopadrao","mudar123");
		
		if(resposta) {
			System.out.println("Bem-vinda(o), "+ funcionario.getNome()+"!");
		}else
			System.out.println("Usuário ou senha inválidos");
		
		
		
	}


}