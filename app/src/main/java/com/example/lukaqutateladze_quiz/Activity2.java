package com.example.lukaqutateladze_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;
    RadioGroup radioGroup6;
    RadioGroup radioGroup7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    }

//    public void newActivity(View v){
//        int number = 555555555;
//        Uri uri = Uri.parse("smsto:"+number);
//        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
//        intent.putExtra("sms_body", "Succesfully Passed , Score: "+getIntent().getSerializableExtra("score")+"");
//        startActivity(intent);
//    }
    public void answerTest(View v){
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
        RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);
        RadioGroup rg4 = (RadioGroup) findViewById(R.id.radioGroup4);
        RadioGroup rg5 = (RadioGroup) findViewById(R.id.radioGroup5);
        RadioGroup rg6 = (RadioGroup) findViewById(R.id.radioGroup6);
        RadioGroup rg7 = (RadioGroup) findViewById(R.id.radioGroup7);

        final String value =((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        final String value2 =((RadioButton)findViewById(rg2.getCheckedRadioButtonId())).getText().toString();
        final String value3 =((RadioButton)findViewById(rg3.getCheckedRadioButtonId())).getText().toString();
        final String value4 =((RadioButton)findViewById(rg4.getCheckedRadioButtonId())).getText().toString();
        final String value5 =((RadioButton)findViewById(rg5.getCheckedRadioButtonId())).getText().toString();
        final String value6 =((RadioButton)findViewById(rg6.getCheckedRadioButtonId())).getText().toString();
        final String value7 =((RadioButton)findViewById(rg7.getCheckedRadioButtonId())).getText().toString();

        TextView theTextView = (TextView) findViewById(R.id.textView9);

        int val_1 = Integer.parseInt(value.toString());
        int val_2 = Integer.parseInt(value2.toString());
        int val_3 = Integer.parseInt(value3.toString());
        int val_4 = Integer.parseInt(value4.toString());
        int val_5 = Integer.parseInt(value5.toString());
        int val_6 = Integer.parseInt(value6.toString());
        int val_7 = Integer.parseInt(value7.toString());

        int count =0;

            if (val_1 == 9) {
                count += 1;
            }
            if (val_2 == 2) {
                count += 1;
            }
            if (val_3 == 50) {
                count += 1;
            }
            if (val_4 == 100) {
                count += 1;
            }
            if (val_5 == 16) {
                count += 1;
            }
            if (val_6 == 7) {
                count += 1;
            }
            if (val_7 == 7) {
                count += 1;
            }
            if (count > 5) {
                Toast.makeText(Activity2.this, "თქვენი ქულა: " + count + " - ჩააბარე !!!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(Activity2.this, "თქვენი ქულა: " + count + " - ჩაიჭერი !!!", Toast.LENGTH_LONG).show();
            }
            if (count > 5){
                int number = 555555555;
                Uri uri = Uri.parse("smsto:"+number);
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "თქვენი ტესტის ქულა: "+getIntent().getSerializableExtra("score")+count);
                startActivity(intent);
            }else{
                Intent newActivity = new Intent(Activity2.this , MainActivity.class);
                startActivity(newActivity);
            }
        }
    }
