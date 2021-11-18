package com.br.zup.DTO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lead")
public class Lead {
    @Id
    private String email;
    private String nome;
    @Column(unique = true)
    private String cpf;
    private String telefone;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ProdutoDTO> produtos;

    public Lead() {
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
