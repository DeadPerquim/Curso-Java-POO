void main(){
    int a = Integer.parseInt(IO.readln("Informe o primeiro valor: "));
    int b = Integer.parseInt(IO.readln("Informe o segundo valor: "));

    if (a%b==0 || b%a==0){
        IO.println("Sao Multiplos");
    }
    else{
        IO.println("Nao sao Multiplos ");
    }
}
