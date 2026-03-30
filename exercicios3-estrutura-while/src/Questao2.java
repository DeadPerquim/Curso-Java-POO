void main(){
    int x = Integer.parseInt(IO.readln("Digite a coordenada X: "));
    int y = Integer.parseInt(IO.readln("Digite a coordenada Y: "));

    while(x != 0 && y != 0){
        if (x > 0 && y > 0) {
            IO.println("Primeiro");
        } else if(x < 0 && y > 0) {
            IO.println("Segundo");
        } else if(x < 0) {
            IO.println("Terceiro");
        }  else{
            IO.println("Quarto");
        }
            x = Integer.parseInt(IO.readln("Digite a coordenada X: "));
            y = Integer.parseInt(IO.readln("Digite a coordenada Y: "));
    }
}
