package Show;

import java.util.Calendar;

public abstract class Ingresso {

    public enum Status {
        valido, invalido
    }

    private String endereco;
    private Calendar data;
    private String show;
    private String status;
    private double valor;

    public Ingresso(double valor, String endereco, Calendar data, String show, String status) {
        this.valor = valor;
        this.endereco = endereco;
        this.status = status;
        this.data = data;
        this.show = show;
    }

    public double getValor() {
        return valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public Calendar getData() {
        return data;
    }

    public String getShow() {
        return show;
    }

    public String getStatus() {
        return status;
    }
    
    public abstract void ImprValor();

    public abstract void ImprStatus();
}
