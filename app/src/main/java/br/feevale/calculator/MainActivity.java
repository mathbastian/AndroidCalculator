package br.feevale.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtonListeners();
    }

    private void setButtonListeners(){
        Button button;
        View.OnClickListener listener;

        listener = new OperationsListener( (TextView) findViewById(R.id.textView) );

        button = findViewById(R.id.buttonAdd);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonSubtract);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonDivide);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonMultiply);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonResult);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonClear);
        button.setOnClickListener(listener);

        listener = new NumbersListener( (TextView) findViewById(R.id.textView) );

        button = findViewById(R.id.buttonNumber0);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonNumber1);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonNumber2);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonNumber3);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonNumber4);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonNumber5);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonNumber6);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonNumber7);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonNumber8);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonNumber9);
        button.setOnClickListener(listener);

        button = findViewById(R.id.buttonDot);
        button.setOnClickListener(listener);
    }
}