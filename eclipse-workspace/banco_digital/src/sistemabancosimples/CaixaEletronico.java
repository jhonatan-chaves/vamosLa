package sistemabancosimples;

import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Conta conta = new Conta(cliente);
		
		System.out.println("informe seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("informe seu cpf: ");
		String cpf = scanner.nextLine();
		
		conta.getCliente().setNome(nome);
		conta.getCliente().setCpf(cpf);
		
		System.out.println("Cliente: " + conta.getCliente().getNome() + "\n"
				+ "CPF: " + conta.getCliente().getCpf() + "\n" 
				+ "Numero Conta: " + conta.getNumeroConta() + "\n"
				+ "Sado: " + conta.getSaldo() + "\n");
		
		conta.deposito(150);
		conta.saque(100);
	}

}
