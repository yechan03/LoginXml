package com.example.disitalcontest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText name,makeid,makepw,checkpw;
    ImageView checkcircle1,checkcircle2,checkcircle3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.NAME);
        makeid = findViewById(R.id.sign_up_email);
        makepw = findViewById(R.id.sign_up_pwd);
        checkpw = findViewById(R.id.CheckPW);
        checkcircle1 = findViewById(R.id.CheckCircle1);
        checkcircle2 = findViewById(R.id.CheckCircle2);
        checkcircle3 = findViewById(R.id.CheckCircle3);


        name.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (name.getText().toString().length() == 0) {
                    checkcircle1.clearColorFilter();

                } else {
                    checkcircle1.setColorFilter(Color.rgb(14, 168, 40));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (name.getText().toString().length() == 0) {
                    checkcircle1.clearColorFilter();

                }
            }

        });

        makeid.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (makeid.getText().toString().length()==0){
                    checkcircle2.clearColorFilter();
                }
                else {

                    checkcircle2.setColorFilter(Color.rgb(14, 168, 40));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (makeid.getText().toString().length()==0){
                    checkcircle2.clearColorFilter();
                }

            }
        });

        makepw.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (makepw.getText().toString().length()==0){
                    checkcircle3.clearColorFilter();
                }
                else {

                    checkcircle3.setColorFilter(Color.rgb(14, 168, 40));
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (makepw.getText().toString().length()==0){
                    checkcircle3.clearColorFilter();
                }

            }
        });


    }
}
