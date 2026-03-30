void main() {
    int senha = Integer.parseInt(IO.readln("Digite sua senha: "));

    while(senha != 2002){
        IO.println("Senha Invalida");
        senha = Integer.parseInt(IO.readln("Digite sua senha: "));
    }

    IO.println("Acesso Permitido");
}

