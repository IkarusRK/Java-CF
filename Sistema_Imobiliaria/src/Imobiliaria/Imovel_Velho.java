package Imobiliaria;

public class Imovel_Velho extends Imovel {
	
	public Imovel_Velho(String tamanho, String nome, double valor, int idade, String endereço) {
		super(tamanho, nome, valor, idade, endereço);
		calcularDesconto();
	}
	


	@Override
	public String toString() {
		return "Valor: " + Valor + "\n" + "Idade: " + Idade + "\n" + "Tamanho: " + getTamanho() + "\n" + "Nome:"
				+ getNome() + "\n" + "Valor: " + getValor() + "\n" + "Endereço: " + getEndereco() ;
	}




	private void calcularDesconto(){
	
		if (this.Idade > 15) {
			this.Valor *= 0.85;
		}
	}

}
