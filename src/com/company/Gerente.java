package com.company;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {

    //cria atributo BONIFICAÇÃO
    private Double valorBonificacao;

    //sobreescreve com o método ToString para criar impressão no console (devido ao método Endereço)
    //cria método ToString: alt + insert > ToString > não é exibido nada
    //cria objeto Gerente na classe main

    //como a Classe FuncionarioPJ está com os atributos em modo private, não é possível subscreever com
    //ToString. Então, é necessário: ou alterar os atributos de private para protected, ou, criar um método ToString
    //na classe FuncionarioPJ e cola abaixo:

    //Cola a copia do método o ToString geredo na classe FuncionarioPJ aqui:
    //!!! Após colar o ToString, dará erro. É necessário apagar os atributos e adicionar o método
    // "super.getNome", por exemplo

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco().getRua() + //detalha o com o método .getRua() para diminuir
                //tamanho do endereço na impressão do console
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao=" + this.valorBonificacao + //é usado 'this.' pois referencia o atributo
                //criado dentro dessa própria classe
                '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        //adiciona a logica (expressao de calculo) para calcular a Bonificacao conforme abaixo:
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;

    }

    //cria atributo de Bonificacão acima, no ToString

    //Digita 'implements' ao lado do nome da classe Gerente, para implementar a interfacce e calcular
    //'valorBonificacao'
    //após inserir a interface, é necssário implementar o método, clicando. É gerado o 'Override' acima,
    //com os dados calcularBonificacao


}
