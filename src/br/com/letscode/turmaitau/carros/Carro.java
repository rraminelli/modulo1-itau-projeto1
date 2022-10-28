package br.com.letscode.turmaitau.carros;

public class Carro {

    String marca = null;
    String modelo;
    String placa;
    String cor;
    Integer anoFabricacao = null;

    boolean ligado = false;
    int velocidade = 0;

    void ligar() {
        this.ligado = true;
    }

    void acelerar() {
        this.velocidade = this.velocidade + 10;
    }

    void imprimirToString() {
        System.out.println("this = " + this.toString());
        System.out.println("super = " + super.toString());
    }

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
}
