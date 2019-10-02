package com.isetkelibia.bonjournom;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.EditTextNom);
        textView = findViewById(R.id.TextViewBonjour);
        button = findViewById(R.id.ButtonEnvoyer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // textView.setText("Bonjour " + editText.getText() + " !");
                String message = getResources().getString(R.string.message) + " " + editText.getText() + " !";
                textView.setText(message);
            }
        });
    }
}
