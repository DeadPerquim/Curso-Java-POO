void main() {
    int n = Integer.parseInt(IO.readln("Escreva a quantidade de pares de números desejada: "));

    for (int i = 0; i < n; i++){
        double primeiroNumero = Double.parseDouble(IO.readln("Digite o primeiro numero: "));
        double segundoNumero = Double.parseDouble(IO.readln("Digite o segundo numero: "));

        double divisao = primeiroNumero/segundoNumero;
        if (segundoNumero == 0){
            IO.println("divisão impossivel");
        }else {
            System.out.printf("%.1f%n", divisao);
        }
    }
}
