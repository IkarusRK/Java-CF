package Show;

import java.util.Calendar;

public class Ingresso_Normal extends Ingresso {

    public Ingresso_Normal(double valor, String endereco, Calendar data, String show, String status) {
        super(valor, endereco, data, show, status);
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

