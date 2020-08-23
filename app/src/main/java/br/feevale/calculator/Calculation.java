package br.feevale.calculator;

public class Calculation {

    private double number1;
    private double number2;
    private Operation operation;

    public Calculation( double number1, double number2, Operation operation ){
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public double getResult(){
        switch (operation){
            case SUM:
                return number1 + number2;
            case SUBTRACTION:
                return number1 - number2;
            case MULTIPLICATION:
                return number1 * number2;
            case DIVISION:
                if(number2 != 0) {
                    return number1 / number2;
                }
            default:
                return 0;
        }
    }
}
