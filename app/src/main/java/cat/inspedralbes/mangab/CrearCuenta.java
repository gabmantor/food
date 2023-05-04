package cat.inspedralbes.mangab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v4.os.IResultReceiver;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public class CrearCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
    }

    public void onClickCrearCuenta(View view){

        EditText nombre = findViewById(R.id.editTextTextPersonName9);
        EditText email = findViewById(R.id.editTextTextPersonName3);
        EditText password1 = findViewById(R.id.editTextTextPersonName4);
        EditText password2 = findViewById(R.id.editTextTextPersonName8);
        EditText direccion = findViewById(R.id.editTextTextPersonName5);
        EditText numero = findViewById(R.id.editTextTextPersonName6);

        String textPassword1 = password1.getText().toString();
        String textPassword2 = password2.getText().toString();

        if(textPassword1.equals(textPassword2)){

            String textNombre = nombre.getText().toString();
            String textEmail = email.getText().toString();
            String textPassword = password1.getText().toString();
            String textDireccion = direccion.getText().toString();
            String textNumero = numero.getText().toString();

            try {

                HttpClient httpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost("http://gabriel.alumnes.inspedralbes.cat/crear.php?nickname"+textNombre+"&email="+textEmail+"&password="+textPassword+"&direccion"+textDireccion+"&numero"+textNumero);
                HttpResponse response = httpClient.execute(httpPost);


            }catch (Exception e){

                Toast.makeText(this, "ERROR CREACIO", Toast.LENGTH_SHORT).show();
            }

        }else{

            Toast.makeText(this, "ERROR PASSWORD", Toast.LENGTH_SHORT).show();
        }
    }
}