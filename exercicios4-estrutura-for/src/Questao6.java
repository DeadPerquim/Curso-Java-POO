void main() {
    int n = Integer.parseInt(IO.readln("Entre com um número onde será calculado seus divisores: "));

    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            IO.println(i);
        }
    }
}
