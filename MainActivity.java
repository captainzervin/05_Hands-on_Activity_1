package com.sebbygames.project_intellect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputA = (EditText) findViewById(R.id.inputA);
        EditText inputB = (EditText) findViewById(R.id.inputB);

        Button swap = (Button)findViewById(R.id.swapBtn);
        Button check = (Button)findViewById(R.id.compareBtn);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Screen2.class);
                String textA = inputA.getText().toString();
                String textB = inputB.getText().toString();
                i.putExtra("InputA", textA);
                i.putExtra("InputB", textB);
                startActivity(i);
            }
        });

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String trash = inputA.getText().toString();
                inputA.setText(inputB.getText().toString());
                inputB.setText(trash);
            }
        });



    }
}