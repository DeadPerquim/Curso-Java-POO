void main() {
    int x = Integer.parseInt(IO.readln("Entre com um valor inteiro: "));

    if (x<=1000){
        for (int i = 1; i <= x; i++){
            if (i % 2 != 0){
                IO.println(i);
            }
            }


    }
    else{
        IO.println(x + " é maior que 1000");
    }

}
