package br.com.lsdm.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonAbreTela2Click(View view) {
        Intent segundaTela = new Intent(this, SecondaryActivity.class);
        segundaTela.putExtra("parametro", "Valor que veio da primeira Tela");
        startActivity(segundaTela);
    }
}