package net.iessochoa.tomassolerlinares.practica2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgendaConstraintActivity extends AppCompatActivity {

    EditText edtNombre;
    EditText edtTelefonoC;
    EditText edtCorreo;

    Button btnOk;
    Button btnCancel;

    @Override
    /**
     * Método encargado de generar los datos cuando se inicia la clase.
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_constraint);

        edtNombre = (EditText)findViewById(R.id.edtNombreC);
        edtTelefonoC = (EditText)findViewById(R.id.edtTelefonoC);
        edtCorreo = (EditText)findViewById(R.id.edtCorreo);

        btnOk = (Button)findViewById(R.id.btnOk);
        btnCancel = (Button)findViewById(R.id.btnCancel);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * Método que se incicia cuando se pulsa el botón Ok y muestra por pantalla el nombre introducido como un mensaje popup.
             */
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = edtNombre.getText();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * Método que se inicia cuando se pulsa el botón Cancel y finaliza la ejecución de la clase actual.
             */
            public void onClick(View v) {
                finish();
            }
        });
    }
}