package Imobiliaria;

public class Imovel_novo extends Imovel {

	public Imovel_novo(String tamanho, String nome, double valor, int idade, String endereço) {
		super(tamanho, nome, valor, idade, endereço);
		Aumento();
	}
	
	
	
	@Override
	public String toString() {
		return "Valor: " + Valor + "\n" + "Idade: " + Idade + "\n" + "Tamanho: " + getTamanho() + "\n" + "Nome:"
				+ getNome() + "\n" + "Valor: " + getValor() + "\n" + "Endereço: " + getEndereco() ;
	}




	private void Aumento(){
	
		if (this.Idade <= 15) {
			this.Valor *= 1.30;
		}
	}
}
