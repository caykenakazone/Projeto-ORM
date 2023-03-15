package com.iftm.api.helloworld;

import java.util.Date;

public class Aluno {
    private String nome;
    private int age;
    private Date date = new Date();


    // Construtor
    public Aluno(String nome, int age) {
        this.nome = nome;
        this.age = age;
    }
    // Construtor
    public Aluno(){

    }
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
