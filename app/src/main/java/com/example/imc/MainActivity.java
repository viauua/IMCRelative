package com.example.imc;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnCalcularOnClick(View v){

        TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
        EditText edPeso = (EditText)findViewById(R.id.edPeso);
        EditText edAltura = (EditText)findViewById(R.id.edAltura);
        ImageView ImgIMC= (ImageView)findViewById(R.id.ImgIMC);

        int peso = Integer.parseInt(edPeso.getText().toString());
        float altura = Float.parseFloat(edAltura.getText().toString());

        float resultado = peso/ (altura*altura);
        if (resultado<18.5){
            lblResultado.setText("Abaixo do peso!");
            ImgIMC.setImageResource(R.drawable.abaixopeso);
        }else{
            if (resultado>=18.5 && resultado<=25){
                lblResultado.setText("Normal!");
                ImgIMC.setImageResource(R.drawable.normal);
            }else{
                if(resultado>=25 && resultado<30){
                    lblResultado.setText("Pré-Obesidade!");
                    ImgIMC.setImageResource(R.drawable.sobrepeso);
                }else{
                    if(resultado>=30 && resultado<35){
                        lblResultado.setText("Obesidade Grau 1!");
                        ImgIMC.setImageResource(R.drawable.obesidade1);
                    }else{
                        if(resultado>=35 && resultado<40){
                            lblResultado.setText("Obesidade Grau 2!");
                            ImgIMC.setImageResource(R.drawable.obesidade2);
                        }else{
                            lblResultado.setText("Obesidade Grau 3!");
                            ImgIMC.setImageResource(R.drawable.obesidade3);
                        }
                    }
                }
            }
        }
    }
}
