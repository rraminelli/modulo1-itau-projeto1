package br.com.letscode.turmaitau;

import br.com.letscode.turmaitau.operacoes.CriarOperacao;
import br.com.letscode.turmaitau.operacoes.OperacaoInterface;

import java.util.Scanner;

public class CalculadoraMain {

// Testando pull request

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = entrada.nextDouble();

        System.out.println("Digite a operaçao: ");
        System.out.println("+ somar; - subtrair; / dividir; x multiplicar; t tabuada");

        String operador = entrada.next();

        OperacaoInterface operacaoInterface = new CriarOperacao().criarOperacao(operador);

        operacaoInterface.realizarOperacao(numero1, numero2);


    }

}
