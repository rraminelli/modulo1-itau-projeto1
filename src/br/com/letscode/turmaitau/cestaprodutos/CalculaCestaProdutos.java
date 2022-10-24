package br.com.letscode.turmaitau.cestaprodutos;

import br.com.letscode.turmaitau.cestaprodutos.enums.TipoPreco;

import java.util.Scanner;

public class CalculaCestaProdutos {

    private final static int QTDE_MAX_PRODUTOS = 5;

    Scanner scanner;
    RecuperarDadosProduto recuperarDadosProduto = null;

    String[] nomesProdutos;
    Double[] precosProdutos;
    Integer qtdeProdutos;

    public CalculaCestaProdutos() {

        this.scanner = new Scanner(System.in);

        this.recuperarDadosProduto = new RecuperarDadosProduto(scanner);

        this.nomesProdutos = new String[5];
        this.nomesProdutos[0] = "";
        this.nomesProdutos[1] = "";
        this.nomesProdutos[2] = "";
        nomesProdutos[3] = "";
        nomesProdutos[4] = "";
        //nomesProdutos[5] = ""; //ArrayIndexOutOfBoundsException

        this.precosProdutos = new Double[5];
        this.qtdeProdutos = Integer.parseInt("0");

        //System.out.println(qtdeProdutos);

    }

    public void recuperarDadosECalcular() {

        while (this.qtdeProdutos < QTDE_MAX_PRODUTOS) {

            this.nomesProdutos[qtdeProdutos] = recuperarDadosProduto.recuperarNome();
            this.precosProdutos[qtdeProdutos] = recuperarDadosProduto.recuperarPreco();

            System.out.println("Digite X para encerrar ou outra letra para continuar.");
            String letra = this.scanner.next();
            Boolean sair = letra.equalsIgnoreCase("X");

            /*
                "" => empty
                "       " => blank
             */

            //usa o valor e depois incrementa
            qtdeProdutos++; //qtdeProdutos = qtdeProdutos + 1;

            //incrementa e depois usa o valor ja incrementado
            //++qtdeProdutos;

            if (sair) {
                break;
            }

        }

        this.calcularProdutoMaisCaro();

        this.calcularProdutoMaisBarato();

    }

    private void calcularProdutoMaisCaro() {

        int indexProdutoMaisCaro = 0;

        for (int i = 0; i < this.qtdeProdutos; i++) {
            if (this.precosProdutos[i] > this.precosProdutos[indexProdutoMaisCaro]) {
                indexProdutoMaisCaro = i;
            }
        }

        this.imprimeProduto(indexProdutoMaisCaro, TipoPreco.CARO);

    }

    private void calcularProdutoMaisBarato() {

        int indexProdutoMaisBarato = 0;

        for (int i = 0; i < this.qtdeProdutos; i++) {
            if (this.precosProdutos[i] < this.precosProdutos[indexProdutoMaisBarato]) {
                indexProdutoMaisBarato = i;
            }
        }

        this.imprimeProduto(indexProdutoMaisBarato, TipoPreco.BARATO);

    }

    private void imprimeProduto(int index, TipoPreco tipoPreco) {

        System.out.printf("Produto mais %s: %s - R$ %.2f \n",
                tipoPreco.name(),
                this.nomesProdutos[index],
                this.precosProdutos[index]);

    }


}
