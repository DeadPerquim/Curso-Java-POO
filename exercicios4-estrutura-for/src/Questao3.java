void main(){
    int n = Integer.parseInt(IO.readln("Entre com a quantidade de casos de teste"));

    for (int i = 0; i < n; i++){
        double valor1 = Double.parseDouble(IO.readln());
        double valor2 = Double.parseDouble(IO.readln());
        double valor3 = Double.parseDouble(IO.readln());

        double media = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5))/(2+3+5);
        System.out.printf("%.1f%n", media);
    }
}
