package cat.inspedralbes.mangab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickCrearCuenta(View view){

        Intent intent = new Intent(this, CrearCuenta.class);
        startActivity(intent);
    }
    public void onClickIniciaSesion(View view){

        EditText email = findViewById(R.id.editTextTextPersonName);
        EditText password = findViewById(R.id.editTextTextPersonName2);

    }
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem menuItem){

        switch (menuItem.getItemId()){

            case R.id.plato:

                Intent intent = new Intent(this, Plato.class);
                startActivity(intent);

                return true;

            case R.id.receta:

                Intent intent2 = new Intent(this, Receta.class);
                startActivity(intent2);

                return true;

            case R.id.settings:

                return true;

            case R.id.salir:

                Intent intent4 = new Intent(this, MainActivity.class);
                startActivity(intent4);

                return true;

            default:

                return super.onOptionsItemSelected(menuItem);
        }
    }
}