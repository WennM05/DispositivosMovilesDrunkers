package com.drunker.botonesverdes;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView TvRespuesta, TvColor ;
    private Button BtnRojo, BtnVerde, BtnAzul;
    private Random r;
    private int cont =0;
    private int red, green, blue;
    List<Integer> colors = new ArrayList<>();
    List<String> Words = new ArrayList<>();
    private Boolean isClicked,isClicked2,isClicked3 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.RED);

        Words.add("rojo");
        Words.add("verde");
        Words.add("azul");

        BtnRojo = (Button) findViewById(R.id.btRojo2);
        BtnVerde = (Button) findViewById(R.id.btnVerde2);
        BtnAzul = (Button) findViewById(R.id.btnAzul2);
        TvColor = (TextView) findViewById(R.id.TvColor);
        TvRespuesta = (TextView) findViewById(R.id.TvRespuesta);


        BtnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String word = randomWord();
                int color = randomColor();
                isClicked = true;
                if(TvColor.getCurrentTextColor() != color && TvColor.getText()!=word){
                    TvColor.setTextColor(color);
                    TvColor.setText(word);
                }else{
                    TvColor.setTextColor(randomColor());
                    TvColor.setText(randomWord());
                }
            }
        });



        BtnRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String word = randomWord();
                int color = randomColor();
                isClicked2 = true;
                if(TvColor.getCurrentTextColor() != color && TvColor.getText()!=word){
                    TvColor.setTextColor(color);
                    TvColor.setText(word);
                }else{
                    TvColor.setTextColor(randomColor());
                    TvColor.setText(randomWord());
                }
            }
        });

        BtnAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String word = randomWord();
                int color = randomColor();
                isClicked3 = true;
                if(TvColor.getCurrentTextColor() != color && TvColor.getText()!=word){
                    TvColor.setTextColor(color);
                    TvColor.setText(word);
                }else{
                    TvColor.setTextColor(randomColor());
                    TvColor.setText(randomWord());
                }
            }
        });
    }

     private void Juego(){
         boolean isText = Boolean.valueOf(randomWord());

    if(isClicked == isText || isClicked2 == isText || isClicked == isText) {
    cont = cont + 15;
       TvRespuesta.setText("1");


    }else{

        cont = cont -15;
        TvRespuesta.setText("2");
    }
        }







    private int randomColor(){
        Random rand = new Random();
        return colors.get(rand.nextInt(colors.size()));
    }
private String randomWord(){
     Random rand1= new Random();
     return  Words.get(rand1.nextInt(Words.size()));
}



}
