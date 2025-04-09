package pacotes;

public class gerente extends Funcionario implements Autenticavel {
	
		
	private String senha;

	public gerente(String nome, double salarioBase, String senha, Cargo cargo) {
		super(nome, salarioBase, cargo);
		this.senha = senha;
	}

	public void aumento() {    
        setSalarioBase(getSalarioBase() * 1.20);
    }
	
	@Override
	public boolean autenticar(String senha){
		return this.senha.equals(senha);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
