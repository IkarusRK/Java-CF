package Banco;

import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		Conta ContaP = new Conta_Poupança("423", "Itau", 2000);
		Conta ContaC = new Conta_Corrente("832", "Bradesco", 5000);

		int op = 0; int op2 = 0;
		
		double DepositoC = 0; double DepositoP = 0;
		
		double SaqueC = 0; double SaqueP = 0;
		
		do {

			System.out.println("Bem vindo ao ATM, escolha as opções do Menu!");
			System.out.println("[1] Selecionar corrente\n[2] Selecionar Poupança\n[3] Sair");

			op = tc.nextInt();

			switch (op) {
			case 1:
				do {
					System.out.println("====== Conta Corrente ======");
					System.out.println("[1] Ver Conta\n[2] Depositar \n[3] Sacar\n[4] Voltar a seleção de contas");
					op2 = tc.nextInt();

					switch (op2) {

					case 1:
						System.out.println("====== Conta Corrente ======");
						System.out.println("Numero da conta: " + ContaC.numero);
						System.out.println("Agencia: " + ContaC.Agencia);
						System.out.println("Valor na conta: " + ContaC.Saldo);
						System.out.println("============\n\n");
					break;

					case 2:
						System.out.println("Digite o quanto você deseja depositar");
							DepositoC = tc.nextDouble();
							ContaC.depositar(DepositoC);
					break;

					case 3:
						System.out.println("Digite o quanto você deseja Sacar");
							SaqueC = tc.nextDouble();
							ContaC.sacar(SaqueC);
					break;

					default:
						System.out.println("Opção inserida invalida, por favor tente novamente.");
						break;

					}// Fim do Switch 2 (op2)

				} while (op2 != 4);

				break; // Fim do case 1 Switch 1 (op)
			// ==================================

			case 2:
				do {

					System.out.println("====== Conta Poupança ======");
					System.out.println("[1] Ver Conta\n[2] Depositar \n[3] Sacar\n[4] Voltar a seleção de contas");
					op2 = tc.nextInt();

					switch (op2) {

					case 1:
						System.out.println("====== Conta Poupança ======");
						System.out.println("Numero da conta: " + ContaP.numero);
						System.out.println("Agencia: " + ContaP.Agencia);
						System.out.println("Valor na conta: " + ContaP.Saldo);
						System.out.println("============\n\n");
						break;

					case 2:
						System.out.println("Digite o quanto você deseja depositar");
						DepositoP = tc.nextDouble();
						ContaP.depositar(DepositoP);
						break;

					case 3:
						System.out.println("Digite o quanto você deseja Sacar");
						SaqueP = tc.nextDouble();
						ContaP.sacar(SaqueP);
						break;

					default:
						System.out.println("Opção inserida invalida, por favor tente novamente.");
						break;
					} // Fim do Switch 2 (op2)

				} while (op2 != 4);

				break; // Fim do case 2 Switch 1 (op)
			// ==================================
			default:
				System.out.println("Opção inserida invalida, por favor tente novamente.");
				break;

			}
		} while (op != 4); // do

			tc.close();
	}
}
