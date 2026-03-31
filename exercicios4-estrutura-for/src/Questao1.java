void main() {
    int x = Integer.parseInt(IO.readln("Entre com um valor inteiro: "));
    for (int i = 1; i <= x; i++){
        if (i % 2 != 0){
            IO.println(i);
        }
    }
}
