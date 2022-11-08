package br.com.letscode.turmaitau.contaBancaria.conta;

import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.cliente.ClientePessoaJuridica;
import br.com.letscode.turmaitau.contaBancaria.validacoes.SaldoInvalidoException;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValorInvalidoException;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Conta {

    private String numero;
    private Cliente cliente;
    private BigDecimal saldo = BigDecimal.ZERO;

    public Conta(String numero) {
        this.numero = numero;
    }

    public Conta(String numero, Cliente cliente) {
        this(numero);
        this.cliente = cliente;
    }

    public abstract void depositar(BigDecimal valor) throws ValidacaoContaBancariaException;

    protected void adicionarSaldo(BigDecimal valor) throws ValidacaoContaBancariaException {
        this.validarValorNullOuNegativo(valor);
        this.saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valor) throws ValidacaoContaBancariaException {
        this.validarValorNullOuNegativo(valor);

        if (cliente instanceof ClientePessoaJuridica) {
            valor = valor.multiply(BigDecimal.valueOf(0.005)).add(valor);
        }

        if (this.getSaldo().compareTo(valor) < 0) {
            throw new SaldoInvalidoException("Saldo nao disponivel");
        }

        this.saldo = saldo.subtract(valor);
    }


    public void transferir(Conta contaDestino, BigDecimal valor) throws ValidacaoContaBancariaException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumero() {
        return numero;
    }

    private void validarValorNullOuNegativo(BigDecimal valor) throws ValorInvalidoException {
        if (Objects.isNull(valor) || valor.signum() < 0) {
            throw new ValorInvalidoException("Valor nao pode ser nagtivo ou nulo");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conta{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", cliente=").append(cliente);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numero, conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

}
