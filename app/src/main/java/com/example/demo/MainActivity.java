package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Step-2 : Declaring Views
    TextView textView;
    Button btn;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textViewy);
        btn=findViewById(R.id.btn1);
        editText=findViewById(R.id.editText1);

        // Adding the functionality

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editText.getText().toString();

                //Displaying the entered name

                Toast.makeText(MainActivity.this, "Hello "+name, Toast.LENGTH_LONG).show();
            }
        });

    }
}