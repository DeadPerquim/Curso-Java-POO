class Questao4{
    void main(){
        int numFuncionario = Integer.parseInt(IO.readln("Qual é o número do funcionário? "));
        int horasTrabalhadas = Integer.parseInt(IO.readln("Quantas horas trabalhou? "));
        double valorPorHorasTrabalhadas = Double.parseDouble((IO.readln("Qual é valor que o funcionário recebe por hora trabalhada? ")));

        double salario = horasTrabalhadas * valorPorHorasTrabalhadas;

        IO.println("Número: " + numFuncionario);
        IO.println("Salário: " + salario);
    }
}