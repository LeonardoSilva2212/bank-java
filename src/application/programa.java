package application;

public class programa {
	
	public static void main(String[] args) {
		
		conta minhaConta = new conta();
		conta meuSonho = new conta();

		//----------------------------------//
		
		minhaConta.titular = "Samuel Santos";
		minhaConta.numero = 12289;
		minhaConta.saldo = 50000.00;
		
		//----------------------------------//
		
		meuSonho.titular = "corinthians";
		meuSonho.numero = 12234;
		meuSonho.saldo = 35000.00;
		
		//----------------------------------//
				
		System.out.println(" Saldo Atual: R$ " + minhaConta.saldo);
		
		minhaConta.depositar(25000.00);
		
		System.out.println(" Saldo após o depósito: R$ " + minhaConta.saldo);
		
		minhaConta.sacar(1000.00);
		
		System.out.println(" Saldo após o saque R$ " + minhaConta.saldo);
		
	}
}
