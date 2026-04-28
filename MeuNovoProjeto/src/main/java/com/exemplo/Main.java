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

        double areaX = x.area();
        double areaY = y.area();

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
