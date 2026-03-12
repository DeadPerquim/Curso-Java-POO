package com.estudos;

public class Main
{
    void main(){
        String nome = IO.readln("Qual é o seu nome? ");
        IO.println("Olá, " + nome + "!");


        int a = Integer.parseInt(IO.readln("Insira o numero: "));
        int b = Integer.parseInt(IO.readln("Insira outro número: "));

        int resultado = a+b;

        IO.println("O Resultado da soma é: " + resultado);

    }
}