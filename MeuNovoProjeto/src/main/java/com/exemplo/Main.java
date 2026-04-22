package com.exemplo;

public class Main {
    static void main(){

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        x.a = Double.parseDouble(IO.readln("Digite o lado A do triângulo X: "));
        x.b = Double.parseDouble(IO.readln("Digite o lado B do triângulo X: "));
        x.c = Double.parseDouble(IO.readln("Digite o lado C do triângulo X: "));

        y.a = Double.parseDouble(IO.readln("Digite o lado A do triângulo Y: "));
        y.b = Double.parseDouble(IO.readln("Digite o lado B do triângulo Y: "));
        y.c = Double.parseDouble(IO.readln("Digite o lado C do triângulo Y: "));

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangulo X area: %.4f%n", areaX);
        System.out.printf("Triangulo Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            IO.println("Larger area: X");
        }
        else {
            IO.println("Larger area: Y");
        }
    }
}
