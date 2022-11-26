package fr.epsi.gestion.webservices;

import fr.epsi.gestion.beans.Categorie;
import retrofit2.Call;
import retrofit2.http.GET;

public interface WebServicesInterface {

    @GET("categorie/listeAll")
    Call<Categorie[]> liste();
}
