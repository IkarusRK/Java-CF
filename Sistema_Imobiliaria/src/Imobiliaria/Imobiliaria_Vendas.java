package Imobiliaria;

public class Imobiliaria_Vendas {

	public static void main(String[] args) {
		
		Imovel_novo Imovel_NV = new Imovel_novo("52m", "Casa roxa", 40000, 8, "68763-937");
		Imovel_Velho Imovel_VL = new Imovel_Velho("87m", "Casa azul", 90000, 22, "48963-987");
	
		System.out.println("Olá, seja bem vindo ao sistema de compras, as casas disponiveis estão a baixo");
		System.out.println(Imovel_NV);
		System.out.println("\n\n==================\n\n");
		System.out.println(Imovel_VL);
	}

}
