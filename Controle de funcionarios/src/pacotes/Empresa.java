package pacotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		// Criar departamentos, Objs e etc...
		Departamento departamentoTI = new Departamento("Tecnologia da Informação");
		Departamento departamentoRH = new Departamento("Recursos Humanos");

		Desenvolvedor Dev1 = new Desenvolvedor("Daniel", 12000, Cargo.DESENVOLVEDOR);
		Desenvolvedor Dev2 = new Desenvolvedor("Hosk", 9000, Cargo.DESENVOLVEDOR);
		gerente GT1 = new gerente("Julio", 16000, "qwert", Cargo.GERENTE); //Senha de acesso "qwert"
		gerente GT2 = new gerente("Russ", 19000, "12349", Cargo.GERENTE);

		Dev1.setDepartamento(departamentoTI);
		Dev2.setDepartamento(departamentoTI);
		GT1.setDepartamento(departamentoRH);
		GT2.setDepartamento(departamentoRH);

		// Funcionario RH
		departamentoRH.adicionarFuncionario(GT1);
		departamentoRH.adicionarFuncionario(GT2);
		// Funcionario TI
		departamentoTI.adicionarFuncionario(Dev1);
		departamentoTI.adicionarFuncionario(Dev2);

		departamentoRH.ListaFuncionario();
		departamentoTI.ListaFuncionario();

		if (GT1.autenticar("qwert")) { //Aqui você coloca a senha que vai autenticar 
			System.out.println("Senha correta");
		} else {
			System.out.println("Senha incorreta");
		}
	}
}
