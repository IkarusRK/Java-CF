package pacotes;

public abstract class Funcionario {

	private String nome;
	private double SalarioBase;
	private Cargo cargo;
	private Departamento departamento;
	
	
	public Funcionario(String nome, double salarioBase, Cargo cargo) {
		super();
		this.nome = nome;
		this.SalarioBase = salarioBase;
		this.cargo = cargo;
	}


	public double calcularSalario() {
		return SalarioBase;
	}
	
	public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + SalarioBase);
        System.out.println("Cargo: "+ cargo);
    }
	
	public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBase() {
		return SalarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		SalarioBase = salarioBase;
	}


	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", SalarioBase=" + SalarioBase + ", cargo=" + cargo + ", departamento="
				+ departamento + "]";
	}
}
