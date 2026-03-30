void main(){
    IO.println("Posto de Combustíveis");
    IO.println("Tecle o código da gasolina desejada:");
    IO.println("1. Álcool");
    IO.println("2. Gasolina");
    IO.println("3. Diesel");
    IO.println("4. FIM");

    int codigo = Integer.parseInt(IO.readln("Digite seu codigo: "));
    int qtdAlcool = 0;
    int qtdGasolina = 0;
    int qtdDiesel = 0;

    while(codigo != 4){
        if (codigo == 1){
            IO.println("Abastecendo com Álcool");
            qtdAlcool += 1;
        }
        else if (codigo == 2){
            IO.println("Abastecendo com Gasolina");
            qtdGasolina += 1;
        }
        else if (codigo == 3){
            IO.println("Abastecendo com Diesel");
            qtdDiesel += 1;
        }
        else {
            IO.println("Esse código não existe. Tecle o código de 1-4 desejado");
        }
        codigo = Integer.parseInt(IO.readln("Digite seu codigo: "));
    }
    IO.println("MUITO OBRIGADO");
    IO.println("Álcool: " + qtdAlcool);
    IO.println("Gasolina: " + qtdGasolina);
    IO.println("Diesel: " + qtdDiesel);
}
