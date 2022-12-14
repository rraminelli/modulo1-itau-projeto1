package br.com.letscode.turmaitau.operacoes;

import br.com.letscode.turmaitau.interfaces.PrimeiraInterface;

import java.io.Serializable;

public class Tabuada extends Object implements OperacaoInterface, Serializable {

    public void realizarOperacao(double multiplicando, double limiteMultiplicador) {

        var multiplicar = new Multiplicar();

        for (int i = 0; i <= limiteMultiplicador; i++) {
            multiplicar.realizarOperacao(multiplicando, i);
        }

        /*int i = 0;
        while (i <= limiteMultiplicador) {
            System.out.printf("Resultado: %.2f x %.2f = %.2f %s ", multiplicando, i, (multiplicando * i), "!");
            i++;
        }*/


    }

}
