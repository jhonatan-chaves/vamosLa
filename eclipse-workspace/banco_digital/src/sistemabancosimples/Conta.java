package sistemabancosimples;

public class Conta  {

private int numeroConta;
private Cliente cliente;
private double saldo;
	
	public Conta(Cliente cliente) {
	this.numeroConta = 123;
	this.cliente = cliente;
	this.saldo = 0;
}

public void deposito(double valorDeposito) {
	this.saldo += valorDeposito;
	System.out.println("Deposito realizado com sucesso." + "\n"
	                      + "Saldo atual R$ " + this.saldo + "\n");
	
}
public void saque(double valorSaque) {
	if(this.saldo >= valorSaque) {
		this.saldo -= valorSaque;
		System.out.println("Saque realizado com sucesso" + "\n"
		                      + "Saldo atual R$ " + this.saldo + "\n");
	}else {
		System.out.println("Saldo insuficiente!" + "\n"
	                         + "Saldo disponivel R$ " + this.saldo + "\n");
	}
}

public int getNumeroConta() {
	return numeroConta;
}

public Cliente getCliente() {
	return cliente;
}

public double getSaldo() {
	return saldo;
}
}
