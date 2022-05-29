package com.company;

public interface CalculaBonificacao { //nao é possivel gerar new em uma interface porque ela é abstract
    //interface é polimorfismo

    //cria bonificacao:
    void calculaBonificacao(Double porcentagemBonificacao); //para calcular a bonifiaccao, na regra de negoio
    //entre (), é dito que será necessário informar porcentagem através de porcentagemBonificacao.

    //essa interface foi criada porque toda classe que precisar calcular a Bonificacao, vai implementar essa
    //interface, para evitar repeticao de codigo.
    //para adicionar interface nas classes, é necessario digitar 'implements' ao lado do nome da classe




}
