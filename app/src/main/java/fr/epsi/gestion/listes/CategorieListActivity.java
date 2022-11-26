package fr.epsi.gestion.listes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import fr.epsi.gestion.R;
import fr.epsi.gestion.adapters.CategorieAdapter;
import fr.epsi.gestion.api.CallApi;
import fr.epsi.gestion.beans.Categorie;
import fr.epsi.gestion.webservices.WebServicesInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CategorieListActivity extends AppCompatActivity {

   private RecyclerView categorie_recyclerView;

    private RecyclerView.Adapter categorie_adapter;

    private RecyclerView.LayoutManager categorie_layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie_list);

        System.out.println("*************************************************************");
        System.out.println("PUTIN J'EN MERDE CE PROJET SA ME CASSE LES COUILLES");

        categorie_recyclerView = findViewById(R.id.categorieRecyclerView);
        categorie_recyclerView.setHasFixedSize(true);

        categorie_layoutManager = new LinearLayoutManager(this);
        categorie_recyclerView.setLayoutManager(categorie_layoutManager);

        Categorie[] tab_categorie = {};

        categorie_adapter = new CategorieAdapter(tab_categorie);
        categorie_recyclerView.setAdapter(categorie_adapter);

        CallApi callApi = new CallApi();
        Call<Categorie[]> call_categorie = callApi.liste_categorie();
        call_categorie.enqueue(new Callback<Categorie[]>() {
            @Override
            public void onResponse(Call<Categorie[]> call, Response<Categorie[]> response) {


                System.out.println("*************************************************************");
                System.out.println("PUTIN J'EN MERDE CE PROJET SA ME CASSE LES COUILLES");

                Categorie[] tab_categorie = response.body();

                categorie_adapter = new CategorieAdapter(response.body());
                categorie_recyclerView.setAdapter(categorie_adapter);
            }

            @Override
            public void onFailure(Call<Categorie[]> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });

    }

   /* private void testRetrofit()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.27:8080/gamif/categorie/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WebServicesInterface webServicesInterface = retrofit.create(WebServicesInterface.class);
        Call<Categorie[]> tab_call_categorie = webServicesInterface.liste();

        tab_call_categorie.enqueue(new Callback<Categorie[]>() {
            @Override
            public void onResponse(Call<Categorie[]> call, Response<Categorie[]> response) {

                Categorie[] categories = response.body();

                categorie_adapter = new CategorieAdapter(categories);
                categorie_recyclerView.setAdapter(categorie_adapter);

                for (int i = 0; i < categories.length; i++)
                    System.out.println("Non**Categorie : " +categories[i].getNom()+ " Description**categorie " +categories[i].getDescription());
            }

            @Override
            public void onFailure(Call<Categorie[]> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }*/
}