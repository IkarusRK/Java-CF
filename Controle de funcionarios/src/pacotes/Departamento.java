package pacotes;

import java.util.ArrayList;

public class Departamento {
	
	private String nome;
	private ArrayList<Funcionario> funcionarios;

	
	public Departamento(String nome) {
		super();
		this.nome = nome;
		this.funcionarios = new ArrayList <Funcionario>();
	}
	
	public void adicionarFuncionario (Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void ListaFuncionario() {
		System.out.println("Departamento: " + nome);
		for (Funcionario funcionario : funcionarios) {
			funcionario.exibirDados();
		}
	}
}
