package com.company;

public abstract class FuncionarioCLT { //classe será herença - para vendedor e gerente. Como e herança, a classe é abstract

    //atributos
    protected String nome;
    protected String documento;
    protected Double valorSalario;
    protected Endereco endereco; //Classe Endereço entrou como atributo aqui

    //criar metodo construtor - primeiro o vazio

    public FuncionarioCLT() {
    }

    //criar metodo construtor - selecionando todos

    public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.valorSalario = valorSalario;
        this.endereco = endereco;
    }

    //Criar getters e setter para habilitar a edição nas demais classes

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }



}
