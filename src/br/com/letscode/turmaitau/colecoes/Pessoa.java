package br.com.letscode.turmaitau.colecoes;

import java.util.Objects;

public class Pessoa implements Comparable {

    private String nome;

    public Pessoa(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public int compareTo(Object obj) {
        Pessoa pessoaObj = (Pessoa) obj;
        if (pessoaObj.getNome().length() > this.nome.length()) {
            return 1;
        } else if (pessoaObj.getNome().length() < this.nome.length()) {
            return -1;
        } else {
            return pessoaObj.getNome().compareTo(this.nome);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
