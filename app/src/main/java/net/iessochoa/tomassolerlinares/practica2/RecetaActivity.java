package net.iessochoa.tomassolerlinares.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecetaActivity extends AppCompatActivity {
    TextView tvDescripcion;
    TextView tvIngredientes;
    TextView tvReceta;
    TextView tvTituloDesc;
    TextView tvTituloIngr;
    TextView tvTituloReceta;

    @Override
    /**
     * Método encargado de generar los datos cuando se inicia la clase.
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta);

        //Práctica opcional 1

        //Declaración de todos textview y definición de los clicklistener de estos
        tvDescripcion = findViewById(R.id.txtDescText);
        tvIngredientes = findViewById(R.id.txtIngDesc);
        tvReceta = findViewById(R.id.txtRecetaDesc);

        tvTituloDesc = findViewById(R.id.txtDescripcion);
        tvTituloIngr = findViewById(R.id.txtIngredientes);
        tvTituloReceta = findViewById(R.id.txtReceta);

        tvDescripcion.setOnClickListener(v -> lanzaDescripcion());
        tvIngredientes.setOnClickListener(v -> lanzaIngredientes());
        tvReceta.setOnClickListener(v -> lanzaReceta());
        tvTituloDesc.setOnClickListener(v -> lanzaDescripcion());
        tvTituloIngr.setOnClickListener(v -> lanzaIngredientes());
        tvTituloReceta.setOnClickListener(v -> lanzaReceta());
    }

    //Método que lanza un intent con la información de Descripción
    public void lanzaDescripcion(){
        Intent intent = new Intent(RecetaActivity.this, InfoRecetaActivity.class);
        intent.putExtra(InfoRecetaActivity.EXTRA_RECETA_TITULO, tvTituloDesc.getText());
        intent.putExtra(InfoRecetaActivity.EXTRA_RECETA_DESCRIPCION, tvDescripcion.getText());
        startActivity(intent);
    }

    //Método que lanza un intent con la información de Ingredientes
    public void lanzaIngredientes(){
        Intent intent = new Intent(RecetaActivity.this, InfoRecetaActivity.class);
        intent.putExtra(InfoRecetaActivity.EXTRA_RECETA_TITULO, tvTituloIngr.getText());
        intent.putExtra(InfoRecetaActivity.EXTRA_RECETA_DESCRIPCION, tvIngredientes.getText());
        startActivity(intent);
    }

    //Método que lanza un intent con la información de Receta
    public void lanzaReceta(){
        Intent intent = new Intent(RecetaActivity.this, InfoRecetaActivity.class);
        intent.putExtra(InfoRecetaActivity.EXTRA_RECETA_TITULO, tvTituloReceta.getText());
        intent.putExtra(InfoRecetaActivity.EXTRA_RECETA_DESCRIPCION, tvReceta.getText());
        startActivity(intent);
    }
}