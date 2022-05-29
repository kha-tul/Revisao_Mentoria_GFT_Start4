package com.company;

public class Endereco {

    //atributos
    private String rua;
    private String complemento;
    private String bairro;
    //usado private para não alterar diretamente o codigo. É gerado o getters e setters para alterar.

    //2º passo: criar construtor para as demais classes terem acesso. Criar construtor: alt+insert>construtor.
    //como foi criado um construtor vazio da classe Endereço na classe main, os construtores abaixo não funcionam
    //é criado então um construtor vazio

    public Endereco(String rua, String complemento, String bairro) {
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    //construtor vazio > alt+instert> construtor > select none

    public Endereco() {
    }

    //assesores: Criar Getters e Setters - alt + insert > Getters e Setters > seleciona todos


    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    // ToString para imprimir nas demais classes
    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
