package com.example.testui;

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
        Button button=findViewById(R.id.button2);
        EditText login=findViewById(R.id.editTextTextPersonName3);
        EditText haslo=findViewById(R.id.editTextTextPersonName4);
        TextView textView=findViewById(R.id.textView3);
TextView nazwa=findViewById(R.id.textView4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String log=login.getText().toString();
                String has=haslo.getText().toString();

                if (log.equals("admin") && has.equals("haslo")){
                    textView.setText(R.string.zalogowano);
                    textView.setVisibility(View.VISIBLE);
                    button.setVisibility(View.INVISIBLE);
                    nazwa.setVisibility(View.VISIBLE);
                    nazwa.setText("Witaj "+log);

                }

                else {
                    if (log.isEmpty() || has.isEmpty()) {
                        textView.setText(R.string.niewypelnione);
                        textView.setVisibility(View.VISIBLE);
                    }

                    else{

                        textView.setText("Bledne haslo lub login");

                    }
                }

            }
        });
    }
}