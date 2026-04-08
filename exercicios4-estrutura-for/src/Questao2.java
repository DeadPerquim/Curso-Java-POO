 void main(){
    int n = Integer.parseInt(IO.readln("Insira a quantidade de números a ser inseridos: "));
    int in = 0;
    int out = 0;

    for (int i = 1 ; i <= n  ; i++ ){
        int x = Integer.parseInt(IO.readln("Insira um numero inteiro: "));
        if (x>=10 && x<=20){
            in++;
        }
        else {
            out++;
        }

    }
     IO.println(in + " in\n" + out + " out");
}
