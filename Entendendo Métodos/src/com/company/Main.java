package com.company;
public class Main {
    public static void main(String[] args) {
        //calculadora
        System.out.println("----- Exercicio da calculadora -----");
        Calculadora.soma(5, 5);
        Calculadora.subtracao(8,4);
        Calculadora.multiplicacao(5,4);
        Calculadora.divisao(5,5);

        //mensagem
        System.out.println("----- Exercicio da Mensagem -----");
        Mensagem.obterMensagem(11);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(23);

        //emprestimo
        System.out.println("----- Exercicio Emprestimo -----");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
