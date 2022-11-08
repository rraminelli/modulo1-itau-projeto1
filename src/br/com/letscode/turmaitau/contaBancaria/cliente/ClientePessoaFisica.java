package br.com.letscode.turmaitau.contaBancaria.cliente;

public class ClientePessoaFisica extends Cliente {

    public ClientePessoaFisica(String nome, String cpf) {
        setNome(nome);
        this.cpf = cpf;
    }

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientePessoaFisica{");
        sb.append("cpf='").append(cpf).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
