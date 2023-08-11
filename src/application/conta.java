package application;

public class conta {
	
	int numero;
	String titular;
	double saldo;
	
	boolean sacar ( double quantidade) {
		
		if (this.saldo < quantidade) {
			System.out.println(" Saque bloqueado, este valor exede seu saldo!!! ");
			return false; 
		}else {
			System.out.println(" Saque efetuado com sucesso!!! No valor de: R$ " +quantidade );
			this.saldo -= quantidade;
			return true;
		}
	}
	
	void depositar(double quantidade) {
		this.saldo += quantidade;
	}
	
	//----------------------------------//
	
	

}
