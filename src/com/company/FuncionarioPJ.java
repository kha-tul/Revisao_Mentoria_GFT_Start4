package com.company;

public abstract class FuncionarioPJ { //essa classe é somente para herança

    //atributos de FuncionarioPJ
    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private Double valorHora;
    private Double valorRemuneracao;

    //2º passo: Cria getters e setters para habilitar uso de atributos em outra classe
    //alt + insert > getters e setters > seleciona tudo

    //3º Passo: criar método exclusivo pra horasTrabalhadas, conforme abaixo:
    public void calculaRemuneracao() {
        this.valorRemuneracao = this.horasTrabalhadas * this.valorHora;
    }
    //esse método calculará o valor das horas Trabalhadas pelo valor da hora, e será atribuido a variável
    //valorRemuneracao

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

    //cria ToString abaixo para habilitar edição na classe Gerente.
    //alt+insert > TOsTRING > seleciona tudo > >> COPIA TUDO E COLA PARA A CLASSE GERENTE!! <<

}
