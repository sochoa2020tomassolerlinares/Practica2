package net.iessochoa.tomassolerlinares.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoRecetaActivity extends AppCompatActivity {

    public static final String EXTRA_RECETA_TITULO="net.iessochoa.tomassolerlinares.practica2.InfoRecetaActivity.EXTRA_RECETA_TITULO";
    public static final String EXTRA_RECETA_DESCRIPCION="net.iessochoa.tomassolerlinares.practica2.InfoRecetaActivity.EXTRA_RECETA_DESCRIPCION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_receta);
        //Recibe el intent y almacena los datos en los textviews de la actividad
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String titulo =(String) bundle.getCharSequence(EXTRA_RECETA_TITULO);
        String descripcion =(String) bundle.getCharSequence(EXTRA_RECETA_DESCRIPCION);

        TextView tvTitulo = findViewById(R.id.tvTitulo);
        TextView tvDescripcion = findViewById(R.id.tvDescripcionDatos);
        tvTitulo.setText(titulo);
        tvDescripcion.setText(descripcion);

    }
}