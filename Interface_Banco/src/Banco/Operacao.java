package Banco;

public interface Operacao {
	void depositar (double quantia);
	void sacar (double quantia);
	double getSaldo();
}
