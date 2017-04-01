package com.example.jim23.homework3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {

    Button back;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        input = (EditText) findViewById (R.id.editText);
        back = (Button) findViewById(R.id.button_back);
        back.setOnClickListener(sayhello);
    }

    private View.OnClickListener sayhello = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String input_str=input.getText().toString();

            if (input_str.length() == 0) {
                Toast.makeText(Main2Activity.this,
                        R.string.input_error,
                        Toast.LENGTH_SHORT).show();
                return;
            }else{
                Toast.makeText(Main2Activity.this,
                        input_str+" hello",
                        Toast.LENGTH_SHORT).show();
                finish();
                return;
            }
        }
    };
}