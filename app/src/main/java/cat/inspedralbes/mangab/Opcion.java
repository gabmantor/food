package cat.inspedralbes.mangab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Opcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion);
    }
    public void onClickMenu(View view){

        Intent intent = new Intent(this, Plato.class);
        startActivity(intent);
    }
    public void onClickReceta(View view){

        Intent intent = new Intent(this, Receta.class);
        startActivity(intent);
    }
}