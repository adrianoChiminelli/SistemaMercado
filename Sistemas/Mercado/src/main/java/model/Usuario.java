package model;

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

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nivelAcesso=" + nivelAcesso + ", nomeUsuario=" + nomeUsuario + ", senha=" + senha + '}';
    }

}
