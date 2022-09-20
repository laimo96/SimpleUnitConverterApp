package com.example.simpleunitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textViewPounds);
        Button button = findViewById(R.id.buttonConvert);
        EditText editText = findViewById(R.id.editTextKG);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String kilograms = editText.getText().toString();

                // convert string into float
                float kilos = Float.parseFloat(kilograms);
                float pounds = (float) (kilos * 2.20462);

                // display result in the TextView
                textView.setText(""+pounds + " Lbs");
            }
        });


    }
}