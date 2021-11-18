package com.br.zup.DTO;

import java.util.List;

public class LeadDTO {

    private String email;
    private String nome;
    private String cpf;
    private String telefone;
    private List<ProdutoDTO> produtos;

    public LeadDTO() {
    }

    public LeadDTO(String email, String nome, String cpf, String telefone, List<ProdutoDTO> produtos) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.produtos = produtos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }
}
