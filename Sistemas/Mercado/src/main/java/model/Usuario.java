package model;

import dao.UsuarioDAO;
import java.util.List;

public class Usuario {

    private Integer idUsuario, nivelAcesso;
    private String nomeUsuario, senha;

    public Usuario() {
    }

    public Usuario(String nomeUsuario, String senha, Integer nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public Usuario(Integer idUsuario, String nomeUsuario, String senha, Integer nivelAcesso) {
        this.idUsuario = idUsuario;
        this.nivelAcesso = nivelAcesso;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuarios) {
        this.idUsuario = idUsuarios;
    }

    public Integer getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(Integer nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void delete(int id) {
        new UsuarioDAO().delete(id);
    }

    public List<Usuario> getListaUsuario() {
        return new UsuarioDAO().findAll();
    }

    public void salvar(Usuario user) {
        new UsuarioDAO().insert(user);
    }

    public void alterar(Usuario user) {
        new UsuarioDAO().update(user);
    }

}
