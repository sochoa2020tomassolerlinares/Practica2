package net.iessochoa.tomassolerlinares.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AgendaActivity extends AppCompatActivity {

    private TextView txtNuevoContacto;
    private EditText edtNombre;
    private EditText edtApellido;
    private EditText edtEmail;
    private EditText edtTelefono;
    private EditText edtNotas;

    private Button btnAceptar;
    private Button btnReiniciar;
    private Button btnSalir;

    @Override
    /**
     * Método encargado de generar los datos cuando se inicia la clase.
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        //Obtenemos una referencia a los controles de la interfaz
        txtNuevoContacto = (TextView) findViewById(R.id.txtNuevoContacto);

        edtNombre = (EditText)findViewById(R.id.edtNombreC);
        edtApellido = (EditText)findViewById(R.id.edtApellido);
        edtEmail = (EditText)findViewById(R.id.edtEmail);
        edtTelefono = (EditText)findViewById(R.id.edtTelefonoC);
        edtNotas = (EditText)findViewById(R.id.edtNotas);

        btnAceptar = (Button)findViewById(R.id.btnAceptar);
        btnReiniciar = (Button)findViewById(R.id.btnReiniciar);
        btnSalir = (Button)findViewById(R.id.btnSalir);
        //Implementamos el evento al hacer click en el botón Aceptar.
        btnAceptar.setOnClickListener(new View.OnClickListener(){
            @Override
            /**
             * Método que se inicia cuando se pulsa el botón Aceptar y se actualiza el titulo de la ventana a la unión de Nombre + Apellidos introducidos por el usuario.
             */
            public void onClick(View v) {
                txtNuevoContacto.setText(edtNombre.getText() + " "+edtApellido.getText());
            }
        });
        //Implementamos el evento al hacer click en el botón Reiniciar.
        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * Método que se inicia cuando se pulsa el botón Reiniciar y borra todos los datos de los campos introducidos anteriormente.
             */
            public void onClick(View v) {
                txtNuevoContacto.setText("Nuevo Contacto");
                edtNombre.setText("");
                edtApellido.setText("");
                edtEmail.setText("");
                edtTelefono.setText("");
                edtNotas.setText("");
            }
        });
        //Implementamos el evento al hacer click en el botón Salir.
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * Método que se inicia cuando se pulsa el botón de Salir y finaliza la ejecución de la clase actual.
             */
            public void onClick(View v) {
                finish();
            }
        });

    }


}