package br.com.letscode.turmaitau.operacoes;

public class CriarOperacao {

    public OperacaoInterface criarOperacao(String tipo) {
        switch (tipo) {
            case "+":
                return new Somar();
            case "-":
                return new Subtrair();
            case "/":
                return new Dividir();
            case "x":
                return new Multiplicar();
            case "t":
                return new Tabuada();
            default:
                System.out.printf("Operador invalido!!!");
                break;
        }
        return null;
    }

}
