package utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StringFormat {

    public String doubleParaReal(Double valor){
        NumberFormat format = new DecimalFormat("R$ 0.00");
        return format.format(valor);
    }
    
    public Double realParaDouble(String valor){
        valor = valor.replace("R$", "").replace(",", ".").trim();
        return Double.valueOf(valor);
    }
}
