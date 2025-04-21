package Banco;

public class Conta_Corrente extends Conta {

	private static final double Taxa_saque = 0.010;

	public Conta_Corrente(String numero, String agencia, double saldoInicial) {
		super(numero, agencia, saldoInicial);
	} 

	public void sacar (double quantia) {
		double taxar = quantia * Taxa_saque;
		double saque = quantia + taxar;
		
		if (saque <= getSaldo()) {
			setSaldo(getSaldo() - saque);
			System.out.println("Valor de: " + saque + "retirados da poupança, valora atual: " + Saldo);
		}else {
			System.out.println ("Quantidade desejada para saque é insuficiente. Saldo de: "+ Saldo);
		}
		
		}
	
}
