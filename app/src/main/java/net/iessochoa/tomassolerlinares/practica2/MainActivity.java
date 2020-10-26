package net.iessochoa.tomassolerlinares.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Clase encargada de la ejecución del programa.
 */
public class MainActivity extends AppCompatActivity {

    private Button btnAgenda;
    private Button btnAgendaConstraint;
    private Button btnReceta;

    /**
     * Método encargado de generar los datos cuando se inicia la aplicación.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos una referencia a los botones de la interfaz.
        btnAgenda = (Button)findViewById(R.id.btnAgenda);
        btnAgendaConstraint = (Button)findViewById(R.id.btnAgendaConstraint);
        btnReceta = (Button)findViewById(R.id.btnReceta);

        //Implementamos el evento al hacer click en el botón Agenda.
        btnAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * Método que se ejecuta al hacer click en el botón Agenda y que ejecuta la clase Agenda.
             */
            public void onClick(View v) {
                Intent intent =
                        new Intent(MainActivity.this, AgendaActivity.class);
                startActivity(intent);
            }
        });
        //Implementamos el evento al hacer click en el botón Agenda-Constraint
        btnAgendaConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * Método que se ejecuta al hacer click en el botón Agenda-Constraint y que ejecuta la clase Agenda-Constraint.
             */
            public void onClick(View v) {
                Intent intent =
                        new Intent(MainActivity.this, AgendaConstraintActivity.class);
                startActivity(intent);
            }
        });

        //Implementamos el evento al hacer click en el botón Receta
        btnReceta.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * Método que se ejecuta al hacer click en el botón Receta y que ejecuta la clase Receta.
             */
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecetaActivity.class);
                startActivity(intent);
            }
        });
    }
}