package br.feevale.calculator;

import android.view.View;
import android.widget.TextView;

public class OperationsListener implements View.OnClickListener {

    TextView input;

    private double number;
    private Operation currentOperation;

    @Override
    public void onClick(View view) {
        switch (view.getId() ){
            case R.id.buttonAdd:
                updateCurrentOperationAndScreen( Operation.SUM );
                break;
            case R.id.buttonSubtract:
                updateCurrentOperationAndScreen( Operation.SUBTRACTION );
                break;
            case R.id.buttonDivide:
                updateCurrentOperationAndScreen( Operation.DIVISION );
                break;
            case R.id.buttonMultiply:
                updateCurrentOperationAndScreen( Operation.MULTIPLICATION );
                break;
            case R.id.buttonResult:
                calculateAndShowResult();
                break;
            case R.id.buttonClear:
                input.setText("");
                number = 0;
            default:
                break;
        }
    }

    public OperationsListener(TextView input){
        this.input = input;
    }

    private void updateCurrentOperationAndScreen(Operation operation ){
        if (number == 0){
            number = Double.parseDouble( input.getText().toString() );
            currentOperation = operation;
            input.setText("");
        }
        else{
            currentOperation = operation;
            double result = new Calculation(number, Double.parseDouble(input.getText().toString()), currentOperation).getResult();
            number = result;
            input.setText("");
        }
    }

    private void calculateAndShowResult(){
        if(number != 0) {
            double result = new Calculation(number, Double.parseDouble(input.getText().toString()), currentOperation).getResult();
            input.setText("" + result);
            number = 0;
        } else{
            input.setText( "" + number );
        }

    }

}
