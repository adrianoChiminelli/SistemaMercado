package model;

import dao.ClienteDAO;
import java.util.List;
import java.util.Optional;

public class Cliente {

    private Integer idCliente;
    private String nomeCliente, cpf, telefone, email;

    public Cliente() {
    }

    public Cliente(String nomeCliente, String cpf, String telefone, String email) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente(Integer idCliente, String nomeCliente, String cpf, String telefone, String email) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void salvar(Cliente cli) {
        new ClienteDAO().insert(cli);
    }

    public void alterar(Cliente cli) {
        new ClienteDAO().update(cli);
    }

    public boolean cpfJaCadastrado(String cpf) {
        return new ClienteDAO().cpfJaCadastrado(cpf);
    }

    public Optional<Cliente> getCliente(int id) {
        return new ClienteDAO().findById(id);
    }

    public List<Cliente> getListaCliente() {
        return new ClienteDAO().findAll();
    }

    public void delete(int id) {
        new ClienteDAO().delete(id);
    }

}
