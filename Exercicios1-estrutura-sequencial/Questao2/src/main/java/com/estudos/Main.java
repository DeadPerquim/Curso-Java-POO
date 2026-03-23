package com.estudos;

public class Main{
    void main() {
        double raio = Double.parseDouble(IO.readln("Entre com o raio: "));
        double area = Math.PI * Math.pow(raio, 2);
        IO.println("A área é: " + area);
    }
}
