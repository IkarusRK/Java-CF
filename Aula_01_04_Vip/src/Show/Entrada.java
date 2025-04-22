package Show;

import java.util.Calendar;

public class Entrada {

    public static void main(String[] args) {

        Calendar data = Calendar.getInstance();

        Ingresso_Normal ingresso = new Ingresso_Normal(100.0, "Rua J1", data, "Desfile", "valido");
        VIP Ingre_VIP = new VIP(100.0, "Rua J2", data, "Desfile", "valido");
        Camarote_Superior Ingre_Camarote = new Camarote_Superior(100.0, "Rua J3", data, "Desfile", "valido");
        
        
        System.out.println("Ingresso Normal:"); //100 Reais 
        ingresso.ImprStatus();
        ingresso.ImprValor();

        System.out.println("\nIngresso VIP:"); //(+17%)
        Ingre_VIP.ImprStatus();
        Ingre_VIP.ImprValor();

        System.out.println("\nIngresso Camarote Superior:"); //(+60%)
        Ingre_Camarote.ImprStatus();
        Ingre_Camarote.ImprValor();
        
    }
}
