void main() {
    int cod1 = Integer.parseInt(IO.readln("Insira o Codigo da peça 1: "));
    int qtd1 = Integer.parseInt(IO.readln("Insira a quantidade da peça 1: "));
    double vlr1 = Double.parseDouble(IO.readln("Insira o valor unitário da peça 1: "));
    int cod2 = Integer.parseInt(IO.readln("Insira o Codigo da peça 2: "));
    int qtd2 = Integer.parseInt(IO.readln("Insira a quantidade da peça 2"));
    double vlr2 = Double.parseDouble(IO.readln("Insira o valor unitário da peça 2: "));

    double total1 = qtd1 * vlr1;
    double total2 = qtd2 * vlr2;
    double totalfinal = total1 + total2;

    IO.println("VALOR A PAGAR: " + totalfinal);
}

