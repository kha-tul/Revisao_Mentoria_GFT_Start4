package com.company;

public class OperadorDeCaixa extends FuncionarioCLT {

   //Criar método construtor

    public OperadorDeCaixa() {
    }

    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }


    //cria o ToString para uso nas demais Classes. Alt+insert > ToString > seleciona tudo:

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }
 // no capo endereço, é adicionado ao objeto endereço, o método getRua()

}
