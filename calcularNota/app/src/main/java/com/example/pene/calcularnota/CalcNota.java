package com.example.pene.calcularnota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.DoubleBuffer;
import java.text.NumberFormat;

public class CalcNota extends AppCompatActivity {
private EditText etNota, etNota2, etNota3;
private Button btnNota;
private TextView tvNota;
  /* private double nota1;
    private double nota2;
    private double nota3;
    private double notaFinal;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_nota);
        tvNota=(TextView)findViewById(R.id.tvNota);
        btnNota=(Button)findViewById(R.id.btnNota);
        etNota=(EditText)findViewById(R.id.etNota);
        etNota2=(EditText)findViewById(R.id.etNota2);
        etNota3=(EditText)findViewById(R.id.etNota3);



        btnNota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    double nata1 = Double.parseDouble(etNota.getText().toString());
                    double nata2 = Double.parseDouble(etNota2.getText().toString());
                    double nata3 = Double.parseDouble(etNota3.getText().toString());

                if(nata1 <= 5 && nata1>=0 && nata2 <= 5 && nata2>=0  && nata3 <= 5 && nata3>=0 ) {

                    double nataFinal = nata1 * 0.3 + nata2 * 0.3 + nata3 * 0.4;
                    String nf = String.valueOf(nataFinal);
                    tvNota.setText("Tu nota final es " + nf);

                }else{
                    tvNota.setText("Haz introducido valores erroneos en las notas");
                }
            }
        });
    }
}
