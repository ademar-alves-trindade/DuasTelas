package br.com.lsdm.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        TextView textViewParametro = findViewById(R.id.textViewParametro);

        Intent intent = getIntent();
        String parametro = intent.getStringExtra("parametro");
        textViewParametro.setText(parametro);
    }

    public void buttonFechaTela(View view) {
        finish();
    }
}