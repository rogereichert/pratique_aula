package models;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roger
 */
public class User {

    private String name;
    private String endereco;
    private String cidade;
    private String estado;
    private int idade;
    private String cpf;

    // Construtor padrão
    public User() {

    }

    // Construtor com parâmetros
    public User(String name, String endereco, String cidade, String estado, int idade, String cpf) {
        this.name = name;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "User{"
                + "name='" + name + '\''
                + ", endereco='" + endereco + '\''
                + ", cidade='" + cidade + '\''
                + ", estado='" + estado + '\''
                + ", idade='" + idade + '\''
                + ", cpf='" + cpf + '\''
                + '}';
    }

}
