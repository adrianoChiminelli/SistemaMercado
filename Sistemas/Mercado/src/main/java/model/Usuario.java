package model;

public class Usuario {

    private Integer idUsuarios, nivelAcesso;
    private String nomeUsuario, senha;

    public Usuario() {
    }

    public Usuario(Integer nivelAcesso, String nomeUsuario, String senha) {
        this.nivelAcesso = nivelAcesso;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public Integer getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(Integer idUsuarios) {
        this.idUsuarios = idUsuarios;
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

}
