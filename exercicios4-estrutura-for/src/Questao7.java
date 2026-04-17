void main(){
    int n = Integer.parseInt(IO.readln("entre com um numero positivo: "));

    if (n > 0){
        for (int i = 1; i <= n; i++) {
            IO.print(i + " ");
            IO.print(Math.pow(i, 2) + " ");
            IO.println(Math.pow(i, 3));
        }
    }
}
