package Imobiliaria;

public class Imovel {
	
	private String Tamanho;
	private String Nome;
	protected double Valor;
	protected int Idade;
	private String Endereco; //CEP
	
    public Imovel(String tamanho, String nome, double valor, int idade, String endereco) {
		super();
		this.Tamanho = tamanho;
        this.Nome = nome;
        this.Valor = valor;
        this.Idade = idade;
        this.Endereco = endereco;;
	}

	public String getTamanho() {
		return Tamanho;
	}

	public void setTamanho(String tamanho) {
		Tamanho = tamanho;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
}
