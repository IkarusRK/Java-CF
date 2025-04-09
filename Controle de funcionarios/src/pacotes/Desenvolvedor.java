package pacotes;

public class Desenvolvedor extends Funcionario {
	
	public Desenvolvedor(String nome, double salarioBase, Cargo cargo) {
		super(nome, salarioBase, cargo);
	}
	
	public void aumento() {    
        setSalarioBase(getSalarioBase() * 1.10);
    }

}
