package com.company;

public class Main {

    public static void main(String[] args) {

       /*  // criar o objeto endereço
        Endereco endereco = new Endereco();
        //criar endereço atraves dos assessores:
        endereco.setRua("Endereço para essa rua");
        //imprime a rua com metodo assessor:
        System.out.println(endereco.getRua()); */

        //Endereço direto:
        Endereco endereco = new Endereco("Rua funcionario", "bairro funcionario","bairro funcionario");
        System.out.println("----");

        //Vendedor extendendo Funcionario CLT - criar vendedor
        Vendedor vendedor = new Vendedor();
        //informar dados do funcionario:
        vendedor.setNome("Nathally");
        vendedor.setDocumento("122.1222.123-23");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);

        //* System.out.println(vendedor);
        //imprimir com sout não funciona, é necessario criar um ToString na classe Vendedor
        System.out.println(vendedor);
        //agora, após criar o ToString para vendedor, é possível imprimir. Contudo, o campo Endereço ainda é
        //impresso com o numero da memória. É necessário criar o ToString na classe Endereço também

        System.out.println("----");

        //criar classe operadorDeCaixa
        //chama a classe operadorDeCaixa e cria o objeto abaixo:
        //declarando as informacoes entre parenteses

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Natalia Caixa", "122.1122.122.-31", 2000d, endereco);
        //criar método construtor para OperdadorDeCaixa na classe
        System.out.println(operadorDeCaixa);
        //imprimi acima
        System.out.println("----");

        //cria classe para FuncionarioPJ e preenche
        //cria classe para Gerente, filho do FuncionárioPJ

        //cria objeto Gerente
        Gerente gerente = new Gerente(); //quando não é criado construtor na classe (como em FuncionarioPJ),
            //é criado um construtor vazio, como aqui.
            gerente.setNome("Nathally Gerente");
            gerente.setDocumento("333.333.222.-11");
            gerente.setEndereco(endereco);
            gerente.setHorasTrabalhadas(20);
            gerente.setValorHora(100d);

            gerente.calculaRemuneracao();  //<< método adiionado conforme descrito abaixo
            gerente.calculaBonificacao(3d); //<< método adicionado conforme descrito abaixo e na interface CalculaBonificacao
        //é necessário informar a porcentagem entre ().

            //imprimi com endereço de memoria:
        System.out.println(gerente);
        //É necessário subescrever com o método ToString na classe Gerente para impressão correta no console,
        //conforme detalhado na classe Gerente
        //Adiciona atributo de Bonificação na classe Gerente

        //>> Quando impresso, o Gerente exibirá "valorRemuneracao=null, valorBonificacao=null", pois chamamos
        // o método "calculaRemuneracao" para exibir. para corrigir esse erro, é necessário adicionar o método
        //"calculaRemuneracao" acima.

        //*valorBonificacao: ainda aparecerá null no console. Necessário corrigir para calcular criando uma Interface.
        //cria Interface: new > class > seleciona interface CalculaBonificacao
        //chama o método CalculaBonificacao, adicionando acima.
        //implemente interface nas classes Gerente e Vendedor
        //adiciona o atributo na classe Vendedor
        //adicione acima, junto aos atributos do Vendedor, vendedor.calculaBonificacao()

    }
}
