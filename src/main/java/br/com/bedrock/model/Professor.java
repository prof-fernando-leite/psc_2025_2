package br.com.bedrock.model;

import java.util.List;

public class Professor {
    private int id;
    private String nome;
    private String cpf;
    private List<String> disciplinas;
    private double salario;
    private double sal;

    public Professor(int id, String nome, String cpf, List<String> disciplinas) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.disciplinas = disciplinas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
