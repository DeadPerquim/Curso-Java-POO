void main(){
    int n = Integer.parseInt(IO.readln("Insira o número para que seja calculado o fatorial dele: "));

    long fatorial = 1;

    for (int i = 1; i <= n; i++) {
        fatorial *= i;
    }
    IO.println(fatorial);
}
