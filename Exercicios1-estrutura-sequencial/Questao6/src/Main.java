
void main() {
    double a = Double.parseDouble(IO.readln("Entre com o valor de A: "));
    double b = Double.parseDouble(IO.readln("Entre com o valor de B: "));
    double c = Double.parseDouble(IO.readln("Entre com o valor de C: "));

    double areaTrianguloRetangulo = (a * c)/ 2;
    double areaCirculo = Math.PI * Math.pow(c, 2);
    double areaTrapezio = ((a + b) * c)/ 2;
    double areaQuadrado = Math.pow(b, 2);
    double areaRetangulo = a * b;

    IO.println("TRIANGULO: " + areaTrianguloRetangulo);
    IO.println("CIRCULO: " + areaCirculo);
    IO.println("TRAPEZIO: " + areaTrapezio);
    IO.println("QUADRADO: " + areaQuadrado);
    IO.println("RETANGULO: " + areaRetangulo);

}
