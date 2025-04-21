package Banco;

public abstract class Conta implements Operacao {
	
	protected String numero;
	protected String Agencia;
	protected double Saldo;
	
	public Conta(String numero, String agencia, double saldoInicial) {
        this.numero = numero;
        this.Agencia = agencia;
        this.Saldo = saldoInicial;
    }

	@Override
	public void depositar (double quantia) {
		if (quantia > 0) {
	
			Saldo += quantia;
			System.out.println("Valor de " + quantia + " depositado, saldo atual: " + Saldo);
		}else {
			System.out.println("Valor de deposito invalido");
		}
	}

	   public double getSaldo() { 
	        return Saldo; 
	    }

	    protected void setSaldo(double novoSaldo) { 
	        this.Saldo = novoSaldo; 
	    }
}


