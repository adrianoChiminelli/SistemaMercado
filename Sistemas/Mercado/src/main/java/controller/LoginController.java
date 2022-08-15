package controller;

import dao.UsuarioDAO;

public class LoginController {

    public boolean validaLogin(String usuario, String senha) {
        return new UsuarioDAO().validaLogin(usuario, senha);
    }

    public int verificaNivelAcesso(String usuario, String senha) {
        return new UsuarioDAO().validaNvAcesso(usuario, senha);
    }
}
