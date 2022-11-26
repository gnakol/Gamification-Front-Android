package fr.epsi.gestion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fr.epsi.gestion.listes.CategorieListActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToListeCategorie(View view)
    {
        Intent intent = new Intent(this, CategorieListActivity.class);
        startActivity(intent);
    }
}