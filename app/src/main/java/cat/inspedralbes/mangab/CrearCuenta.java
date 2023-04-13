package cat.inspedralbes.mangab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }

    public void onClickCrearCuenta(View view){

        EditText email = findViewById(R.id.editTextTextPersonName3);
        EditText password1 = findViewById(R.id.editTextTextPersonName4);
        EditText password2 = findViewById(R.id.editTextTextPersonName8);
        EditText direccion = findViewById(R.id.editTextTextPersonName5);
        EditText numero = findViewById(R.id.editTextTextPersonName6);

        String textPassword1 = password1.getText().toString();
        String textPassword2 = password2.getText().toString();

        if(textPassword1.equals(textPassword2)){

            String textEmail = email.getText().toString();
            String textPassword = password1.getText().toString();
            String textDireccion = direccion.getText().toString();
            String textNumero = numero.getText().toString();

        }else{

            Toast.makeText(this, "ERROR PASSWORD", Toast.LENGTH_SHORT).show();
        }
    }
}