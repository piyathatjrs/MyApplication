package com.example.piyathatcharoensak.myapplication;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.preference.EditTextPreference;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText NN  = findViewById(R.id.editTextone);
        final EditText SS = findViewById(R.id.editTexttwo);
        Button Cal = findViewById(R.id.Callculater_button);
        Button back = findViewById(R.id.black);
        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  float num1 = Integer.parseInt(NN.getText().toString());
                  float num2 = Integer.parseInt(SS.getText().toString());
                  float sum = 2f;
                  sum = num1 / ((num2/100)*(num2/100));
                  String str = String.valueOf(sum);
                AlertDialog.Builder Dai = new AlertDialog.Builder(MainActivity2.this);
                Dai.setTitle("ผลการคำนวณ");
                Dai.setMessage(str);
               Dai.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {


                   }
               });
               Dai.show();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity2.this , SCOTCH.class);
                startActivity(b);
            }
        });
        Button out = findViewById(R.id.out);
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
