package utils;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class Cripto {

    BasicPasswordEncryptor pass = new BasicPasswordEncryptor();

    public String cripgrafaSenha(String senhaUsuario) {
        return pass.encryptPassword(senhaUsuario);
    }

    public boolean validaSenha(String senhaUsuario, String senhaCriptografada) {
        return pass.checkPassword(senhaUsuario, senhaCriptografada);
    }

}
