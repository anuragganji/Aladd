package com.example.aladd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addAmount(View v){
        EditText editText = findViewById(R.id.editText);
        int amount = Integer.parseInt(editText.getText().toString());
        TextView textView = findViewById(R.id.textView2);
        int totalAmount = Integer.parseInt(textView.getText().toString().split(" ")[3]);
        totalAmount+=amount;
        textView.setText("Total amount spent " + String.valueOf(totalAmount));
        editText.setText("");



    }
}
