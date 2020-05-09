package br.com.hamaral.aplicacao.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.hamaral.aplicacao.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void transitToLogin(View view) {
        Toast.makeText(this, "Transitando de tela...", Toast.LENGTH_SHORT).show();
        Intent intentTela = new Intent(this, LoginActivity.class);
        startActivity(intentTela);
    }
}
