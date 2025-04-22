package Show;

import java.util.Calendar;

public class VIP extends Ingresso {

	public VIP(double valor, String endereco, Calendar data, String show, String status) {
		super(valor * 1.17, endereco, data, show, status);

	}

    public void ImprValor() {
        System.out.println("O valor R$: " + getValor());
    }

    public void ImprStatus() {
        System.out.println("Show: " + getShow());
        System.out.println("Data: " + getData().getTime());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Status: " + getStatus());
    }

}
