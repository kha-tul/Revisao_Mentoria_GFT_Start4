package com.company;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

    //atributo valorDaBonificacao é somente do vendedor. Então, criamos o atributo:

    private Double valorDaBonificacao;

    //criar ToString para habilitar imprssao no console
    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                ", valorBonificacao=" + valorDaBonificacao + //valordaBonificacao adicionado manualmente
                '}';
    }


    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d); //informado pelo cliente

    }


}
