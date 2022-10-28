package br.com.letscode.turmaitau.carros;

import java.util.Objects;

/*
    Toda classe herda é filha da classe PAI Object
 */

public class Carro {

    //atributos
    String marca = null;
    String modelo;
    String placa;
    String cor;
    //se uso a classe Integer (classe wrapper de in) a inicializacao é sempre NULL
    Integer anoFabricacao = null;

    //se uso o primitivo a inicializacao é sempre "= false", é mesma coisa que "boolean ligado = false;"
    boolean ligado;

    //se uso o primitivo a inicializacao é sempre "= 0", é mesma coisa que "int velocidade = 0;"
    int velocidade;

    //metodo
    void ligar() {
        this.ligado = true;
    }

    void acelerar() {
        this.velocidade = this.velocidade + 10;
    }

    void imprimirToString() {
        System.out.println("this = " + this.toString()); //imprime o toString implementado nessa classe
        System.out.println("super = " + super.toString()); //imprime o toString da classe PAI Object
        System.out.println("hash this = " + this.hashCode()); //imprime o hashCode implementado nessa classe
        System.out.println("hash super = " + super.hashCode()); //imprime o hashCode da classe PAI Object
    }

    /*
        toString => representacao do estado do objeto em String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", placa='").append(placa).append('\'');
        sb.append(", cor='").append(cor).append('\'');
        sb.append(", anoFabricacao=").append(anoFabricacao);
        sb.append(", ligado=").append(ligado);
        sb.append(", velocidade=").append(velocidade);
        sb.append('}');
        return sb.toString();
    }

    /*
        hashCode => representacao do estado do objeto em hash
     */
    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, placa, cor, anoFabricacao);
    }

    /*
       equals => faz a comparacao dos estados entre dois objetos
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(placa, carro.placa) && Objects.equals(cor, carro.cor) && Objects.equals(anoFabricacao, carro.anoFabricacao);
    }

}
