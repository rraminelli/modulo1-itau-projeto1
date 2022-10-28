package br.com.letscode.turmaitau.carros;

import java.util.Arrays;

public class CarroMain {

    public static void main(String[] args) {

        Carro audi = new Carro();
        audi.modelo = "A1";
        audi.marca = "Audi";
        audi.cor = "Branco";
        audi.anoFabricacao = 2020;
        audi.placa = "XYZ12345";
        audi.acelerar();

        Carro nissan = new Carro();
        nissan.modelo = "March";
        nissan.marca = "Nissan";
        nissan.cor = "Branco";
        nissan.anoFabricacao = 2020;
        nissan.placa = "ABC12345";
        nissan.acelerar();
        nissan.acelerar();

        System.out.println("audi = " + audi.toString());
        System.out.println("nissan = " + nissan);

        audi.modelo = "A2";
        nissan.modelo = "Versa";

        System.out.println("audi = " + audi);
        System.out.println("nissan = " + nissan);

        System.out.println( "audi = nissan? " + nissan.equals(audi) );

        Carro golBranco = new Carro();
        golBranco.modelo = new String("Gol");

        Carro golPreto = new Carro();
        golPreto.modelo = "Gol";

        System.out.println( "modelo golBranco = golPreto? " + (golPreto.modelo.equals(golBranco.modelo) ));

        Integer i1 = 1;
        Integer ii1 = new Integer("1");

        System.out.println("i1 = " + i1);
        System.out.println("ii1 = " + ii1);
        System.out.println("== " + (ii1.intValue() == i1.intValue()) );

        audi.imprimirToString();

    }

}
