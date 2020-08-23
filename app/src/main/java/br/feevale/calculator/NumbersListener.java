package br.feevale.calculator;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NumbersListener implements View.OnClickListener {

    private TextView output;

    @Override
    public void onClick(View view) {
        Button button = (Button)view;
        output.append(button.getText());
    }

    public NumbersListener( TextView output ){
        this.output = output;
    }
}
