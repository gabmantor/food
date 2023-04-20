package cat.inspedralbes.mangab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Pago extends AppCompatActivity {

    EditText credit = findViewById(R.id.editTextNumberPassword);
    EditText nif = findViewById(R.id.editTextTextPersonName7);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);
    }

    public void onClickCancelar(View view){

        Intent intent = new Intent(this, Plato.class);
        startActivity(intent);
    }
}