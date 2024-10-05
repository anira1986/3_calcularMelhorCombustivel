/**
 *@author:<ANA PAULA DE OLIVEIRA SILVA>
 *RA1110482123028
 *ANA PAULA DE OLIVEIRA SILVA
 */

package br.edu.fateczl.melhorcombustivel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etGasolina;
    private EditText etEtanol;
    private TextView tvResultado;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etGasolina = findViewById(R.id.etGasolina);
        etGasolina.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        etEtanol = findViewById(R.id.etEtanol);
        etEtanol.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tvResultado = findViewById(R.id.tvResultado);
        tvResultado.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(op -> calcularMelhorCombustivel());
    }

    private void calcularMelhorCombustivel() {
        float gasolina = Float.parseFloat(etGasolina.getText().toString());
        float etanol = Float.parseFloat(etEtanol.getText().toString());
        String resultado;
        float vantagem = (etanol / gasolina);

        if (vantagem <= 0.7) {
            resultado = getString(R.string.resultado) + " Etanol";
        } else {
            resultado = getString(R.string.resultado) + " Gasolina";
        }

        tvResultado.setText(resultado);
    }
}
