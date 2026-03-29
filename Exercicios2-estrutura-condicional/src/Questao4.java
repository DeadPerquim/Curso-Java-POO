void main(){
    int hi = Integer.parseInt(IO.readln("Entre com a hora inicial: "));
    int hf = Integer.parseInt(IO.readln("Entre com a hora final: "));
    int duracao = 0;

    if (hi < hf){
        duracao = hf - hi;
    }
    else{
        duracao = (24 - hi) +hf;
    }

    IO.println("O JOGO DUROU " + duracao + " HORA(S)");
}
