package br.com.letscode.turmaitau.contaBancaria.conta;

import br.com.letscode.turmaitau.contaBancaria.cliente.Cliente;
import br.com.letscode.turmaitau.contaBancaria.validacoes.ValidacaoContaBancariaException;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numero) {
        super(numero);
    }

    public ContaCorrente(String numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public void depositar(BigDecimal valor) throws ValidacaoContaBancariaException {
        super.adicionarSaldo(valor);
    }

}
