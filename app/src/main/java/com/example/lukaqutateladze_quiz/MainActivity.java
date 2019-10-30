package com.example.lukaqutateladze_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startTest(View v) {
        EditText formElement = (EditText)findViewById(R.id.input_name);
        String name = formElement.getText().toString();

        Intent newActivity = new Intent(MainActivity.this , Activity2.class);
//        newActivity.putExtra("name", name);
        startActivity(newActivity);
    }

}
