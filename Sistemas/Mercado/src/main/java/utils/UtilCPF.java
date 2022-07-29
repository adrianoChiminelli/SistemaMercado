package utils;

import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.text.MaskFormatter;

public class UtilCPF {

    /**
     * Método que gera um CPF aleatório válido
     *
     * @return Retorna uma String que contém um CPF, sem pontos e hífem.
     */
    public String geraCPFAleatorio() {

        ArrayList<Integer> listaNumAleatorio = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            listaNumAleatorio.add(geraNumeroAleatorio());
        }

        String cpf = geraDigitosVerificador(listaNumAleatorio);

        return cpf;
    }

    /**
     * Método que verifica se um CPF é válido
     *
     * @param cpf CPF informado para validação
     * @return Retorna um boolean informando se o CPF é válido ou não
     */
    public boolean validaCPF(String cpf) {

        if (!verificaDigitos(cpf)) {
            return false;
        }

        ArrayList<Integer> noveDigitos = new ArrayList<>();

        for (int i = 0; i < (cpf.length() - 2); i++) {
            noveDigitos.add(Character.getNumericValue(cpf.charAt(i)));
        }

        String testaCPF = geraDigitosVerificador(noveDigitos);

        return cpf.equals(testaCPF);
    }

    public String formatarCPF(String cpf) {
        if (verificaDigitos(cpf)) {
            String cpfFormatado = "";
            try {
                MaskFormatter mf = new MaskFormatter("###.###.###-##");
                mf.setValueContainsLiteralCharacters(false);
                cpfFormatado = mf.valueToString(cpf);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return cpfFormatado;
        } else {
            return cpf;
        }
    }

    private String geraDigitosVerificador(ArrayList<Integer> listaDigitos) {

        int peso = 10;
        for (int i = 0; i < 2; i++) {
            if (i == 1) {
                peso = 11;
            }

            int somaDigitosComPeso = 0;

            for (int Digito : listaDigitos) {
                somaDigitosComPeso = somaDigitosComPeso + (Digito * peso);
                peso--;
            }
            int restoDivisao = (somaDigitosComPeso % 11);

            if (restoDivisao < 2) {
                listaDigitos.add(0);
            } else {
                listaDigitos.add((11 - restoDivisao));
            }
        }
        String textoCPF = "";
        for (int item : listaDigitos) {
            textoCPF += item;
        }

        return textoCPF;
    }

    private int geraNumeroAleatorio() {
        int numero = (int) (Math.random() * 10);
        return numero;
    }

    private String removeMascara(String cpf) {
        return cpf.replaceAll("\\D", "");
    }

    private boolean verificaDigitos(String cpf) {

        if (cpf.contains(".") || cpf.contains("-")) {
            cpf = removeMascara(cpf);
        }

        if (cpf.length() != 11) {
            return false;
        }

        for (int i = 0; i < cpf.length(); i++) {
            char c = cpf.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}
