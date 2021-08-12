package com.example.checkbox;

import static com.example.checkbox.R.id.chkdesenul;
import static com.example.checkbox.R.id.chkmuzica;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox muzica, desenul, jocul, bucataria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        muzica = (CheckBox) findViewById(chkmuzica);
        desenul = (CheckBox) findViewById(chkdesenul);
        jocul = (CheckBox) findViewById(R.id.chkJocul);
        bucataria = (CheckBox) findViewById(R.id.chkbucataria);
        Button btn = (Button) findViewById(R.id.getBTN);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Selectat";
                if (muzica.isChecked()) {
                    result += "\nMuzica";
                }
                if (jocul.isChecked()) {
                    result += "\nJocul";
                }
                if (bucataria.isChecked()) {
                    result += "\nBucataria";
                }
                if (desenul.isChecked()) {
                    result += "\nDesenul";
                }
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });
    }
    @SuppressLint("NonConstantResourceId")
    public  void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view) .isChecked();
        String str = "";
        switch (view.getId()){
            case chkmuzica:
                str =checked?"Selectat muzica":"Muzica deselectat";
                break;
            case chkdesenul:
                str =checked?"Selectat desenul":"Desenul deselectat";
                break;
            case R.id.chkJocul:
                str =checked?"Selectat jocul":"Jocul deselectat";
                break;
            case R.id.chkbucataria:
                str =checked?"Selectat bucataria":"Bucataria deselectat";
                break;

        }
        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
    }
}