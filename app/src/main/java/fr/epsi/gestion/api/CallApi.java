package fr.epsi.gestion.api;

import fr.epsi.gestion.beans.Categorie;
import fr.epsi.gestion.webservices.WebServicesInterface;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CallApi {

    private static String baseUrl = "http://192.168.1.27:8080/gamif/";
    //private static String baseUrl = "http://localhost:8080/gamif/";

   private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

   private WebServicesInterface webServicesInterface = retrofit.create(WebServicesInterface.class);

   public Call<Categorie[]> liste_categorie()
   {
       return webServicesInterface.liste();
   }
}
