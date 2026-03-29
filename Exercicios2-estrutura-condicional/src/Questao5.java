void main(){
    IO.println("Cardápio:");
    IO.println("1 - Cachorro Quente - R$4.00");
    IO.println("2 - X-Salada - R$4.50");
    IO.println("3 - X-Bacon - R$5.00");
    IO.println("4 - Torrada simples - R$2.00");
    IO.println("5 - Refrigerante - R$1.50");

    int codigo = Integer.parseInt(IO.readln("Digite o codigo do produto: "));
    int qtd = Integer.parseInt(IO.readln("Digite a quantidade do produto: "));
    double total = 0;

    if (codigo == 1){
        total = qtd * 4;
    } else if (codigo == 2) {
        total = qtd * 4.5;
    }
    else if (codigo == 3) {
        total = qtd * 5;
    }
    else if (codigo == 4) {
        total = qtd * 2;
    }
    else if (codigo == 5) {
        total = qtd * 1.5;
    }
    else{
        IO.println("Nenhum produto está atribuido a este código. Por favor insira um número de 1 à 5");
    }
    IO.println("Total: R$ " + total);
}
