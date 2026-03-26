class Questao3 {
    void main() {
        int a = Integer.parseInt(IO.readln("Insira o Primeiro Número: "));
        int b = Integer.parseInt(IO.readln("Insira o Segundo Número: "));
        int c = Integer.parseInt(IO.readln("Insira o Terceiro Número: "));
        int d = Integer.parseInt(IO.readln("Insira o Quarto Número: "));

        int diferenca = (a * b - c * d);
        IO.println("a diferença é: " + diferenca);

    }
}