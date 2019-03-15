package com.example.a26145947.appexercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText alturaInput;
    private RadioGroup rdSexoInput;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alturaInput = findViewById(R.id.altura);
        rdSexoInput = findViewById(R.id.sexo);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void calcularPeso (View v){
        double altura = Double.parseDouble(alturaInput.getText().toString());

        int idRespEsco = rdSexoInput.getCheckedRadioButtonId();
        double peso = 0.0 ;

        if(idRespEsco == R.id.rdMasc) {
            peso = (72.7 * altura) - 58;
        }else if (idRespEsco == R.id.rdFem){
            peso = (62.1 * altura) - 44.7;
        }
    txtResultado.setText("Seu peso ideal é: " + peso + "kg");
    }

}
